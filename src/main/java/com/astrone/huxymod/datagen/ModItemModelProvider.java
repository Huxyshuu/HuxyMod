package com.astrone.huxymod.datagen;

import com.astrone.huxymod.HuxyMod;
import com.astrone.huxymod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HuxyMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ALEXANDRITE.get());
        basicItem(ModItems.RAW_ALEXANDRITE.get());
        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.AURORA_ASHES.get());
        basicItem(ModItems.KOHLRABI.get());

        basicItem(ModItems.PP.get());
        basicItem(ModItems.SMALL_PP.get());
        basicItem(ModItems.SUSPICIOUS_BOTTLE.get());
    }
}
