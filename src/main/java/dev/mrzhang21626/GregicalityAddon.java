package dev.mrzhang21626;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import dev.mrzhang21626.recipes.Recipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static dev.mrzhang21626.registries.Registrate.REGISTRATE;

@GTAddon
public class GregicalityAddon implements IGTAddon {
    @Override
    public GTRegistrate getRegistrate() {
        return REGISTRATE;
    }

    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return GregicalityModern.MOD_ID;
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        Recipes.init(provider);
        IGTAddon.super.addRecipes(provider);
    }
}
