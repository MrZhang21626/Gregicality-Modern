package dev.mrzhang21626;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.tterrag.registrate.util.entry.RegistryEntry;
import dev.mrzhang21626.machines.Machines;
import dev.mrzhang21626.materials.Materials;
import dev.mrzhang21626.materials.ModifyMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static dev.mrzhang21626.registries.Registrate.REGISTRATE;


@Mod(GregicalityModern.MOD_ID)
public final class GregicalityModern {
    public static final String MOD_ID = "gregicality_modern";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final RegistryEntry<CreativeModeTab> MAIN_TAB = REGISTRATE.defaultCreativeTab("main_tab", (builder) -> {
        builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("main_tab", REGISTRATE))
                .title(REGISTRATE.addLang("itemGroup", new ResourceLocation(MOD_ID, "main_tab"), "Gregicality_modern"))
                .icon(() -> GTMachines.STEAM_COMPRESSOR.first().asStack()).build();
    }).register();

    public GregicalityModern() {
        GregicalityModern.init();
        Events.init();
    }

    public static void init() {
        ConfigHolder.init();
        REGISTRATE.registerRegistrate();
    }


    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public static final class Events {
        public static final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        public static void init() {
            bus.addGenericListener(MachineDefinition.class, Events::registerMachines);
            bus.addListener(Events::registerMaterials);
            bus.addListener(Events::modifyMaterials);
        }

        public static void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
            Machines.init();
        }

        public static void registerMaterials(MaterialEvent event) {
            Materials.init();
        }

        public static void modifyMaterials(PostMaterialEvent event) {
            ModifyMaterials.init();
        }
    }
}
