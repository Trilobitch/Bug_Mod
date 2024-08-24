package net.trilo.bug_mod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.trilo.bug_mod.BugMod;

public class ModTags {

    public static class Blocks{

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(BugMod.MOD_ID, name));
        }

        //Custom Block Tags for baby
    }

    public static class Items{

        //Custom Item Tags for toddler child

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(BugMod.MOD_ID, name));
        }
    }
}
