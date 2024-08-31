package dev.mrzhang21626.machines;

import dev.mrzhang21626.GregicalityModern;
import dev.mrzhang21626.machines.multiblocks.Multiblocks;
import dev.mrzhang21626.registries.Registrate;

public class Machines {
    public static void init() {
        Registrate.REGISTRATE.creativeModeTab(GregicalityModern.MAIN_TAB);
        Multiblocks.init();
    }
}
