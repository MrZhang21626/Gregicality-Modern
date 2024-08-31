package dev.mrzhang21626.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.FluidPipeProperties;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.IngotProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static dev.mrzhang21626.materials.Materials.*;

public class ModifyGTMaterials {
    public static void init() {
        Hafnium.setProperty(PropertyKey.INGOT, new IngotProperty());

        addLiquid(RutheniumTetroxide);
        RutheniumTetroxide.addFlags(EXCLUDE_BLOCK_CRAFTING_RECIPES, DISABLE_DECOMPOSITION);
        TungsticAcid.addFlags(DISABLE_DECOMPOSITION);
        CoalTar.setFormula("C?", true);

        Stellite100.addFlags(GENERATE_FRAME, GENERATE_FINE_WIRE,
                GENERATE_FOIL, GENERATE_DENSE, GENERATE_GEAR, GENERATE_SMALL_GEAR);

        Enderium.setProperty(PropertyKey.FLUID_PIPE, new FluidPipeProperties(1500, 650, true, true, true, true));
        Zeron100.setProperty(PropertyKey.FLUID_PIPE, new FluidPipeProperties(15000, 1750, true, true, true, true));
        Lafium.setProperty(PropertyKey.FLUID_PIPE, new FluidPipeProperties(23000, 2000, true, true, true, true));
        //EnrichedNaquadahAlloy.setProperty(PropertyKey.FLUID_PIPE, new FluidPipeProperties(25000, 2200, true, true, true, true));
        TantalumHafniumSeaborgiumCarbide.setProperty(PropertyKey.FLUID_PIPE, new FluidPipeProperties(500000, 2400, true, true, true, true));

        addPlasma(Radon);
        addPlasma(Potassium);
        addPlasma(Carbon);
        addPlasma(Magnesium);
        addPlasma(Silicon);
        addPlasma(Sulfur);
        addPlasma(Calcium);
        addPlasma(Titanium);
        addPlasma(Hydrogen);
        addPlasma(Helium3);

        Polytetrafluoroethylene.addFlags(GENERATE_FOIL);
        Rubber.addFlags(GENERATE_FOIL);
        Polycaprolactam.addFlags(GENERATE_FOIL);
        Barium.addFlags(GENERATE_FOIL);
        Calcium.addFlags(GENERATE_FOIL);

        Cupronickel.addFlags(GENERATE_FINE_WIRE);
        ReinforcedEpoxyResin.addFlags(GENERATE_FINE_WIRE);
        //Plutonium.addFlag(GENERATE_FINE_WIRE);
        Europium.addFlags(GENERATE_FINE_WIRE);
        Cerium.addFlags(GENERATE_FINE_WIRE);
        Zinc.addFlags(GENERATE_FINE_WIRE);
        Duranium.addFlags(GENERATE_FINE_WIRE);

        Naquadria.addFlags(GENERATE_FRAME);
        RedSteel.addFlags(GENERATE_FRAME);
        Thorium.addFlags(GENERATE_FRAME);
        Americium.addFlags(GENERATE_FRAME);
        Iron.addFlags(GENERATE_FRAME);
        Lead.addFlags(GENERATE_FRAME);
        HSSG.addFlags(GENERATE_FRAME);
        HSSS.addFlags(GENERATE_FRAME);

        Cobalt.addFlags(GENERATE_GEAR);

        Europium.addFlags(GENERATE_LONG_ROD);
        Uranium238.addFlags(GENERATE_LONG_ROD);
        VanadiumGallium.addFlags(GENERATE_LONG_ROD);

        Aluminium.addFlags(GENERATE_ROUND);
        Titanium.addFlags(GENERATE_ROUND);
        StainlessSteel.addFlags(GENERATE_ROUND);
        Steel.addFlags(GENERATE_ROUND);
        TungstenSteel.addFlags(GENERATE_ROUND);
        HSSG.addFlags(GENERATE_ROUND);
        HSSE.addFlags(GENERATE_ROUND);
        Tritanium.addFlags(GENERATE_ROUND);

        Naquadria.addFlags(GENERATE_DENSE);
        Manganese.addFlags(GENERATE_DENSE);
        StainlessSteel.addFlags(GENERATE_DENSE);

        Boron.addFlags(GENERATE_ROD);
        ReinforcedEpoxyResin.addFlags(GENERATE_ROD);
        Apatite.addFlags(GENERATE_ROD);
        Thorium.addFlags(GENERATE_ROD);
        Polytetrafluoroethylene.addFlags(GENERATE_ROD);

        Cobalt.addFlags(GENERATE_BOLT_SCREW);
        Manganese.addFlags(GENERATE_BOLT_SCREW);
        Molybdenum.addFlags(GENERATE_BOLT_SCREW);
        Neodymium.addFlags(GENERATE_BOLT_SCREW);
        Apatite.addFlags(GENERATE_BOLT_SCREW);
        Rubber.addFlags(GENERATE_BOLT_SCREW);

        BorosilicateGlass.addFlags(GENERATE_PLATE);
    }

    static void addGas(Material material) {
        material.getProperties().ensureSet(PropertyKey.FLUID);
        material.getProperty(PropertyKey.FLUID).enqueueRegistration(FluidStorageKeys.GAS, new FluidBuilder());
    }

    static void addLiquid(Material material) {
        material.getProperties().ensureSet(PropertyKey.FLUID);
        material.getProperty(PropertyKey.FLUID).enqueueRegistration(FluidStorageKeys.LIQUID, new FluidBuilder());
    }

    static void addPlasma(Material material) {
        material.getProperties().ensureSet(PropertyKey.FLUID);
        material.getProperty(PropertyKey.FLUID).enqueueRegistration(FluidStorageKeys.PLASMA, new FluidBuilder());
    }
}