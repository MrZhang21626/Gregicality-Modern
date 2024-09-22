package dev.mrzhang21626.recipes;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class RemoveRecipes {
    public static void init(Consumer<ResourceLocation> consumer){
        consumer.accept(new ResourceLocation("gtceu:electrolyzer/bauxite_electrolysis"));
    }
}
