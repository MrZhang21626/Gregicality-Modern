package dev.mrzhang21626.materials.ingots;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import dev.mrzhang21626.GregicalityModern;

import java.util.ArrayList;
import java.util.List;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static dev.mrzhang21626.materials.Materials.*;

public class IngotMaterials {
    public static final List<MaterialFlag> EXT3_METAL = new ArrayList<>();
    public static final List<MaterialFlag> CORE_METAL = new ArrayList<>();

    static {
        EXT3_METAL.addAll(EXT2_METAL);
        EXT3_METAL.add(MaterialFlags.GENERATE_FRAME);
        EXT3_METAL.add(MaterialFlags.GENERATE_FINE_WIRE);
        EXT3_METAL.add(MaterialFlags.GENERATE_FOIL);
        EXT3_METAL.add(MaterialFlags.GENERATE_DENSE);
        EXT3_METAL.add(MaterialFlags.GENERATE_GEAR);
        EXT3_METAL.add(MaterialFlags.GENERATE_SMALL_GEAR);

        CORE_METAL.addAll(EXT3_METAL);
        CORE_METAL.add(MaterialFlags.GENERATE_ROTOR);
        CORE_METAL.add(MaterialFlags.GENERATE_RING);
        CORE_METAL.add(MaterialFlags.GENERATE_SPRING);
        CORE_METAL.add(MaterialFlags.GENERATE_SPRING_SMALL);
    }

