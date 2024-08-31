package dev.mrzhang21626.materials.fluids;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import dev.mrzhang21626.GregicalityModern;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static dev.mrzhang21626.materials.Materials.*;

public class FluidMaterials {
    public static void init() {
        RocketFuelH8N4C2O4 = new Material.Builder(GregicalityModern.id("rocket_fuel_a"))
                .color(0x5ECB22).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Hydrogen, 8,
                        Nitrogen, 4,
                        Carbon, 2,
                        Oxygen, 4
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        CoalTarOil = new Material.Builder(GregicalityModern.id("coal_tar_oil"))
                .color(0xB5B553).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Carbon, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        SulfuricCoalTarOil = new Material.Builder(GregicalityModern.id("sulfuric_coal_tar_oil"))
                .color(0xFFFFAD).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        CoalTarOil, 1,
                        SulfuricAcid, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Anthracene = new Material.Builder(GregicalityModern.id("anthracene"))
                .color(0xA2ACA2).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Carbon, 14,
                        Hydrogen, 10
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Kerosene = new Material.Builder(GregicalityModern.id("kerosene"))
                .color(0xD570D5).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        MonoMethylHydrazine = new Material.Builder(GregicalityModern.id("monomethylhydrazine"))
                .color(0xFFFFFF).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Carbon, 1,
                        Hydrogen, 6,
                        Nitrogen, 2
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Hydrazine = new Material.Builder(GregicalityModern.id("hydrazine"))
                .color(0xFFFFFF).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Nitrogen, 2,
                        Hydrogen, 4
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        HydrogenPeroxide = new Material.Builder(GregicalityModern.id("hydrogen_peroxide"))
                .color(0xD1FFFF).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Hydrogen, 2,
                        Oxygen, 2
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        EthylAnthraQuinone = new Material.Builder(GregicalityModern.id("ethylanthraquinone"))
                .color(0xFFFF00).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Carbon, 16,
                        Hydrogen, 12,
                        Oxygen, 2
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        EthylAnthraHydroQuinone = new Material.Builder(GregicalityModern.id("ethylanthrahydroquinone"))
                .color(0xFFFF47).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        EthylAnthraQuinone, 1,
                        Hydrogen, 2
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        DenseHydrazineFuelMixture = new Material.Builder(GregicalityModern.id("dense_hydrazine_fuel_mixture"))
                .color(0x5E2B4A).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Hydrazine, 1,
                        Methanol, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        RocketFuelCN3H7O3 = new Material.Builder(GregicalityModern.id("rocket_fuel_b"))
                .color(0xBE46C5).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Carbon, 1,
                        Nitrogen, 3,
                        Hydrogen, 7,
                        Oxygen, 3
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        RP1RocketFuel = new Material.Builder(GregicalityModern.id("rocket_fuel_c"))
                .color(0xFF503C).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        RareEarth, 1,
                        Oxygen, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        RP1 = new Material.Builder(GregicalityModern.id("rp"))
                .color(0xFF6E5D).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        FermentationBase = new Material.Builder(GregicalityModern.id("fermentation_base"))
                .color(0x3D5917).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        LiquidHydrogen = new Material.Builder(GregicalityModern.id("liquid_hydrogen"))
                .color(0x3AFFC6).liquid(new FluidBuilder().temperature(14)).iconSet(MaterialIconSet.FLUID)
                .components(
                        Hydrogen, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PlatinumConcentrate = new Material.Builder(GregicalityModern.id("platinum_concentrate"))
                .color(Platinum.getMaterialRGB()).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Platinum, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PalladiumAmmonia = new Material.Builder(GregicalityModern.id("palladium_enriched_ammonia"))
                .color(Platinum.getMaterialRGB()).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Palladium, 1,
                        Ammonia, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        SodiumFormate = new Material.Builder(GregicalityModern.id("sodium_formate"))
                .color(0xFFAAAA).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Hydrogen, 1,
                        Carbon, 1,
                        Oxygen, 1,
                        Oxygen, 1,
                        Sodium, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        RhodiumSulfateSolution = new Material.Builder(GregicalityModern.id("rhodium_sulfate_solution"))
                .color(0xFFBB66).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        RhodiumSulfate, 1,
                        Water, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        RutheniumTetroxideSolution = new Material.Builder(GregicalityModern.id("ruthenium_tetroxide_solution"))
                .color(0xC7C7C7).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Salt, 2,
                        Ruthenium, 1,
                        Oxygen, 4
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        HotRutheniumTetroxideSolution = new Material.Builder(GregicalityModern.id("hot_ruthenium_tetroxide_solution"))
                .color(0xC7C7C7).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        RutheniumTetroxideSolution, 1,
                        Water, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        OsmiumSolution = new Material.Builder(GregicalityModern.id("osmium_solution"))
                .color((Osmium.getMaterialRGB() + Water.getMaterialRGB()) / 2).liquid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Osmium, 1,
                        Oxygen, 4,
                        Water, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        IridiumDioxide = new Material.Builder(GregicalityModern.id("iridium_dioxide"))
                .color((Iridium.getMaterialRGB() + Oxygen.getMaterialRGB()) / 2).dust().liquid().iconSet(MaterialIconSet.DULL)
                .components(
                        Iridium, 1,
                        Oxygen, 2
                ).flags(MaterialFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        AcidicIridiumSolution = new Material.Builder(GregicalityModern.id("acidic_iridium_solution"))
                .color(IridiumDioxide.getMaterialRGB() - 20).fluid().iconSet(MaterialIconSet.FLUID)
                .components(
                        HydrochloricAcid, 2,
                        IridiumDioxide, 2
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        RhodiumSaltSolution = new Material.Builder(GregicalityModern.id("rhodium_salt_solution"))
                .color(0x667788).fluid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Rhodium, 1,
                        Salt, 2,
                        Chlorine, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        RhodiumFilterCakeSolution = new Material.Builder(GregicalityModern.id("rhodium_filter_cake_solution"))
                .color(0x667788).fluid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Rhodium, 1,
                        Water, 2,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Diphenylisophtalate = new Material.Builder(GregicalityModern.id("diphenylisophtalate"))
                .color(0x246E57).fluid().iconSet(MaterialIconSet.DULL)
                .components(
                        Carbon, 20,
                        Hydrogen, 14,
                        Oxygen, 4
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        SodiumTungstate = new Material.Builder(GregicalityModern.id("sodium_tungstate"))
                .color(0x7a7777).fluid().iconSet(MaterialIconSet.FLUID)
                .components(
                        Sodium, 2,
                        Tungsten, 1,
                        Oxygen, 4
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        IodizedOil = new Material.Builder(GregicalityModern.id("iodized_oil"))
                .color(0x666666).fluid().iconSet(MaterialIconSet.FLUID).buildAndRegister();

    }
}
