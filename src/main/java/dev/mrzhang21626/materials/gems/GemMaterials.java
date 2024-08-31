package dev.mrzhang21626.materials.gems;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import dev.mrzhang21626.GregicalityModern;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static dev.mrzhang21626.materials.Materials.*;

public class GemMaterials {
    public static void init() {
        CubicZirconia = new Material.Builder(GregicalityModern.id("cubic_zirconia"))
                .color(0xFFDFE2).iconSet(MaterialIconSet.DIAMOND).gem(6)
                .components(
                        Zirconium, 1,
                        Oxygen, 2
                ).flags(MaterialFlags.NO_SMELTING, MaterialFlags.GENERATE_LENS)
                .buildAndRegister();//, NO_RECYCLING | NO_SMELTING | GENERATE_LENSE);
        Prasiolite = new Material.Builder(GregicalityModern.id("prasiolite"))
                .color(0x9EB749).iconSet(MaterialIconSet.QUARTZ).gem().ore()
                .components(
                        Silicon, 5,
                        Oxygen, 10,
                        Iron, 1
                ).flags(MaterialFlags.GENERATE_LENS,MaterialFlags.GENERATE_PLATE)
                .buildAndRegister();
        MagnetoResonatic = new Material.Builder(GregicalityModern.id("magneto_resonatic"))
                .color(0xFF97FF).iconSet(MaterialIconSet.MAGNETIC).gem()
                .components(
                        Prasiolite, 3,
                        BismuthTellurite, 6,
                        CubicZirconia, 1,
                        SteelMagnetic, 1
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION, MaterialFlags.FLAMMABLE,
                        MaterialFlags.HIGH_SIFTER_OUTPUT, MaterialFlags.NO_SMELTING, MaterialFlags.GENERATE_LENS
                ).buildAndRegister();//, NO_RECYCLING
        RhodiumSalt = new Material.Builder(GregicalityModern.id("rhodium_salt"))
                .color(0x848484).iconSet(MaterialIconSet.GEM_VERTICAL).gem()
                .components(
                        Rhodium, 1,
                        Salt, 2
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        Zircon = new Material.Builder(GregicalityModern.id("zircon"))
                .color(0xeb9e3f).iconSet(MaterialIconSet.GEM_VERTICAL).gem(7).ore()
                .components(
                        Zirconium, 1,
                        Silicon, 1,
                        Oxygen, 4
                ).flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
        LeadZirconateTitanate = new Material.Builder(GregicalityModern.id("lead_zirconate_titanate"))
                .color(0x359ade).iconSet(MaterialIconSet.OPAL).gem(3)
                .components(
                        Lead, 1,
                        Zirconium, 1,
                        Titanium, 1,
                        Oxygen, 3
                ).flags(MaterialFlags.GENERATE_PLATE, MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();
    }
}
