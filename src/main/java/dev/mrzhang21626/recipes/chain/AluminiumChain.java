package dev.mrzhang21626.recipes.chain;

import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static dev.mrzhang21626.machines.RecipeTypes.*;
import static dev.mrzhang21626.materials.Materials.*;

public class AluminiumChain {
    public static void init(Consumer<FinishedRecipe> provider) {
        // 24[H2O + NaOH] + (TiO2)2Al16H10O29 -> [24H2O + 24NaOH + (TiO2)2Al16H10O29 + ?]
        MIXER_RECIPES.recipeBuilder("sodium_aluminate_from_bauxite")
                .inputItems(TagPrefix.dust, Bauxite, 39)
                .inputFluids(SodiumHydroxideSolution.getFluid(24000))
                .outputFluids(SodiumHydroxideBauxite.getFluid(24000))
                .duration(240).EUt(30).save(provider);

        //2[NaOH + H2O] + H2O + Al2O3 -> 2Na[Al(OH)4]
        MIXER_RECIPES.recipeBuilder("sodium_aluminate_from_aluminium_oxide")
                .inputItems(TagPrefix.dust, AluminiumOxide, 2)
                .inputFluids(SodiumHydroxideSolution.getFluid(3000))
                .outputFluids(SodiumAluminateSolution.getFluid(3000))
                .duration(240).EUt(30).save(provider);

        //2[NaOH + H2O] + 4H2O + 2Al -> 2Na[Al(OH)4] + 3H2
        CHEMICAL_RECIPES.recipeBuilder("sodium_aluminate_from_aluminium")
                .inputItems(TagPrefix.dust, Aluminium, 2)
                .inputFluids(SodiumHydroxideSolution.getFluid(2000))
                .inputFluids(Water.getFluid(2000))
                .outputFluids(SodiumAluminateSolution.getFluid(3000))
                .outputFluids(Hydrogen.getFluid(2000))
                .duration(240).EUt(30).save(provider);

        // [24H2O + 24NaOH + (TiO2)2Al16H10O29 + ?] = [4TiO2 + 16Al(OH)3 + 24NaOH + 5 H2O]
        FLUID_HEATER_RECIPES.recipeBuilder("impure_aluminium_hydroxide_solution")
                .circuitMeta(0)
                .inputFluids(SodiumHydroxideBauxite.getFluid(1000))
                .outputFluids(ImpureAluminiumHydroxideSolution.getFluid(1000))
                .duration(30).EUt(30).save(provider);

        // [4TiO2 + 16Al(OH)3 + 24NaOH + 5 H2O] + 9 H2O = 8 Red Mud [Contains Total: 4TiO2 + 24NaOH + 6 H2O] + 8 [2 Al(OH)3 + H2O]
        CHEMICAL_RECIPES.recipeBuilder("pure_aluminium_hydroxide_solution_from_impure")
                .inputFluids(Water.getFluid(9000))
                .inputFluids(ImpureAluminiumHydroxideSolution.getFluid(24000))
                .outputFluids(RedMud.getFluid(8000))
                .outputFluids(PureAluminiumHydroxideSolution.getFluid(16000))
                .duration(230).EUt(120).save(provider);

        //CO2 + Na[Al(OH)4] = Al(OH)3 + NaHCO3
        CHEMICAL_RECIPES.recipeBuilder("pure_aluminium_hydroxide_solution_from_sodium_aluminate")
                .inputFluids(SodiumAluminateSolution.getFluid(3000))
                .inputFluids(CarbonDioxide.getFluid(3000))
                .outputFluids(SodiumBicarbonateSolution.getFluid(3000))
                .outputItems(TagPrefix.dust, AluminiumHydroxide, 2);

        // [2 Al(OH)3 + H2O] = 2 Al(OH)3 + H2O
        CENTRIFUGE_RECIPES.recipeBuilder("aluminium_hydroxide_from_solution_1")
                .inputFluids(PureAluminiumHydroxideSolution.getFluid(1000))
                .circuitMeta(0)
                .outputItems(TagPrefix.dust, AluminiumHydroxide, 14)
                .duration(240).EUt(120).save(provider);

        // [2 Al(OH)3 + H2O] = 2 Al(OH)3 + H2O
        CENTRIFUGE_RECIPES.recipeBuilder("aluminium_hydroxide_from_solution_2")
                .inputFluids(PureAluminiumHydroxideSolution.getFluid(4000))
                .circuitMeta(1)
                .outputItems(TagPrefix.dust, AluminiumHydroxide, 56)
                .duration(240).EUt(120).save(provider);

        //2Al(OH)3 -> Al2O3 + 3H2O
        MUFFLE_FURNACE.recipeBuilder("aluminium_oxide")
                .inputItems(TagPrefix.dust, AluminiumHydroxide, 14)
                .outputItems(TagPrefix.dust, AluminiumOxide, 5)
                .outputFluids(Water.getFluid(3000))
                .duration(200).EUt(120).save(provider);

        // 2Al2O3 + Na3AlF6 -> 4Al + 3NaF + AlF3 + 6O
        ELECTROLYZER_RECIPES.recipeBuilder("aluminium_electrolyzing")
                .inputItems(TagPrefix.dust, AluminiumOxide, 10)
                .inputFluids(SodiumHexafluoroaluminate.getFluid(1000))
                .outputFluids(Oxygen.getFluid(6000))
                .outputItems(TagPrefix.dust, Aluminium, 4)
                .outputItems(TagPrefix.dust, SodiumFluoride, 6)
                .outputItems(TagPrefix.dust, AluminiumTrifluoride, 4)
                .duration(200).EUt(120).save(provider);

        // 3NaF + AlF3 -> Na3AlF6
        CHEMICAL_RECIPES.recipeBuilder("sodium_hexafluoroaluminate_recycling")
                .inputItems(TagPrefix.dust, SodiumFluoride, 6)
                .inputItems(TagPrefix.dust, AluminiumTrifluoride, 4)
                .outputFluids(SodiumHexafluoroaluminate.getFluid(1000))
                .duration(200).EUt(120).save(provider);

        // 6NaOH + Al2O3 + 12HF -> 2Na3AlF6 + 9H2O
        CHEMICAL_RECIPES.recipeBuilder("sodium_hexafluoroaluminate")
                .inputItems(TagPrefix.dust, SodiumHydroxide, 18)
                .inputItems(TagPrefix.dust, AluminiumOxide, 5)
                .inputFluids(HydrofluoricAcid.getFluid(12000))
                .outputFluids(SodiumHexafluoroaluminate.getFluid(2000))
                .outputFluids(Water.getFluid(9000))
                .duration(400).EUt(120).save(provider);

        // 8 Red Mud [Contains Total: 4TiO2 + 24 NaOH + 6 H2O] + 36 HCl = 8 Neutralized Mud [Contains Total: 4TiO2 + 24NaCl + 30 H2O + 12HCl]
        MIXER_RECIPES.recipeBuilder("neutralized_mud")
                .inputFluids(RedMud.getFluid(1000))
                .inputFluids(HydrochloricAcid.getFluid(4500))
                .outputFluids(NeutralisedRedMud.getFluid(2000))
                .duration(100).EUt(120).save(provider);

        // 8 Neutralized Mud [Contains Total: 4TiO2 + 24NaCl + 30 H2O + 12 HCl] = 4 Red Slurry [Contains Total: 4TiO2] + 4 Ferric REE Chloride [Contains Total: 12 HCl + 6 H2O] + 24 [NaCl + H2O]
        CENTRIFUGE_RECIPES.recipeBuilder("red_slurry")
                .inputFluids(NeutralisedRedMud.getFluid(2000))
                .outputFluids(RedSlurry.getFluid(1000))
                .outputFluids(FerricREEChloride.getFluid(1000))
                .outputFluids(SaltWater.getFluid(6000))
                .duration(100).EUt(120).save(provider);

        // 4 Ferric REE Chloride [Contains Total: 12 HCl + 6 H2O] = 2 Rare Earth Chlorides [Contains Total: REECl3 + 3 H2O] + 2 Iron III Chloride [Contains Total: FeCl3] + 6 H2O
        CENTRIFUGE_RECIPES.recipeBuilder("ferric_ree_chloride_to_rare_earth")
                .inputFluids(FerricREEChloride.getFluid(2000))
                .outputFluids(RareEarthChloridesSolution.getFluid(1000))
                .outputFluids(Iron3Chloride.getFluid(1000))
                .outputFluids(Water.getFluid(3000))
                .duration(320).EUt(480).save(provider);

        // 4 Red Slurry [Contains Total: 4TiO2] + 4 H2SO4 = 4 TiO(SO4) + 4H2O
        CHEMICAL_RECIPES.recipeBuilder("titanyl_sulfate")
                .inputFluids(RedSlurry.getFluid(2000))
                .inputFluids(SulfuricAcid.getFluid(2000))
                .outputFluids(TitanylSulfate.getFluid(2000))
                .outputFluids(Water.getFluid(2000))
                .duration(160).EUt(120).save(provider);

        // TiO(SO4) + 4HCl = TiCl4 + H2SO4 + H2O (water voided)
        CHEMICAL_RECIPES.recipeBuilder("titanium_tetrachloride")
                .inputFluids(TitanylSulfate.getFluid(1000))
                .inputFluids(HydrochloricAcid.getFluid(4000))
                .outputFluids(TitaniumTetrachloride.getFluid(1000))
                .outputFluids(SulfuricAcid.getFluid(2100))
                .duration(160).EUt(960);
    }
}
