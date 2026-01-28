package net.sadinity.wizardry.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.sadinity.wizardry.data.WizardryDataHolder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin implements WizardryDataHolder {

    private NbtCompound wizardryData;

    @Override
    public NbtCompound wizardry$getPersistentData() {
        if (wizardryData == null) {
            wizardryData = new NbtCompound();
        }
        return wizardryData;
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("HEAD"))
    private void wizardry$writeData(NbtCompound nbt, CallbackInfo ci) {
        if (wizardryData != null) {
            nbt.put("Wizardry", wizardryData);
        }
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("HEAD"))
    private void wizardry$readData(NbtCompound nbt, CallbackInfo ci) {
        if (nbt.contains("Wizardry")) {
            wizardryData = nbt.getCompound("Wizardry");
        }
    }
}
