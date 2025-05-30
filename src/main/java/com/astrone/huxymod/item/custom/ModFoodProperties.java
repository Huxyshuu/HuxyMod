package com.astrone.huxymod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).effect(new MobEffectInstance(MobEffects.INVISIBILITY, 400), 0.20f).build();

    public static final FoodProperties SUSPICIOUS_BOTTLE = new FoodProperties.Builder().nutrition(1).alwaysEdible().saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 1200, 2), 0.8f).effect(new MobEffectInstance(MobEffects.WEAKNESS, 1200, 3), 0.5f).usingConvertsTo(Items.GLASS_BOTTLE).build();

}
