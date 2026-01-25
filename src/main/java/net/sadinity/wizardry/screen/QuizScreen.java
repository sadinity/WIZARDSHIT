package net.sadinity.wizardry.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class QuizScreen extends Screen {

    /* =========================
       STATE
       ========================= */

    private int currentPage = 0;      // 0 = welcome, 1 = quiz
    private int currentQuestion = 0;  // index of current question

    /* =========================
       CLANS
       ========================= */

    public enum Clan {
        AIR,
        FIRE,
        WATER,
        EARTH
    }

    private final int[] clanScores = new int[Clan.values().length];

    /* =========================
       QUIZ DATA
       ========================= */

    private final String[] questions = {
            "When something unexpected disrupts your plans, what do you usually do?",
            "Which kind of place feels most comfortable to you?",
            "When you’re learning something new, what helps you the most?",
            "If tension rises in a group, what do you tend to do?",
            "What matters most to you in everyday life?",
            "How do you usually approach long-term goals?",
            "What role do you often end up with in a group?",
            "When you feel under pressure, what helps you most?",
            "What do you rely on most when making important decisions?",
            "What leaves you feeling most content at the end of the day?"
    };

    private final String[][] answers = {
            {
                    "Take a breath and figure out the best way forward",
                    "Keep going and make the most of the situation",
                    "Think about how it affects everyone involved",
                    "Slow down and make sure nothing falls apart"
            },
            {
                    "Somewhere that gives you space to think",
                    "A place where there’s always something happening",
                    "Somewhere that feels familiar and personal",
                    "A place that feels solid and dependable"
            },
            {
                    "Having the freedom to explore it your own way",
                    "Trying things out and seeing what works",
                    "Being able to talk it through",
                    "Having a clear structure to follow"
            },
            {
                    "Try to keep things from getting heavier",
                    "Address it directly so it doesn’t linger",
                    "Listen carefully to what everyone is feeling",
                    "Focus on what actually needs to be solved"
            },
            {
                    "Feeling mentally at ease",
                    "Feeling driven and engaged",
                    "Feeling connected to others",
                    "Feeling secure and prepared"
            },
            {
                    "Letting them take shape over time",
                    "Working on them intensely when motivation hits",
                    "Keeping in mind how they affect people around you",
                    "Building toward them step by step"
            },
            {
                    "The one who keeps things balanced",
                    "The one who gets things moving",
                    "The one people feel comfortable opening up to",
                    "The one who makes sure things get done"
            },
            {
                    "Taking a moment to regain perspective",
                    "Putting that pressure into action",
                    "Sharing the situation with someone you trust",
                    "Returning to what you know works"
            },
            {
                    "How things fit together in the bigger picture",
                    "Your instinct in the moment",
                    "How it feels for the people involved",
                    "What experience has taught you"
            },
            {
                    "Knowing your mind is at rest",
                    "Knowing you moved things forward",
                    "Knowing you were there for someone",
                    "Knowing things are taken care of"
            }
    };

    private final Clan[][] answerMapping = {
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH },
            { Clan.AIR, Clan.FIRE, Clan.WATER, Clan.EARTH }
    };

    /* =========================
       CONSTRUCTOR
       ========================= */

    public QuizScreen() {
        super(Text.literal("The Path"));
    }

    /* =========================
       INIT (BUTTONS)
       ========================= */

    @Override
    protected void init() {
        this.clearChildren();

        int centerX = this.width / 2;

        // Welcome page
        if (currentPage == 0) {
            this.addDrawableChild(
                    ButtonWidget.builder(
                            Text.literal("Continue"),
                            button -> goToQuestions()
                    ).dimensions(
                            centerX - 60,
                            this.height / 2 + 60,
                            120,
                            20
                    ).build()
            );
        }

        // Quiz questions
        if (currentPage == 1) {
            int startY = this.height / 2 + 0;
            int buttonWidth = 280;
            int spacing = 28;

            for (int i = 0; i < 4; i++) {
                int index = i;

                this.addDrawableChild(
                        ButtonWidget.builder(
                                Text.literal(answers[currentQuestion][i]),
                                button -> onAnswerSelected(index)
                        ).dimensions(
                                centerX - buttonWidth / 2,
                                startY + i * spacing,
                                buttonWidth,
                                20
                        ).build()
                );
            }
        }
    }

    /* =========================
       RENDER
       ========================= */

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);

        if (currentPage == 0) {
            renderWelcomePage(context);
        }

        if (currentPage == 1) {
            renderQuestionPage(context);
        }
    }

    private void renderWelcomePage(DrawContext context) {
        String title = "Your Path Is Not Yet Written";
        int titleWidth = this.textRenderer.getWidth(title);

        context.drawTextWithShadow(
                this.textRenderer,
                title,
                (this.width - titleWidth) / 2,
                this.height / 2 - 40,
                0xFFFFFF
        );

        Text intro = Text.literal(
                "Magic responds not to strength, but to intent. "
                        + "Answer the following questions honestly, "
                        + "and the path that suits you will reveal itself."
        );

        int startY = this.height / 2 - 10;

        for (var line : this.textRenderer.wrapLines(intro, 320)) {
            int w = this.textRenderer.getWidth(line);
            context.drawTextWithShadow(
                    this.textRenderer,
                    line,
                    (this.width - w) / 2,
                    startY,
                    0xAAAAAA
            );
            startY += 10;
        }
    }

    private void renderQuestionPage(DrawContext context) {
        Text questionText = Text.literal(questions[currentQuestion]);

        int maxWidth = 300;
        int lineHeight = 12;

        var lines = this.textRenderer.wrapLines(questionText, maxWidth);

        // Hoge vaste positie
        int startY = 40;

        for (var line : lines) {
            int w = this.textRenderer.getWidth(line);
            context.drawTextWithShadow(
                    this.textRenderer,
                    line,
                    (this.width - w) / 2,
                    startY,
                    0xFFFFFF
            );
            startY += lineHeight;
        }

        // Progress text (slechts één keer!)
        String progress = "Question " + (currentQuestion + 1) + " / " + questions.length;
        int pw = this.textRenderer.getWidth(progress);

        context.drawTextWithShadow(
                this.textRenderer,
                progress,
                (this.width - pw) / 2,
                startY + 6,
                0xAAAAAA
        );


    }


    /* =========================
       LOGIC
       ========================= */

    private void goToQuestions() {
        currentPage = 1;
        currentQuestion = 0;
        this.init();
    }

    private void onAnswerSelected(int answerIndex) {
        Clan clan = answerMapping[currentQuestion][answerIndex];
        clanScores[clan.ordinal()]++;

        currentQuestion++;

        if (currentQuestion >= questions.length) {
            finishQuiz();
        } else {
            this.init();
        }
    }

    private void finishQuiz() {
        Clan result = getResultClan();
        System.out.println("Quiz finished. Result: " + result);
        this.close();
    }

    private Clan getResultClan() {
        Clan best = Clan.AIR;
        int highest = -1;

        for (Clan clan : Clan.values()) {
            int score = clanScores[clan.ordinal()];
            if (score > highest) {
                highest = score;
                best = clan;
            }
        }

        return best;
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
