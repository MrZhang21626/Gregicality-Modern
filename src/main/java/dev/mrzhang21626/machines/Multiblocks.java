package dev.mrzhang21626.machines;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.machine.multiblock.steam.SteamParallelMultiblockMachine;
import net.minecraft.network.chat.Component;

import static dev.mrzhang21626.registries.Registrate.REGISTRATE;

public class Multiblocks {
    public static final MachineDefinition LARGE_STEAM_COMPRESSOR = REGISTRATE.multiblock("large_steam_compressor", SteamParallelMultiblockMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .appearanceBlock(GTBlocks.CASING_BRONZE_BRICKS)
            .recipeType(GTRecipeTypes.COMPRESSOR_RECIPES)
            .recipeModifier(SteamParallelMultiblockMachine::recipeModifier, true)
            .pattern(multiblockMachineDefinition -> FactoryBlockPattern.start()
                    .aisle("CCC", "CCC", "CCC")
                    .aisle("CCC", "C C", "CCC")
                    .aisle("CCC", "C C", "CCC")
                    .aisle("CCC", "C#C", "CCC")
                    .where("#", Predicates.controller(Predicates.blocks(multiblockMachineDefinition.getBlock())))
                    .where("C", Predicates.blocks(GTBlocks.CASING_BRONZE_BRICKS.get()).setMinGlobalLimited(28)
                            .or(Predicates.abilities(PartAbility.STEAM_IMPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(PartAbility.STEAM_EXPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(PartAbility.STEAM).setExactLimit(1))
                    )
                    .build())
            .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"),
                    GTCEu.id("block/machines/compressor"), false)
            .compassSections(GTCompassSections.STEAM)
            .compassNodeSelf()
            .tooltips(Component.translatable("block.gregicality_modern.large_steam_compressor.tooltip"))
            .register();

    public static void init() {
    }
}
