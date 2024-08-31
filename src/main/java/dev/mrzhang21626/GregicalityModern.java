package dev.mrzhang21626;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.tterrag.registrate.util.entry.RegistryEntry;
import dev.mrzhang21626.machines.Machines;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static dev.mrzhang21626.registries.Registrate.REGISTRATE;


@Mod(GregicalityModern.MOD_ID)
public final class GregicalityModern {
    public static final String MOD_ID = "gregicality_modern";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    public static final RegistryEntry<CreativeModeTab> MAIN_TAB = REGISTRATE.defaultCreativeTab("main_tab", (builder) -> {
        builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("main_tab", REGISTRATE))
                .title(REGISTRATE.addLang("itemGroup", new ResourceLocation(MOD_ID, "main_tab"), "Gregicality_modern"))
                .icon(() -> GTMachines.STEAM_COMPRESSOR.first().asStack()).build();
    }).register();

    public GregicalityModern() {
        GregicalityModern.init();
        bus.register(this);
        bus.addGenericListener(MachineDefinition.class, this::registerMachines);
    }

    public static void init() {
        ConfigHolder.init();
        REGISTRATE.registerRegistrate();
    }

    @SubscribeEvent
    public void registerMachines(GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event) {
        Machines.init();
    }
}
