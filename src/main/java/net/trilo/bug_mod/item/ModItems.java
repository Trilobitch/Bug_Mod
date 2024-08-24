package net.trilo.bug_mod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.trilo.bug_mod.BugMod;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BugMod.MOD_ID);

    // register those sweet, sweet items right here baby

    public static final DeferredItem<Item> BUG_BOOK = ITEMS.registerSimpleItem("bug_book");

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
