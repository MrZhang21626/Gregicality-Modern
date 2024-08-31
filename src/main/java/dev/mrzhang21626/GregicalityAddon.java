package dev.mrzhang21626;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

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
}
