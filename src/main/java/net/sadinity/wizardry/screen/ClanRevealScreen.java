package net.sadinity.wizardry.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.sound.SoundEvents;


public class ClanRevealScreen extends Screen {

    private long startTime;
    private static final float FADE_DURATION = 1000f;
    private float getFadeProgress() {
        float elapsed = System.currentTimeMillis() - startTime;
        return Math.min(elapsed / FADE_DURATION, 1.0f);
    }


    private final QuizScreen.Clan clan;

    public ClanRevealScreen(QuizScreen.Clan clan) {
        super(Text.literal("Your Path"));
        this.clan = clan;
    }

    @Override
    protected void init() {
        startTime = System.currentTimeMillis();

        playClanSound();

        int centerX = this.width / 2;

        this.addDrawableChild(
                ButtonWidget.builder(
                        Text.literal("Continue"),
                        button -> this.close()
                ).dimensions(
                        centerX - 60,
                        this.height - 50,
                        120,
                        20
                ).build()
        );
    }

    private void playClanSound() {
        if (this.client == null || this.client.player == null) return;

        switch (clan) {
            case AIR -> this.client.player.playSound(
                    SoundEvents.ENTITY_PHANTOM_FLAP,
                    1.0f,  // volume
                    1.2f   // pitch (iets hoger = luchtig)
            );

            case FIRE -> this.client.player.playSound(
                    SoundEvents.BLOCK_CAMPFIRE_CRACKLE,
                    1.0f,
                    1.0f
            );

            case WATER -> this.client.player.playSound(
                    SoundEvents.ENTITY_PLAYER_SPLASH,
                    1.0f,
                    0.9f
            );

            case EARTH -> this.client.player.playSound(
                    SoundEvents.BLOCK_ANCIENT_DEBRIS_HIT,
                    1.0f,
                    0.7f   // lager = zwaarder
            );
        }
    }




    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);

        float fade = getFadeProgress();
        int alphaTitle = (int)(fade * 255);
        int alphaText = (int)(fade * 200);

        // ===== Clan title (bold + bigger + fade) =====
        context.getMatrices().push();
        context.getMatrices().translate(this.width / 2.0, 80, 0);
        context.getMatrices().scale(1.5f, 1.5f, 1.0f);

        Text titleText = Text.literal(getClanTitle())
                .formatted(Formatting.BOLD);

        int titleWidth = this.textRenderer.getWidth(titleText);
        int titleColor = (alphaTitle << 24) | getClanColor();

        context.drawTextWithShadow(
                this.textRenderer,
                titleText,
                -titleWidth / 2,
                0,
                titleColor
        );

        context.getMatrices().pop();

        // ===== Flavor text (fade) =====
        Text flavor = Text.literal(getClanDescription());

        int y = 120;
        int textColor = (alphaText << 24) | 0xFFFFFF;

        for (var line : this.textRenderer.wrapLines(flavor, 300)) {
            int w = this.textRenderer.getWidth(line);
            context.drawTextWithShadow(
                    this.textRenderer,
                    line,
                    (this.width - w) / 2,
                    y,
                    textColor
            );
            y += 12;
        }
    }


    private String getClanTitle() {
        return switch (clan) {
            case AIR -> "Tempest Clan";
            case FIRE -> "Pyre Clan";
            case WATER -> "Tidal Clan";
            case EARTH -> "Geode Clan";
        };
    }

    private String getClanDescription() {
        return switch (clan) {
            case AIR -> "You walk the path of clarity and balance. The winds answer those who listen.";
            case FIRE -> "Your will burns bright. Power answers action, and hesitation is ash.";
            case WATER -> "You feel the unseen currents. Connection is your greatest strength.";
            case EARTH -> "You stand where others waver. Stability and patience shape your magic.";
        };
    }

    private int getClanColor() {
        return switch (clan) {
            case AIR -> 0x88CCFF;
            case FIRE -> 0xFF8844;
            case WATER -> 0x4466FF;
            case EARTH -> 0x66AA55;
        };
    }



    @Override
    public boolean shouldPause() {
        return false;
    }
}