    public static void init() {
        EglinSteel = new Material.Builder(GregicalityModern.id("eglin_steel"))
                .color(0x8B4513).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(1048)
                .components(
                        EglinSteelBase, 10,
                        Sulfur, 1,
                        Silicon, 1,
                        Carbon, 1
                ).appendFlags(EXT3_METAL)
                .blastTemp(1048)
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME, null, 1048);
        Grisium = new Material.Builder(GregicalityModern.id("grisium"))
                .color(0x355D6A).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(3850)
                .components(
                        Titanium, 9,
                        Carbon, 9,
                        Potassium, 9,
                        Lithium, 9,
                        Sulfur, 9,
                        Hydrogen, 5
                ).appendFlags(EXT3_METAL)
                .blastTemp(3850)
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME, null, 3850);
        Inconel625 = new Material.Builder(GregicalityModern.id("inconel_a"))
                .color(0x80C880).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(2425)
                .components(
                        Nickel, 3,
                        Chromium, 7,
                        Molybdenum, 10,
                        Invar, 10,
                        Nichrome, 13
                ).appendFlags(EXT3_METAL)
                .blastTemp(2425)
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME, null, 2425);
        MaragingSteel250 = new Material.Builder(GregicalityModern.id("maraging_steel_a"))
                .color(0x92918D).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(2413)
                .components(
                        Steel, 16,
                        Molybdenum, 1,
                        Titanium, 1,
                        Nickel, 4,
                        Cobalt, 2
                ).appendFlags(EXT3_METAL)
                .blastTemp(2413)
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME, null, 2413);
        Staballoy = new Material.Builder(GregicalityModern.id("staballoy"))
                .color(0x444B42).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(3450)
                .components(
                        Uranium238, 9,
                        Titanium, 1
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(3450)
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME | DISABLE_DECOMPOSITION, null, 3450);
        HastelloyN = new Material.Builder(GregicalityModern.id("hastelloy_n"))
                .color(0xDDDDDD).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(4350)
                .components(
                        Yttrium, 2,
                        Molybdenum, 4,
                        Chromium, 2,
                        Titanium, 2,
                        Nickel, 15
                ).appendFlags(EXT3_METAL)
                .blastTemp(4350)
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME | GENERATE_DENSE, null, 4350);
        Tumbaga = new Material.Builder(GregicalityModern.id("tumbaga"))
                .color(0xFFB20F).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(1200)
                .components(
                        Gold, 7,
                        Bronze, 3
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(1200)
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME, null, 1200);
//        Stellite = new Material.Builder(GregicalityModern.id("stellite"))
//                .color(0x9991A5).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(4310)
//                .components(
//                        Cobalt, 9,
//                        Chromium, 9,
//                        Manganese, 5,
//                        Titanium, 2
//                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
//                .blastTemp(4310)
//                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME, null, 4310);
        Talonite = new Material.Builder(GregicalityModern.id("talonite"))
                .color(0x9991A5).iconSet(MaterialIconSet.SHINY).ingot(6).liquid(3454)
                .components(
                        Cobalt, 4,
                        Chromium, 3,
                        Phosphorus, 2,
                        Molybdenum, 1
                ).appendFlags(EXT3_METAL)
                .blastTemp(3454).buildAndRegister();
        MVSuperconductorBase = new Material.Builder(GregicalityModern.id("mv_superconductor_base"))
                .color(0x535353).iconSet(MaterialIconSet.SHINY).ingot(1).liquid(1200)
                .components(
                        Cadmium, 5,
                        Magnesium, 1,
                        Oxygen, 6
                ).cableProperties(GTValues.V[GTValues.MV], 4, 4)
                .appendFlags(STD_METAL)
                .blastTemp(1200)
                .buildAndRegister();
        HVSuperconductorBase = new Material.Builder(GregicalityModern.id("hv_superconductor_base"))
                .color(0x4a2400).iconSet(MaterialIconSet.SHINY).ingot(1).liquid(3300)
                .components(
                        Titanium, 1,
                        Barium, 9,
                        Copper, 10,
                        Oxygen, 20
                ).cableProperties(GTValues.V[GTValues.HV], 4, 4)
                .appendFlags(STD_METAL)
                .blastTemp(3300)
                .buildAndRegister();
        EVSuperconductorBase = new Material.Builder(GregicalityModern.id("ev_superconductor_base"))
                .color(0x005800).iconSet(MaterialIconSet.SHINY).ingot(1).liquid(4400)
                .components(
                        Uranium238, 1,
                        Platinum, 3
                ).cableProperties(GTValues.V[GTValues.EV], 4, 4)
                .appendFlags(STD_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(4400)
                .buildAndRegister();
        IVSuperconductorBase = new Material.Builder(GregicalityModern.id("iv_superconductor_base"))
                .color(0x300030).iconSet(MaterialIconSet.SHINY).ingot(1).liquid(5200)
                .components(
                        Vanadium, 1,
                        Indium, 3
                ).cableProperties(GTValues.V[GTValues.IV], 4, 4)
                .appendFlags(STD_METAL)
                .blastTemp(5200)
                .buildAndRegister();
        LuVSuperconductorBase = new Material.Builder(GregicalityModern.id("luv_superconductor_base"))
                .color(0x7a3c00).iconSet(MaterialIconSet.SHINY).ingot(1).liquid(6000)
                .components(
                        Indium, 4,
                        Bronze, 8,
                        Barium, 2,
                        Titanium, 1,
                        Oxygen, 14
                ).cableProperties(GTValues.V[GTValues.LuV], 4, 4)
                .appendFlags(STD_METAL)
                .blastTemp(6000)
                .buildAndRegister();
        ZPMSuperconductorBase = new Material.Builder(GregicalityModern.id("zpm_superconductor_base"))
                .color(0x111111).iconSet(MaterialIconSet.SHINY).ingot(1).liquid(8100)
                .components(
                        Naquadah, 4,
                        Indium, 2,
                        Palladium, 6,
                        Osmium, 1
                ).cableProperties(GTValues.V[GTValues.ZPM], 4, 4)
                .appendFlags(STD_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(4400)
                .buildAndRegister();
        MVSuperconductor = new Material.Builder(GregicalityModern.id("mv_superconductor"))
                .color(0x535353).iconSet(MaterialIconSet.SHINY).ingot(1)
                .components(
                        MVSuperconductorBase, 1
                ).cableProperties(GTValues.V[GTValues.MV], 4, 0, true)
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        HVSuperconductor = new Material.Builder(GregicalityModern.id("hv_superconductor"))
                .color(0x4a2400).iconSet(MaterialIconSet.SHINY).ingot(1)
                .components(
                        HVSuperconductorBase, 1
                ).cableProperties(GTValues.V[GTValues.MV], 4, 0, true)
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        EVSuperconductor = new Material.Builder(GregicalityModern.id("ev_superconductor"))
                .color(0x005800).iconSet(MaterialIconSet.SHINY).ingot(1)
                .components(
                        EVSuperconductorBase, 1
                ).cableProperties(GTValues.V[GTValues.EV], 4, 0, true)
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        IVSuperconductor = new Material.Builder(GregicalityModern.id("iv_superconductor"))
                .color(0x300030).iconSet(MaterialIconSet.SHINY).ingot(1)
                .components(
                        IVSuperconductorBase, 1
                ).cableProperties(GTValues.V[GTValues.IV], 4, 0, true)
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        LuVSuperconductor = new Material.Builder(GregicalityModern.id("luv_superconductor"))
                .color(0x7a3c00).iconSet(MaterialIconSet.SHINY).ingot(1)
                .components(
                        LuVSuperconductorBase, 1
                ).cableProperties(GTValues.V[GTValues.LuV], 4, 0, true)
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        ZPMSuperconductor = new Material.Builder(GregicalityModern.id("zpm_superconductor"))
                .color(0x111111).iconSet(MaterialIconSet.SHINY).ingot(1)
                .components(
                        ZPMSuperconductorBase, 1
                ).cableProperties(GTValues.V[GTValues.ZPM], 4, 0, true)
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Enderium = new Material.Builder(GregicalityModern.id("enderium"))
                .color(0x23524a).iconSet(MaterialIconSet.METALLIC).ingot(3).liquid(4500)
                .components(Lead, 3,
                        Platinum, 1,
                        EnderPearl, 1
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(4500)
                .toolStats(ToolProperty.Builder.of(8.0F, 3.0F, 1280, 3).build())
                .rotorStats(120,130,2.0f,320)
                .buildAndRegister();//, EXT2_METAL | DISABLE_DECOMPOSITION, null, 8.0F(damage), 3.0F, 1280, 4500);
        Nitinol60 = new Material.Builder(GregicalityModern.id("nitinol_a"))
                .color(0xCCB0EC).iconSet(MaterialIconSet.METALLIC).ingot(4).liquid(Titanium.getBlastTemperature())
                .components(
                        Nickel, 2,
                        Titanium, 3
                ).appendFlags(EXT3_METAL)
                .blastTemp(Titanium.getBlastTemperature())
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME, null, Titanium.blastFurnaceTemperature);
        BabbittAlloy = new Material.Builder(GregicalityModern.id("babbitt_alloy"))
                .color(0xA19CA4).iconSet(MaterialIconSet.METALLIC).ingot(4).liquid(737)
                .components(
                        Tin, 5,
                        Lead, 36,
                        Antimony, 8,
                        Arsenic, 1
                ).appendFlags(EXT3_METAL)
                .blastTemp(737)
                .buildAndRegister();
        HG1223 = new Material.Builder(GregicalityModern.id("hg_alloy"))
                .color(0x245397).iconSet(MaterialIconSet.METALLIC).ingot(4).liquid(5325)
                .components(
                        Mercury, 1,
                        Barium, 2,
                        Calcium, 2,
                        Copper, 3,
                        Oxygen, 8
                ).appendFlags(EXT3_METAL)
                .blastTemp(5325)
                .buildAndRegister();//, EXT2_METAL | GENERATE_FRAME | GENERATE_DENSE, null, 5325);
        ZirconiumCarbide = new Material.Builder(GregicalityModern.id("zirconium_carbide"))
                .color(0xFFDACD).iconSet(MaterialIconSet.SHINY).ingot().liquid(1200)
                .components(
                        Zirconium, 1,
                        Carbon, 1
                ).appendFlags(EXT3_METAL)
                .blastTemp(1200)
                .buildAndRegister();
        GoldAlloy = new Material.Builder(GregicalityModern.id("gold_alloy"))
                .color(0xBBA52B).iconSet(MaterialIconSet.SHINY).ingot()
                .components(
                        Copper, 3,
                        Gold, 1,
                        RareEarth, 1
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PreciousMetal = new Material.Builder(GregicalityModern.id("precious_metal"))
                .color(0xB99023).iconSet(MaterialIconSet.SHINY).ingot().ore()
                .components(
                        Gold, 1,
                        RareEarth, 1
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        LithiumFluoride = new Material.Builder(GregicalityModern.id("lithium_fluoride"))
                .color(0x757575).iconSet(MaterialIconSet.SHINY).ingot()
                .components(
                        Lithium, 1,
                        Fluorine, 1
                ).buildAndRegister(); //LithiumHydroxide + Hydrogen = LithiumFluoride
        BerylliumFluoride = new Material.Builder(GregicalityModern.id("beryllium_fluoride"))
                .color(0x757575).iconSet(MaterialIconSet.SHINY).ingot()
                .components(
                        Beryllium, 1,
                        Fluorine, 2
                ).buildAndRegister();
        LeadBismuthEutectic = new Material.Builder(GregicalityModern.id("lead_bismuth_eutatic"))
                .color(0x757575).iconSet(MaterialIconSet.SHINY).liquid()
                .components(
                        Lead, 3,
                        Bismuth, 7
                ).buildAndRegister();
        AbyssalAlloy = new Material.Builder(GregicalityModern.id("abyssal_alloy"))
                .color(0x9E706A).iconSet(MaterialIconSet.METALLIC).ingot(6).liquid(9625)
                .components(
                        StainlessSteel, 5,
                        TungstenCarbide, 5,
                        Nichrome, 5,
                        Bronze, 5,
                        IncoloyMA956, 5,
                        Iodine, 1,
                        Germanium, 1,
                        Radon, 1
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(9625)
                .buildAndRegister();
        ReactorSteel = new Material.Builder(GregicalityModern.id("reactor_steel"))
                .color(0xB4B3B0).iconSet(MaterialIconSet.SHINY).ingot()
                .components(
                        Iron, 15,
                        Niobium, 1,
                        Vanadium, 4,
                        Carbon, 2
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
//        Incoloy813 = new Material.Builder(GregicalityModern.id("incoloy813"))
//                .color(0x37bf7e).iconSet(MaterialIconSet.SHINY).ingot(2)
//                .components(
//                        VanadiumSteel, 4,
//                        Osmiridium, 2,
//                        Technetium, 3,
//                        Germanium, 4,
//                        Iridium, 7,
//                        Duranium, 5, Californium252.getMaterial()
//                        , 1), EXT2_METAL | GENERATE_FRAME | DISABLE_DECOMPOSITION,
//                null, 10000;
//        EnrichedNaquadahAlloy = new Material.Builder(GregicalityModern.id("enriched_naquadah_alloy"))
//                .color(0x403f3d).iconSet(MaterialIconSet.SHINY).ingot(2)
//                .components(
//                        NaquadahEnriched, 4,
//                        Rhodium, 2,
//                        Ruthenium, 2,
//                        Dubnium, 1,
//                        Rubidium, 2, Einsteinium255.getMaterial()
//                        , 1), EXT2_METAL | DISABLE_DECOMPOSITION | GENERATE_FRAME,
//                null, 10000;
//        HastelloyX78 = new Material.Builder(GregicalityModern.id("hastelloy_x78"))
//                .color(0x6ba3e3).iconSet(MaterialIconSet.SHINY).ingot(2)
//                .components(
//                        NaquadahAlloy, 10,
//                        Rhenium, 5,
//                        Naquadria, 4,
//                        Gadolinium, 3,
//                        Strontium, 2,
//                        Polonium, 3,
//                        Rutherfordium, 2, Fermium258.getMaterial()
//                        , 1), EXT2_METAL | GENERATE_FRAME | DISABLE_DECOMPOSITION,
//                null, 12300;
//        HastelloyK243 = new Material.Builder(GregicalityModern.id("hastelloy_k243"))
//                .color(0xa5f564).iconSet(MaterialIconSet.SHINY).ingot(2)
//                .components(
//                        HastelloyX78, 5,
//                        NiobiumNitride, 2,
//                        Tritanium, 4,
//                        TungstenCarbide, 4,
//                        Promethium, 4, Mendelevium261.getMaterial()
//                        , 1), EXT2_METAL | GENERATE_FRAME | DISABLE_DECOMPOSITION,
//                null, 12400;
        Polyetheretherketone = new Material.Builder(GregicalityModern.id("polyetheretherketone"))
                .color(0x403e37).iconSet(MaterialIconSet.DULL).ingot(2).liquid()
                .components(
                        Carbon, 20,
                        Hydrogen, 12,
                        Oxygen, 3
                ).appendFlags(EXT3_METAL, MaterialFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES, MaterialFlags.NO_SMASHING, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Zylon = new Material.Builder(GregicalityModern.id("zylon"))
                .color(0xFFE000).iconSet(MaterialIconSet.SHINY).ingot(2)
                .components(
                        Carbon, 14,
                        Hydrogen, 6,
                        Nitrogen, 2,
                        Oxygen, 2
                ).appendFlags(EXT3_METAL, MaterialFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES, MaterialFlags.NO_SMASHING, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        FullerenePolymerMatrix = new Material.Builder(GregicalityModern.id("fullerene_polymer_matrix"))
                .color(0x403e37).iconSet(MaterialIconSet.DULL).ingot(2)
                .components(
                        Palladium, 1,
                        Iron, 1,
                        Carbon, 153,
                        Hydrogen, 36,
                        Nitrogen, 1,
                        Oxygen, 2
                ).appendFlags(EXT3_METAL, MaterialFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES, MaterialFlags.NO_SMASHING, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        CarbonNanotubes = new Material.Builder(GregicalityModern.id("carbon_nanotubes"))
                .color(0x2c2c2c).iconSet(MaterialIconSet.SHINY).ingot(5)
                .components(
                        Carbon, 1
                ).appendFlags(EXT3_METAL, MaterialFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES, MaterialFlags.NO_SMASHING, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        BlackTitanium = new Material.Builder(GregicalityModern.id("black_titanium"))
                .color(0x6C003B).iconSet(MaterialIconSet.SHINY).ingot(7).liquid(11500)
                .components(
                        Titanium, 26,
                        Lanthanum, 6,
                        Tungsten, 4,
                        Cobalt, 3,
                        Manganese, 2,
                        Phosphorus, 2,
                        Palladium, 2,
                        Niobium, 1,
                        Argon, 5
                ).appendFlags(CORE_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .cableProperties(GTValues.V[GTValues.UIV], 2, 64)
                .blastTemp(11500)
                .buildAndRegister();
        TungstenTitaniumCarbide = new Material.Builder(GregicalityModern.id("tungsten_titanium_carbide"))
                .color(0x800d0d).iconSet(MaterialIconSet.SHINY).ingot(7).liquid(4422)
                .components(
                        TungstenCarbide, 7,
                        Titanium, 3
                ).appendFlags(CORE_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .cableProperties(GTValues.V[GTValues.UHV], 4, 32)
                .blastTemp(4422)
                .buildAndRegister();
//        TitanSteel = new Material.Builder(GregicalityModern.id("titan_steel"))
//                .color(0xAA0d0d).iconSet(MaterialIconSet.SHINY).ingot(7)
//                .components(
//                        TungstenTitaniumCarbide, 3,
//                        Jasper, 3), CORE_METAL | DISABLE_DECOMPOSITION,
//                null, 9200;
        Inconel792 = new Material.Builder(GregicalityModern.id("inconel_b"))
                .color(0x6CF076).iconSet(MaterialIconSet.SHINY).ingot(5).liquid(6200)
                .components(
                        Nickel, 2,
                        Niobium, 1,
                        Aluminium, 2,
                        Nichrome, 1
                ).appendFlags(CORE_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(6200)
                .buildAndRegister();
        Pikyonium = new Material.Builder(GregicalityModern.id("pikyonium"))
                .color(0x3467BA).iconSet(MaterialIconSet.SHINY).ingot(7).liquid(10400)
                .components(
                        Inconel792, 8,
                        EglinSteel, 5,
                        NaquadahEnriched, 4,
                        Cerium, 3,
                        Antimony, 2,
                        Platinum, 2,
                        Ytterbium, 1,
                        TungstenSteel, 4
                ).appendFlags(CORE_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .cableProperties(GTValues.V[GTValues.UEV], 4, 64)
                .blastTemp(10400)
                .buildAndRegister();
        Lafium = new Material.Builder(GregicalityModern.id("lafium"))
                .color(0x0d0d60).iconSet(MaterialIconSet.SHINY).ingot(7).liquid(9865)
                .components(
                        HastelloyN, 8,
                        Naquadah, 4,
                        Samarium, 2,
                        Tungsten, 4,
                        Argon, 2,
                        Aluminium, 6,
                        Nickel, 8,
                        Carbon, 2
                ).appendFlags(CORE_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(9865)
                .buildAndRegister();
        Cinobite = new Material.Builder(GregicalityModern.id("cinobite"))
                .color(0x010101).iconSet(MaterialIconSet.SHINY).ingot(5).liquid(11465)
                .components(
                        Zeron100, 8,
                        Naquadria, 4,
                        Gadolinium, 3,
                        Aluminium, 2,
                        Mercury, 1,
                        Tin, 1,
                        Titanium, 6,
                        Osmiridium, 1
                ).appendFlags(CORE_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .cableProperties(GTValues.V[GTValues.UIV], 4, 128)
                .blastTemp(11465)
                .buildAndRegister();
////        HDCS = new Material.Builder(GregicalityModern.id("hdcs"))
////                .color(0x334433).iconSet(MaterialIconSet.SHINY).ingot(5)
////                .components(
////                        TungstenSteel, 12,
////                        HSSS, 9,
////                        HSSG, 6,
////                        Ruridit, 3,
////                        MagnetoResonatic, 2,
////                        Plutonium, 1), CORE_METAL | DISABLE_DECOMPOSITION | GENERATE_ROUND,
////                null, 9900;
////        ProtoAdamantium = new Material.Builder(GregicalityModern.id("proto_adamantium"))
////                .color(0x4662d4).iconSet(MaterialIconSet.SHINY).ingot(7)
////                .components(
////                        Adamantium, 3,
////                        Promethium, 2), CORE_METAL,
////                null, 11244;
        TriniumTitanium = new Material.Builder(GregicalityModern.id("trinium_titanium"))
                .color(0x9986a3).iconSet(MaterialIconSet.SHINY).ingot(7).liquid(11000)
                .components(
                        Trinium, 2,
                        Titanium, 1
                ).appendFlags(CORE_METAL)
                .blastTemp(11465)
                .buildAndRegister();
        LithiumTitanate = new Material.Builder(GregicalityModern.id("lithium_titanate"))
                .color(0xfe71a9).iconSet(MaterialIconSet.SHINY).ingot(5).liquid(2500)
                .components(
                        Lithium, 2,
                        Titanium, 1,
                        Oxygen, 3
                ).appendFlags(CORE_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .cableProperties(GTValues.V[GTValues.UIV], 4, 128)
                .blastTemp(11465)
                .buildAndRegister();
        Titanium50 = new Material.Builder(GregicalityModern.id("titanium50"))
                .color(Titanium.getMaterialRGB()).iconSet(MaterialIconSet.SHINY).ingot(5)
                .components().buildAndRegister();
        ElectricallyImpureCopper = new Material.Builder(GregicalityModern.id("electrically_impure_copper"))
                .color(0x765A30).iconSet(MaterialIconSet.DULL).ingot(2)
                .components(
                        Copper, 1,
                        RareEarth, 1
                ).appendFlags(STD_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Polyurethane = new Material.Builder(GregicalityModern.id("polyurethane"))
                .color(0xeffcef).iconSet(MaterialIconSet.DULL).ingot(2)
                .components(
                        Carbon, 17,
                        Hydrogen, 16,
                        Nitrogen, 2,
                        Oxygen, 4
                ).appendFlags(EXT2_METAL, MaterialFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES, MaterialFlags.NO_SMASHING, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        ThoriumDopedTungsten = new Material.Builder(GregicalityModern.id("thoria_doped_tungsten"))
                .color(Tungsten.getMaterialRGB()).iconSet(MaterialIconSet.SHINY).ingot(2)
                .components(
                        Thorium, 1,
                        Tungsten, 9
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        WoodsGlass = new Material.Builder(GregicalityModern.id("woods_glass"))
                .color(0x730099).iconSet(MaterialIconSet.SHINY).ingot(2)
                .components(
                        SiliconDioxide, 1,
                        Barium, 1,
                        Oxygen, 1,
                        Garnierite, 1,
                        SodaAsh, 1
                ).appendFlags(STD_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        BariumTitanate = new Material.Builder(GregicalityModern.id("barium_titanate"))
                .color(0x99FF99).iconSet(MaterialIconSet.SHINY).ingot(2)
                .components(
                        Barium, 1,
                        Titanium, 1,
                        Oxygen, 3
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        TantalumHafniumSeaborgiumCarbide = new Material.Builder(GregicalityModern.id("tantalum_hafnium_seaborgium_carbide"))
                .color(0x2c2c2c).iconSet(MaterialIconSet.SHINY).ingot(6).liquid(5200)
                .components(
                        Tantalum, 12,
                        Hafnium, 3,
                        Seaborgium, 1,
                        Carbon, 16
                ).appendFlags(EXT2_METAL, MaterialFlags.EXCLUDE_BLOCK_CRAFTING_RECIPES, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        BismuthRuthenate = new Material.Builder(GregicalityModern.id("bismuth_ruthenate"))
                .color(0x94cf5c).iconSet(MaterialIconSet.DULL).ingot(2)
                .components(
                        Bismuth, 2,
                        Ruthenium, 2,
                        Oxygen, 7
                ).appendFlags(EXT2_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        BismuthIridiate = new Material.Builder(GregicalityModern.id("bismuth_iridiate"))
                .color(0x478a6b).iconSet(MaterialIconSet.DULL).ingot(7)//22
                .components(
                        Bismuth, 2,
                        Iridium, 2,
                        Oxygen, 7
                ).appendFlags(EXT2_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        PEDOT = new Material.Builder(GregicalityModern.id("pedot"))
                .color(0x5cef20).iconSet(MaterialIconSet.DULL).ingot(7)//22
                .components(
                        Carbon, 6,
                        Hydrogen, 6,
                        Oxygen, 2,
                        Sulfur, 1
                ).appendFlags(EXT3_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                                .buildAndRegister();
        RutheniumDioxide = new Material.Builder(GregicalityModern.id("ruthenium_dioxide"))
                .color(RutheniumTetroxide.getMaterialRGB()).iconSet(MaterialIconSet.DULL).ingot(2)
                .components(
                        Ruthenium, 1,
                        Oxygen, 2
                ).appendFlags(EXT2_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        GermaniumTungstenNitride = new Material.Builder(GregicalityModern.id("germanium_tungsten_nitride"))
                .color(0x8f8fcf).iconSet(MaterialIconSet.DULL).ingot(2).liquid(5400)
                .components(
                        Germanium,3,
                        Tungsten,3,
                        Nitrogen,10
                ).appendFlags(EXT2_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(5400)
                .buildAndRegister();
        LithiumNiobate = new Material.Builder(GregicalityModern.id("lithium_niobate"))
                .color(0xcfcf3a).iconSet(MaterialIconSet.SHINY).ingot(6).liquid(6700)
                .components(
                        Lithium, 1,
                        Niobium, 1,
                        Oxygen, 4
                ).appendFlags(EXT2_METAL, MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(6700)
                .buildAndRegister();
        HeavyQuarkDegenerateMatter = new Material.Builder(GregicalityModern.id("heavy_quark_degenerate_matter"))
                .color(0x5dbd3a).iconSet(MaterialIconSet.SHINY).ingot(6).liquid(13000)
                .components().appendFlags(CORE_METAL)
                .blastTemp(13000)
                .buildAndRegister();
//        SuperheavyHAlloy = new Material.Builder(GregicalityModern.id("superheavy_h_alloy"))
//                .color(0xE84B36).iconSet(MaterialIconSet.SHINY).ingot(6)
//                .components(
//                        Copernicium, 1,
//                        Nihonium, 1,
//                        MetastableFlerovium, 1,
//                        Moscovium, 1,
//                        Livermorium, 1, Tennessine,1),
//                MetastableOganesson, 1), GENERATE_PLATE | DISABLE_DECOMPOSITION,
//                null, 10600;
//        SuperheavyLAlloy = new Material.Builder(GregicalityModern.id("superheavy_l_alloy"))
//                .color(0x2B45DF).iconSet(MaterialIconSet.SHINY).ingot(6)
//                .components(
//                        Rutherfordium, 1,
//                        Dubnium, 1,
//                        Seaborgium, 1,
//                        Bohrium, 1,
//                        MetastableHassium, 1, Meitnerium,1),
//                Roentgenium, 1), GENERATE_PLATE | DISABLE_DECOMPOSITION,
//                null, 10600;
        QCDMatter = new Material.Builder(GregicalityModern.id("qcd_confined_matter"))
                .color(0xeb9e3f).iconSet(MaterialIconSet.SHINY).ingot(7).liquid(13100)
                .components().appendFlags(EXT3_METAL,MaterialFlags.NO_WORKING,MaterialFlags.NO_SMELTING,MaterialFlags.NO_SMASHING)
                .blastTemp(13100)
                .buildAndRegister();
                //, GENERATE_PLATE | DISABLE_REPLICATION | NO_WORKING | NO_SMELTING | NO_SMASHING | GENERATE_FRAME | GENERATE_ROD, null, 13100;
//        Periodicium = new Material.Builder(GregicalityModern.id("periodicium"))
//                .color(0x3d4bf6).iconSet(MaterialIconSet.SHINY).ingot(6)
//                .components(
//                        Hydrogen, 1,
//                        Helium, 1,
//                        Lithium, 1,
//                        Beryllium, 1,
//                        Boron, 1,
//                        Carbon, 1,
//                        Nitrogen, 1,
//                        Oxygen, 1,
//                        Fluorine, 1,
//                        Neon, 1,
//                        Sodium, 1,
//                        Magnesium, 1,
//                        Aluminium, 1,
//                        Silicon, 1,
//                        Phosphorus, 1,
//                        Sulfur, 1,
//                        Chlorine, 1,
//                        Argon, 1,
//                        Potassium, 1,
//                        Calcium, 1,
//                        Scandium, 1,
//                        Titanium, 1,
//                        Vanadium, 1,
//                        Chrome, 1,
//                        Manganese, 1,
//                        Iron, 1,
//                        Cobalt, 1,
//                        Nickel, 1,
//                        Copper, 1,
//                        Zinc, 1,
//                        Gallium, 1,
//                        Germanium, 1,
//                        Arsenic, 1,
//                        Selenium, 1,
//                        Bromine, 1,
//                        Krypton, 1,
//                        Rubidium, 1,
//                        Strontium, 1,
//                        Yttrium, 1,
//                        Zirconium, 1,
//                        Niobium, 1,
//                        Molybdenum, 1,
//                        Technetium, 1,
//                        Ruthenium, 1,
//                        Rhodium, 1,
//                        Palladium, 1,
//                        Silver, 1,
//                        Cadmium, 1,
//                        Indium, 1,
//                        Tin, 1,
//                        Antimony, 1,
//                        Tellurium, 1,
//                        Iodine, 1,
//                        Xenon, 1,
//                        Caesium, 1,
//                        Barium, 1,
//                        Lanthanum, 1,
//                        Cerium, 1,
//                        Praseodymium, 1,
//                        Neodymium, 1,
//                        Promethium, 1,
//                        Samarium, 1,
//                        Europium, 1,
//                        Gadolinium, 1,
//                        Terbium, 1,
//                        Dysprosium, 1,
//                        Holmium, 1,
//                        Erbium, 1,
//                        Thulium, 1,
//                        Ytterbium, 1,
//                        Lutetium, 1,
//                        Hafnium, 1,
//                        Tantalum, 1,
//                        Tungsten, 1,
//                        Rhenium, 1,
//                        Osmium, 1,
//                        Iridium, 1,
//                        Platinum, 1,
//                        Gold, 1,
//                        Mercury, 1,
//                        Thallium, 1,
//                        Lead, 1,
//                        Bismuth, 1,
//                        Polonium, 1,
//                        Astatine, 1,
//                        Radon, 1,
//                        Francium, 1,
//                        Radium, 1,
//                        Actinium, 1,
//                        Thorium, 1, Protactinium.getMaterial()
//                        , 1,
//                        Uranium, 1, Neptunium.getMaterial()
//                        , 1,
//                        Plutonium, 1,
//                        Americium, 1, Curium.getMaterial()
//                        , 1, Berkelium.getMaterial()
//                        , 1, Californium.getMaterial()
//                        , 1, Einsteinium.getMaterial()
//                        , 1, Fermium.getMaterial()
//                        , 1, Mendelevium.getMaterial()
//                        , 1,
//                        Rutherfordium, 1,
//                        Dubnium, 1,
//                        Seaborgium, 1,
//                        Bohrium, 1,
//                        MetastableHassium, 1,
//                        Meitnerium, 1,
//                        Roentgenium, 1,
//                        Copernicium, 1,
//                        Nihonium, 1,
//                        MetastableFlerovium, 1,
//                        Moscovium, 1,
//                        Livermorium, 1,
//                        Tennessine, 1,
//                        MetastableOganesson, 1), DISABLE_AUTOGENERATED_MIXER_RECIPE | DISABLE_DECOMPOSITION,
//                null, 13500;
        CosmicNeutronium = new Material.Builder(GregicalityModern.id("cosmic_neutronium"))
                .color(0x323232).iconSet(MaterialIconSet.SHINY).ingot(7).liquid(14100)
                .components(Neutronium, 1)
                .appendFlags(CORE_METAL,MaterialFlags.DISABLE_DECOMPOSITION)
                .blastTemp(14100)
                .buildAndRegister();
//        NaquadriaticTaranium = new Material.Builder(GregicalityModern.id("naquadriatic_taranium"))
//                .color((Naquadria.materialRGB+Taranium.materialRGB) / 2).iconSet(MaterialIconSet.SHINY)).ingot(1)
//        ImmutableList..components(
//                Naquadria, 1,
//                Taranium, 1), STD_METAL | GENERATE_LONG_ROD,
//                null, 11200;
        Polyimide = new Material.Builder(GregicalityModern.id("polyimide"))
                .color(0xFF7F50).iconSet(MaterialIconSet.DULL).ingot(1).liquid()
                .components(
                        Carbon, 22,
                        Hydrogen, 12,
                        Nitrogen, 2,
                        Oxygen, 6
                ).appendFlags(EXT2_METAL,MaterialFlags.FLAMMABLE,MaterialFlags.NO_SMASHING,MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        FluorinatedEthylenePropylene = new Material.Builder(GregicalityModern.id("fluorinated_ethylene_propylene"))
                .color(0xC8C8C8).iconSet(MaterialIconSet.DULL).ingot(1).liquid()
                .components(
                        Carbon, 5,
                        Fluorine, 10
                ).appendFlags(EXT2_METAL,MaterialFlags.FLAMMABLE,MaterialFlags.NO_SMASHING,MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
    }
}
