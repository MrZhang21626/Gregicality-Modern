package dev.mrzhang21626.materials.dusts;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import dev.mrzhang21626.GregicalityModern;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static dev.mrzhang21626.materials.Materials.*;

public class DustMaterials {
    public static void init() {
        EglinSteelBase = new Material.Builder(GregicalityModern.id("eglin_steel_base"))
                .color(0x8B4513).iconSet(MaterialIconSet.SAND).dust(6)
                .components(
                        Iron, 4,
                        Kanthal, 1,
                        Invar, 5
                ).buildAndRegister();
        MicaBased = new Material.Builder(GregicalityModern.id("mica_based"))
                .color(0x917445).iconSet(MaterialIconSet.SAND).dust(1)
                .components(
                        GTMaterials.Mica, 3,
                        GTMaterials.RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        AluminoSilicateWool = new Material.Builder(GregicalityModern.id("alumino_silicate_wool"))
                .color(0xbbbbbb).iconSet(MaterialIconSet.SAND).dust(1)
                .components(
                        Aluminium, 2,
                        Silicon, 1,
                        Oxygen, 5
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PhthalicAnhydride = new Material.Builder(GregicalityModern.id("phthalic_anhydride"))
                .color(0xD1D1D1).iconSet(MaterialIconSet.SAND).dust().liquid()
                .components(
                        Carbon, 8,
                        Hydrogen, 4,
                        Oxygen, 3
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Dibismuthhydroborat = new Material.Builder(GregicalityModern.id("dibismuthhydroborat"))
                .color(0x00b749).iconSet(MaterialIconSet.SAND).dust()
                .components(
                        Bismuth, 2,
                        Hydrogen, 1,
                        Boron, 1
                ).buildAndRegister();
        BismuthTellurite = new Material.Builder(GregicalityModern.id("bismuth_tellurite"))
                .color(0x006b38).iconSet(MaterialIconSet.SAND).dust()
                .components(
                        Bismuth, 2,
                        Tellurium, 3
                ).buildAndRegister();
        YttriumOxide = new Material.Builder(GregicalityModern.id("yttrium_oxide"))
                .color(0xC6EBB3).iconSet(MaterialIconSet.SAND).dust()
                .components(
                        Yttrium, 2,
                        Oxygen, 3
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Zirkelite = new Material.Builder(GregicalityModern.id("zirkelite"))
                .color(0x6B5E6A).iconSet(MaterialIconSet.DULL).dust(4).ore()
                .components(
                        Calcium, 2,
                        Thorium, 2,
                        Cerium, 1,
                        Zirconium, 7,
                        Rutile, 6,
                        Niobium, 4,
                        Oxygen, 10
                ).buildAndRegister();
        PlatinumSalt = new Material.Builder(GregicalityModern.id("platinum_salt"))
                .color(GTMaterials.Platinum.getMaterialRGB()).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Platinum, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PlatinumSaltRefined = new Material.Builder(GregicalityModern.id("refined_platinum_salt"))
                .color(GTMaterials.Platinum.getMaterialRGB()).iconSet(MaterialIconSet.METALLIC).dust()
                .components(
                        Platinum, 1,
                        RareEarth, 1,
                        Chlorine, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PlatinumMetallicPowder = new Material.Builder(GregicalityModern.id("platinum_metallic_powder"))
                .color(GTMaterials.Platinum.getMaterialRGB()).iconSet(MaterialIconSet.METALLIC).dust().ore()
                .components(
                        Platinum, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PlatinumResidue = new Material.Builder(GregicalityModern.id("platinum_residue"))
                .color(0x64632E).iconSet(MaterialIconSet.ROUGH).dust()
                .components(
                        Iridium, 2,
                        RareEarth, 1,
                        RareEarth, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PlatinumRawPowder = new Material.Builder(GregicalityModern.id("reprecipitated_platinum"))
                .color(GTMaterials.Platinum.getMaterialRGB()).iconSet(MaterialIconSet.METALLIC).dust()
                .components(
                        Platinum, 1,
                        Chlorine, 2
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PalladiumMetallicPowder = new Material.Builder(GregicalityModern.id("palladium_metallic_powder"))
                .color(GTMaterials.Palladium.getMaterialRGB()).iconSet(MaterialIconSet.METALLIC).dust().ore()
                .components(
                        Palladium, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PalladiumRawPowder = new Material.Builder(GregicalityModern.id("reprecipitated_palladium"))
                .color(GTMaterials.Palladium.getMaterialRGB()).iconSet(MaterialIconSet.METALLIC).dust()
                .components(
                        Palladium, 1,
                        Ammonia, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PalladiumSalt = new Material.Builder(GregicalityModern.id("palladium_salt"))
                .color(GTMaterials.Palladium.getMaterialRGB()).iconSet(MaterialIconSet.METALLIC).dust()
                .components(
                        Palladium, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        SodiumSulfate = new Material.Builder(GregicalityModern.id("sodium_sulfate"))
                .color(0xFFFFFF).iconSet(MaterialIconSet.ROUGH).dust()
                .components(
                        Sodium, 2,
                        Sulfur, 1,
                        Oxygen, 4
                ).buildAndRegister();
        PotassiumDisulfate = new Material.Builder(GregicalityModern.id("potassium_disulfate"))
                .color(0xFBBB66).iconSet(MaterialIconSet.DULL).dust().liquid()
                .components(
                        Potassium, 2,
                        Sulfur, 2,
                        Oxygen, 7
                ).flags(MaterialFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES)
                .buildAndRegister();
        LeachResidue = new Material.Builder(GregicalityModern.id("leach_residue"))
                .color(0x644629).iconSet(MaterialIconSet.ROUGH).dust()
                .components(
                        Iridium, 2,
                        RareEarth, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        SodiumRuthenate = new Material.Builder(GregicalityModern.id("sodium_ruthenate"))
                .color(0x3A40CB).iconSet(MaterialIconSet.SHINY).dust()
                .components(
                        Sodium, 2,
                        Oxygen, 4,
                        Ruthenium, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PlatinumMetallicSludgeDustResidue = new Material.Builder(GregicalityModern.id("platinum_metallic_sludge_dust_residue"))
                .color((Copper.getMaterialRGB() + Nickel.getMaterialRGB()) / 2).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Copper, 1,
                        Nickel, 1
                ).flags(MaterialFlags.DECOMPOSITION_BY_CENTRIFUGING)
                .buildAndRegister();
        CrudeRhodiumMetal = new Material.Builder(GregicalityModern.id("crude_rhodium_metal"))
                .color(0x666666).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Rhodium, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        SodiumNitrate = new Material.Builder(GregicalityModern.id("sodium_nitrate"))
                .color(0x846684).iconSet(MaterialIconSet.ROUGH).dust()
                .components(
                        Sodium, 1,
                        Nitrogen, 1,
                        Oxygen, 3
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        RhodiumNitrate = new Material.Builder(GregicalityModern.id("rhodium_nitrate"))
                .color((SodiumNitrate.getMaterialRGB() + Rhodium.getMaterialRGB()) / 2).iconSet(MaterialIconSet.QUARTZ).dust()
                .components(
                        Rhodium, 1,
                        Nitrogen, 3,
                        Oxygen, 9
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister().setFormula("Rh(NO3)3", true);
        RhodiumFilterCake = new Material.Builder(GregicalityModern.id("rhodium_filter_cake"))
                .color(RhodiumNitrate.getMaterialRGB() - 10).iconSet(MaterialIconSet.QUARTZ).dust()
                .components(
                        Rhodium, 1,
                        RareEarth, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Triniite = new Material.Builder(GregicalityModern.id("triniite"))
                .color(0x5F5A76).iconSet(MaterialIconSet.SHINY).dust(7).ore()
                .components(
                        Trinium, 3,
                        Actinium, 3,
                        Selenium, 4,
                        Astatine, 4
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        SilverOxide = new Material.Builder(GregicalityModern.id("silver_oxide"))
                .color(0x4D4D4D).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Silver, 2,
                        Oxygen, 1
                ).buildAndRegister();
        SilverChloride = new Material.Builder(GregicalityModern.id("silver_chloride"))
                .color(0xFEFEFE).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Silver, 1,
                        Chlorine, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PotassiumMetabisulfite = new Material.Builder(GregicalityModern.id("potassium_metabisulfite"))
                .color(0xFFFFFF).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Potassium, 2,
                        Sulfur, 2,
                        Oxygen, 5
                ).buildAndRegister();
        LeadNitrate = new Material.Builder(GregicalityModern.id("lead_nitrate"))
                .color(0xFEFEFE).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Lead, 1,
                        Nitrogen, 2,
                        Oxygen, 6
                ).buildAndRegister();
        SodiumPotassiumAlloy = new Material.Builder(GregicalityModern.id("sodium_potassium_alloy"))
                .color(0x252525).iconSet(MaterialIconSet.SHINY).dust().liquid()
                .components(
                        Sodium, 7,
                        Potassium, 3
                ).buildAndRegister();
        SodiumFluoride = new Material.Builder(GregicalityModern.id("sodium_fluoride"))
                .color((Sodium.getMaterialRGB() + Fluorine.getMaterialRGB()) / 2).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Sodium, 1,
                        Fluorine, 1
                ).buildAndRegister();
        PotassiumFluoride = new Material.Builder(GregicalityModern.id("potassium_fluoride"))
                .color(0xFDFDFD).iconSet(MaterialIconSet.DULL).dust()
                .components(
                        Potassium, 1,
                        Fluorine, 1
                ).buildAndRegister();
        FLiNaKMixture = new Material.Builder(GregicalityModern.id("flinak_mixture"))
                .color(0x252525).iconSet(MaterialIconSet.DULL).liquid().dust()
                .components(
                        Fluorine, 3,
                        Lithium, 1,
                        Sodium, 1,
                        Potassium, 1
                ).buildAndRegister();
        FLiBeMixture = new Material.Builder(GregicalityModern.id("flibe_mixture"))
                .color(0x252525).iconSet(MaterialIconSet.DULL).liquid().dust()
                .components(
                        Fluorine, 3,
                        Lithium, 1,
                        Beryllium, 1
                ).buildAndRegister();
        OrganicFertilizer = new Material.Builder(GregicalityModern.id("organic_fertilizer"))
                .color(0xDDDDDD).iconSet(MaterialIconSet.SHINY).dust()
                .components(
                        Calcium, 5,
                        Phosphate, 3,
                        Hydrogen, 1,
                        Oxygen, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        CalciumTungstate = new Material.Builder(GregicalityModern.id("calcium_tungstate"))
                .color(0x6e6867).iconSet(MaterialIconSet.SHINY).dust(0)
                .components(
                        Tungsten, 1,
                        Calcium, 1,
                        Oxygen, 4
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        //TungsticAcid = new Material.Builder(GregicalityModern.id( "tungstic_acid",)).color(0xFFE700).dust().iconSet(MaterialIconSet.SHINY, 0, of(Hydrogen, 2), Tungsten, 1), Oxygen, 4)), DISABLE_DECOMPOSITION);
        TungstenTrioxide = new Material.Builder(GregicalityModern.id("tungsten_trioxide"))
                .color(0x99FF97).iconSet(Tungsten.getMaterialIconSet()).dust(0)
                .components(
                        Tungsten, 1,
                        Oxygen, 3
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        TungstenHexachloride = new Material.Builder(GregicalityModern.id("tungsten_hexachloride"))
                .color(0x533f75).iconSet(MaterialIconSet.METALLIC).dust(0)
                .components(
                        Tungsten, 1,
                        Chlorine, 6
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        NaquadricCompound = new Material.Builder(GregicalityModern.id("naquadric_compound"))
                .color(Naquadah.getMaterialRGB()).iconSet(Naquadah.getMaterialIconSet()).dust(Naquadah.getBlockHarvestLevel()).ore()
                //.components(Naquadah.getMaterialComponents())
                .buildAndRegister();
        EnrichedNaquadricCompound = new Material.Builder(GregicalityModern.id("enriched_naquadric_compound"))
                .color(NaquadahEnriched.getMaterialRGB()).iconSet(NaquadahEnriched.getMaterialIconSet()).dust(NaquadahEnriched.getBlockHarvestLevel()).ore()
                //.components(NaquadahEnriched.getMaterialComponents())
                .buildAndRegister();
        NaquadriaticCompound = new Material.Builder(GregicalityModern.id("naquadriatic_compound"))
                .color(Naquadria.getMaterialRGB()).iconSet(Naquadria.getMaterialIconSet()).dust(Naquadria.getBlockHarvestLevel()).ore()
                //.components(Naquadria.getMaterialComponents())
                .buildAndRegister();
        Caliche = new Material.Builder(GregicalityModern.id("caliche"))
                .color(0xeb9e3f).iconSet(MaterialIconSet.DULL).dust(3).ore()
                .components(
                        SodiumNitrate, 1,
                        Potassium, 1,
                        Nitrogen, 1,
                        Oxygen, 3,
                        RockSalt, 1,
                        Sodium, 1,
                        Iodine, 1,
                        Oxygen, 3
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Rhodocrosite = new Material.Builder(GregicalityModern.id("rhodocrosite"))
                .color(0xff6699).iconSet(MaterialIconSet.SHINY).dust().ore()
                .components(
                        Manganese, 1,
                        Carbon, 1,
                        Oxygen, 3
                ).buildAndRegister();
        Fluorite = new Material.Builder(GregicalityModern.id("fluorite"))
                .color(0x009933).iconSet(MaterialIconSet.SHINY).dust().ore()
                .components(
                        Calcium, 1,
                        Fluorine, 2
                ).buildAndRegister();
        Columbite = new Material.Builder(GregicalityModern.id("columbite"))
                .color(0xCCCC00).iconSet(MaterialIconSet.SHINY).dust()
                .components(
                        Iron, 1,
                        Niobium, 2,
                        Oxygen, 6
                ).buildAndRegister();
        //Pyrochlore = new Material.Builder(GregicalityModern.id( "pyrochlore",)).color(0x996633).dust().iconSet(MaterialIconSet.SHINY, 2, of(Calcium, 12), Strontium, 6), Barium, 6), RareEarth, 1), Thorium, 1), Uranium, 1), Niobium, 26), Oxygen, 78), Fluorine, 26)), GENERATE_ORE | DISABLE_DECOMPOSITION);
        Fluoroapatite = new Material.Builder(GregicalityModern.id("fluoroapatite"))
                .color(Apatite.getMaterialRGB()).iconSet(MaterialIconSet.DULL).dust().ore()
                .components(
                        Calcium, 5,
                        Phosphate, 3,
                        Fluorine, 1
                ).buildAndRegister();
        NeodymiumYttriumAluminumGarnet = new Material.Builder(GregicalityModern.id("neodymium_yttrium_aluminum_garnet"))
                .color(0xcf8acf).iconSet(MaterialIconSet.SHINY).dust(6).fluid()
                .buildAndRegister();
        PraseodymiumHolmiumYttriumLithiumFluoride = new Material.Builder(GregicalityModern.id("praseodymium_holmium_yttrium_lithium_fluoride"))
                .color(0x6f20af).iconSet(MaterialIconSet.SHINY).dust(6).fluid()
                .buildAndRegister();
        LutetiumThuliumYttriumVanadate = new Material.Builder(GregicalityModern.id("lutetium_thulium_yttrium_vanadate"))
                .color(0x206faf).iconSet(MaterialIconSet.SHINY).dust(6).fluid()
                .buildAndRegister();
        Barytocalcite = new Material.Builder(GregicalityModern.id("barytocalcite"))
                .color(0xbf9c7c).iconSet(MaterialIconSet.SHINY).dust().ore()
                .components(
                        Barium, 1,
                        Calcium, 1,
                        Carbon, 2,
                        Oxygen, 6
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Witherite = new Material.Builder(GregicalityModern.id("witherite"))
                .color(0xc6c29d).iconSet(MaterialIconSet.ROUGH).dust().ore()
                .components(
                        Barium, 1,
                        Carbon, 1,
                        Oxygen, 3
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Arsenopyrite = new Material.Builder(GregicalityModern.id("arsenopyrite"))
                .color(0xaa9663).iconSet(MaterialIconSet.METALLIC).dust().ore()
                .components(
                        Iron, 1,
                        Arsenic, 1,
                        Sulfur, 1
                ).buildAndRegister();
        Gallite = new Material.Builder(GregicalityModern.id("gallite"))
                .color(0x7f7b9e).iconSet(MaterialIconSet.SHINY).dust().ore()
                .components(
                        Copper, 1,
                        Gallium, 1,
                        Sulfur, 2
                ).buildAndRegister();
        Bowieite = new Material.Builder(GregicalityModern.id("bowieite"))
                .color(0x8b8995).iconSet(MaterialIconSet.ROUGH).dust().ore()
                .components(
                        Rhodium, 1,
                        Iridium, 1,
                        Platinum, 1,
                        Sulfur, 3
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        ;
        Celestine = new Material.Builder(GregicalityModern.id("celestine"))
                .color(0x9db1b8).iconSet(MaterialIconSet.SHINY).dust().ore()
                .components(
                        Strontium, 1,
                        Sulfur, 1,
                        Oxygen, 4
                ).buildAndRegister();

//        HydrogenPeroxide = new Material.Builder(GregicalityModern.id("hydrogen_peroxide"))
//                .color(0xcdffff).fluid()
//                .components(
//                        GTMaterials.Hydrogen, 2,
//                        GTMaterials.Oxygen, 2
//                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
//                .buildAndRegister();
//        LithiumHydride = new Material.Builder(GregicalityModern.id("lithium_hydride"))
//                .color(0x525296).iconSet(MaterialIconSet.SAND).dust()
//                .components(
//                        GTMaterials.Lithium, 1,
//                        GTMaterials.Hydrogen, 1
//                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
//                .buildAndRegister();
//        NiobiumChloride = new Material.Builder(GregicalityModern.id("niobium_chloride"))
//                .color(0x8c7fa1).iconSet(MaterialIconSet.SAND).dust()
//                .components(
//                        GTMaterials.Niobium, 1,
//                        GTMaterials.Chlorine, 5
//                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
//                .buildAndRegister();

    }
}
