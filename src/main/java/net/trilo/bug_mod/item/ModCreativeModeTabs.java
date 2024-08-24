package net.trilo.bug_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trilo.bug_mod.BugMod;
import net.trilo.bug_mod.block.ModBlocks;
import net.trilo.bug_mod.fluid.ModFluids;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BugMod.MOD_ID);

    public static final Supplier<CreativeModeTab> BUG_TEMP_TAB = CREATIVE_MODE_TABS.register("bug_temp_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.bug_mod_bug_temp_tab"))
            .icon(() -> new ItemStack(ModItems.BUG_BOOK.get()))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.BUG_BOOK);
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
