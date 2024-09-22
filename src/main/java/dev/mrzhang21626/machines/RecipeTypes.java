package dev.mrzhang21626.machines;

import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;

public class RecipeTypes {
    public static GTRecipeType MUFFLE_FURNACE = GTRecipeTypes.register("muffle_furnace", GTRecipeTypes.ELECTRIC)
            .setMaxIOSize(1, 3, 0, 3)
            .setSound(GTSoundEntries.FURNACE);

    public static void init(){}
}
