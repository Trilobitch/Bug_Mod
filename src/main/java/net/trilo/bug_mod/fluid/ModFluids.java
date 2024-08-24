package net.trilo.bug_mod.fluid;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trilo.bug_mod.BugMod;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(BuiltInRegistries.FLUID, BugMod.MOD_ID);

    //flooed

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
