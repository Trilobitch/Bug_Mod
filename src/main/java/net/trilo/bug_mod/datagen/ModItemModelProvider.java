package net.trilo.bug_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.trilo.bug_mod.BugMod;
import net.trilo.bug_mod.block.ModBlocks;
import net.trilo.bug_mod.fluid.ModFluids;
import net.trilo.bug_mod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BugMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //register some beautiful, breathtaking moditemmodels right here,,,

        basicItem(ModItems.BUG_BOOK.get());

    }
    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(BugMod.MOD_ID,"block/" + item.getId().getPath()));
    }
    public void flowerItem(DeferredBlock<Block> block) {
        this.withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(BugMod.MOD_ID, "block/" + block.getId().getPath()));
    }
    public void buttonItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory")).texture("texture",
                ResourceLocation.fromNamespaceAndPath(BugMod.MOD_ID, "block/" + baseBlock.getId().getPath()));
    }
    public void fenceItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory")).texture("texture",
                ResourceLocation.fromNamespaceAndPath(BugMod.MOD_ID, "block/" + baseBlock.getId().getPath()));
    }
    public void wallItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory")).texture("wall",
                ResourceLocation.fromNamespaceAndPath(BugMod.MOD_ID, "block/" + baseBlock.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(), ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(BugMod.MOD_ID, "item/" + item.getId().getPath()));
    }

}
