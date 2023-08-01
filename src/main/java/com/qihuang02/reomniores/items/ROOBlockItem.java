package com.qihuang02.reomniores.items;

import com.qihuang02.reomniores.ReOmniOres;
import com.qihuang02.reomniores.blocks.ROOBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ROOBlockItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ReOmniOres.MODID);

    // Storage Blocks
    public static final RegistryObject<Item> TIN_BLOCK = ITEMS.register("tin_block", () -> new BlockItem(ROOBlock.TIN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(ROOBlock.LEAD_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_BLOCK = ITEMS.register("nickel_block", () -> new BlockItem(ROOBlock.NICKEL_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_BLOCK = ITEMS.register("zinc_block", () -> new BlockItem(ROOBlock.ZINC_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_BLOCK = ITEMS.register("aluminum_block", () -> new BlockItem(ROOBlock.ALUMINUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BLOCK = ITEMS.register("silver_block", () -> new BlockItem(ROOBlock.SILVER_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_BLOCK = ITEMS.register("cobalt_block", () -> new BlockItem(ROOBlock.COBALT_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_BLOCK = ITEMS.register("osmium_block", () -> new BlockItem(ROOBlock.OSMIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_BLOCK = ITEMS.register("iridium_block", () -> new BlockItem(ROOBlock.IRIDIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_BLOCK = ITEMS.register("uranium_block", () -> new BlockItem(ROOBlock.URANIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BLOCK = ITEMS.register("bronze_block", () -> new BlockItem(ROOBlock.BRONZE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRASS_BLOCK = ITEMS.register("brass_block", () -> new BlockItem(ROOBlock.BRASS_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BLOCK = ITEMS.register("steel_block", () -> new BlockItem(ROOBlock.STEEL_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_BLOCK = ITEMS.register("electrum_block", () -> new BlockItem(ROOBlock.ELECTRUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> INVAR_BLOCK = ITEMS.register("invar_block", () -> new BlockItem(ROOBlock.INVAR_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONSTANTAN_BLOCK = ITEMS.register("constantan_block", () -> new BlockItem(ROOBlock.CONSTANTAN_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SIGNALUM_BLOCK = ITEMS.register("signalum_block", () -> new BlockItem(ROOBlock.SIGNALUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> LUMIUM_BLOCK = ITEMS.register("lumium_block", () -> new BlockItem(ROOBlock.LUMIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ENDERIUM_BLOCK = ITEMS.register("enderium_block", () -> new BlockItem(ROOBlock.ENDERIUM_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(ROOBlock.RUBY_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block", () -> new BlockItem(ROOBlock.SAPPHIRE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_BLOCK = ITEMS.register("sulfur_block", () -> new BurnableBlockItems(ROOBlock.SULFUR_BLOCK.get(), 12000));
    public static final RegistryObject<Item> CINNABAR_BLOCK = ITEMS.register("cinnabar_block", () -> new BlockItem(ROOBlock.CINNABAR_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_BLOCK = ITEMS.register("potassium_nitrate_block", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_BLOCK = ITEMS.register("apatite_block", () -> new BlockItem(ROOBlock.APATITE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_BLOCK = ITEMS.register("fluorite_block", () -> new BlockItem(ROOBlock.FLUORITE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_COKE_BLOCK = ITEMS.register("coal_coke_block", () -> new BurnableBlockItems(ROOBlock.COAL_COKE_BLOCK.get(), 32000));
    public static final RegistryObject<Item> CHARCOAL_BLOCK = ITEMS.register("charcoal_block", () -> new BurnableBlockItems(ROOBlock.CHARCOAL_BLOCK.get(), 16000));

    // Coal
    public static final RegistryObject<Item> COAL_ORE_ANDESITE = ITEMS.register("coal_ore_andesite", () -> new BlockItem(ROOBlock.COAL_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_CALCITE = ITEMS.register("coal_ore_calcite", () -> new BlockItem(ROOBlock.COAL_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_CREATE_LIMESTONE = ITEMS.register("coal_ore_create_limestone", () -> new BlockItem(ROOBlock.COAL_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_CREATE_SCORCHIA = ITEMS.register("coal_ore_create_scorchia", () -> new BlockItem(ROOBlock.COAL_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_CREATE_SCORIA = ITEMS.register("coal_ore_create_scoria", () -> new BlockItem(ROOBlock.COAL_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_DIORITE = ITEMS.register("coal_ore_diorite", () -> new BlockItem(ROOBlock.COAL_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_GRANITE = ITEMS.register("coal_ore_granite", () -> new BlockItem(ROOBlock.COAL_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_QUARK_JASPER = ITEMS.register("coal_ore_quark_jasper", () -> new BlockItem(ROOBlock.COAL_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_QUARK_LIMESTONE = ITEMS.register("coal_ore_quark_limestone", () -> new BlockItem(ROOBlock.COAL_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_QUARK_SHALE = ITEMS.register("coal_ore_quark_shale", () -> new BlockItem(ROOBlock.COAL_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_STONE = ITEMS.register("coal_ore_stone", () -> new BlockItem(ROOBlock.COAL_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_TUFF = ITEMS.register("coal_ore_tuff", () -> new BlockItem(ROOBlock.COAL_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_DEEPSLATE = ITEMS.register("coal_ore_deepslate", () -> new BlockItem(ROOBlock.COAL_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_BASALT = ITEMS.register("coal_ore_basalt", () -> new BlockItem(ROOBlock.COAL_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_BLACKSTONE = ITEMS.register("coal_ore_blackstone", () -> new BlockItem(ROOBlock.COAL_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_NETHERRACK = ITEMS.register("coal_ore_netherrack", () -> new BlockItem(ROOBlock.COAL_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> COAL_ORE_END_STONE = ITEMS.register("coal_ore_end_stone", () -> new BlockItem(ROOBlock.COAL_ORE_END_STONE.get(), new Item.Properties()));

    // Iron
    public static final RegistryObject<Item> IRON_ORE_ANDESITE = ITEMS.register("iron_ore_andesite", () -> new BlockItem(ROOBlock.IRON_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_CALCITE = ITEMS.register("iron_ore_calcite", () -> new BlockItem(ROOBlock.IRON_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_CREATE_LIMESTONE = ITEMS.register("iron_ore_create_limestone", () -> new BlockItem(ROOBlock.IRON_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_CREATE_SCORCHIA = ITEMS.register("iron_ore_create_scorchia", () -> new BlockItem(ROOBlock.IRON_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_CREATE_SCORIA = ITEMS.register("iron_ore_create_scoria", () -> new BlockItem(ROOBlock.IRON_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_DIORITE = ITEMS.register("iron_ore_diorite", () -> new BlockItem(ROOBlock.IRON_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_GRANITE = ITEMS.register("iron_ore_granite", () -> new BlockItem(ROOBlock.IRON_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_QUARK_JASPER = ITEMS.register("iron_ore_quark_jasper", () -> new BlockItem(ROOBlock.IRON_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_QUARK_LIMESTONE = ITEMS.register("iron_ore_quark_limestone", () -> new BlockItem(ROOBlock.IRON_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_QUARK_SHALE = ITEMS.register("iron_ore_quark_shale", () -> new BlockItem(ROOBlock.IRON_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_STONE = ITEMS.register("iron_ore_stone", () -> new BlockItem(ROOBlock.IRON_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_TUFF = ITEMS.register("iron_ore_tuff", () -> new BlockItem(ROOBlock.IRON_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_DEEPSLATE = ITEMS.register("iron_ore_deepslate", () -> new BlockItem(ROOBlock.IRON_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_BASALT = ITEMS.register("iron_ore_basalt", () -> new BlockItem(ROOBlock.IRON_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_BLACKSTONE = ITEMS.register("iron_ore_blackstone", () -> new BlockItem(ROOBlock.IRON_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_NETHERRACK = ITEMS.register("iron_ore_netherrack", () -> new BlockItem(ROOBlock.IRON_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRON_ORE_END_STONE = ITEMS.register("iron_ore_end_stone", () -> new BlockItem(ROOBlock.IRON_ORE_END_STONE.get(), new Item.Properties()));

    // Gold
    public static final RegistryObject<Item> GOLD_ORE_ANDESITE = ITEMS.register("gold_ore_andesite", () -> new BlockItem(ROOBlock.GOLD_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_CALCITE = ITEMS.register("gold_ore_calcite", () -> new BlockItem(ROOBlock.GOLD_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_CREATE_LIMESTONE = ITEMS.register("gold_ore_create_limestone", () -> new BlockItem(ROOBlock.GOLD_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_CREATE_SCORCHIA = ITEMS.register("gold_ore_create_scorchia", () -> new BlockItem(ROOBlock.GOLD_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_CREATE_SCORIA = ITEMS.register("gold_ore_create_scoria", () -> new BlockItem(ROOBlock.GOLD_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_DIORITE = ITEMS.register("gold_ore_diorite", () -> new BlockItem(ROOBlock.GOLD_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_GRANITE = ITEMS.register("gold_ore_granite", () -> new BlockItem(ROOBlock.GOLD_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_QUARK_JASPER = ITEMS.register("gold_ore_quark_jasper", () -> new BlockItem(ROOBlock.GOLD_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_QUARK_LIMESTONE = ITEMS.register("gold_ore_quark_limestone", () -> new BlockItem(ROOBlock.GOLD_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_QUARK_SHALE = ITEMS.register("gold_ore_quark_shale", () -> new BlockItem(ROOBlock.GOLD_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_STONE = ITEMS.register("gold_ore_stone", () -> new BlockItem(ROOBlock.GOLD_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_TUFF = ITEMS.register("gold_ore_tuff", () -> new BlockItem(ROOBlock.GOLD_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_DEEPSLATE = ITEMS.register("gold_ore_deepslate", () -> new BlockItem(ROOBlock.GOLD_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_BASALT = ITEMS.register("gold_ore_basalt", () -> new BlockItem(ROOBlock.GOLD_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_BLACKSTONE = ITEMS.register("gold_ore_blackstone", () -> new BlockItem(ROOBlock.GOLD_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_NETHERRACK = ITEMS.register("gold_ore_netherrack", () -> new BlockItem(ROOBlock.GOLD_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_ORE_END_STONE = ITEMS.register("gold_ore_end_stone", () -> new BlockItem(ROOBlock.GOLD_ORE_END_STONE.get(), new Item.Properties()));

    // Copper
    public static final RegistryObject<Item> COPPER_ORE_ANDESITE = ITEMS.register("copper_ore_andesite", () -> new BlockItem(ROOBlock.COPPER_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_CALCITE = ITEMS.register("copper_ore_calcite", () -> new BlockItem(ROOBlock.COPPER_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_CREATE_LIMESTONE = ITEMS.register("copper_ore_create_limestone", () -> new BlockItem(ROOBlock.COPPER_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_CREATE_SCORCHIA = ITEMS.register("copper_ore_create_scorchia", () -> new BlockItem(ROOBlock.COPPER_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_CREATE_SCORIA = ITEMS.register("copper_ore_create_scoria", () -> new BlockItem(ROOBlock.COPPER_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_DIORITE = ITEMS.register("copper_ore_diorite", () -> new BlockItem(ROOBlock.COPPER_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_GRANITE = ITEMS.register("copper_ore_granite", () -> new BlockItem(ROOBlock.COPPER_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_QUARK_JASPER = ITEMS.register("copper_ore_quark_jasper", () -> new BlockItem(ROOBlock.COPPER_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_QUARK_LIMESTONE = ITEMS.register("copper_ore_quark_limestone", () -> new BlockItem(ROOBlock.COPPER_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_QUARK_SHALE = ITEMS.register("copper_ore_quark_shale", () -> new BlockItem(ROOBlock.COPPER_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_STONE = ITEMS.register("copper_ore_stone", () -> new BlockItem(ROOBlock.COPPER_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_TUFF = ITEMS.register("copper_ore_tuff", () -> new BlockItem(ROOBlock.COPPER_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_DEEPSLATE = ITEMS.register("copper_ore_deepslate", () -> new BlockItem(ROOBlock.COPPER_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_BASALT = ITEMS.register("copper_ore_basalt", () -> new BlockItem(ROOBlock.COPPER_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_BLACKSTONE = ITEMS.register("copper_ore_blackstone", () -> new BlockItem(ROOBlock.COPPER_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_NETHERRACK = ITEMS.register("copper_ore_netherrack", () -> new BlockItem(ROOBlock.COPPER_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> COPPER_ORE_END_STONE = ITEMS.register("copper_ore_end_stone", () -> new BlockItem(ROOBlock.COPPER_ORE_END_STONE.get(), new Item.Properties()));

    // Redstone
    public static final RegistryObject<Item> REDSTONE_ORE_ANDESITE = ITEMS.register("redstone_ore_andesite", () -> new BlockItem(ROOBlock.REDSTONE_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_CALCITE = ITEMS.register("redstone_ore_calcite", () -> new BlockItem(ROOBlock.REDSTONE_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_CREATE_LIMESTONE = ITEMS.register("redstone_ore_create_limestone", () -> new BlockItem(ROOBlock.REDSTONE_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_CREATE_SCORCHIA = ITEMS.register("redstone_ore_create_scorchia", () -> new BlockItem(ROOBlock.REDSTONE_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_CREATE_SCORIA = ITEMS.register("redstone_ore_create_scoria", () -> new BlockItem(ROOBlock.REDSTONE_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_DIORITE = ITEMS.register("redstone_ore_diorite", () -> new BlockItem(ROOBlock.REDSTONE_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_GRANITE = ITEMS.register("redstone_ore_granite", () -> new BlockItem(ROOBlock.REDSTONE_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_QUARK_JASPER = ITEMS.register("redstone_ore_quark_jasper", () -> new BlockItem(ROOBlock.REDSTONE_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_QUARK_LIMESTONE = ITEMS.register("redstone_ore_quark_limestone", () -> new BlockItem(ROOBlock.REDSTONE_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_QUARK_SHALE = ITEMS.register("redstone_ore_quark_shale", () -> new BlockItem(ROOBlock.REDSTONE_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_STONE = ITEMS.register("redstone_ore_stone", () -> new BlockItem(ROOBlock.REDSTONE_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_TUFF = ITEMS.register("redstone_ore_tuff", () -> new BlockItem(ROOBlock.REDSTONE_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_DEEPSLATE = ITEMS.register("redstone_ore_deepslate", () -> new BlockItem(ROOBlock.REDSTONE_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_BASALT = ITEMS.register("redstone_ore_basalt", () -> new BlockItem(ROOBlock.REDSTONE_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_BLACKSTONE = ITEMS.register("redstone_ore_blackstone", () -> new BlockItem(ROOBlock.REDSTONE_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_NETHERRACK = ITEMS.register("redstone_ore_netherrack", () -> new BlockItem(ROOBlock.REDSTONE_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_ORE_END_STONE = ITEMS.register("redstone_ore_end_stone", () -> new BlockItem(ROOBlock.REDSTONE_ORE_END_STONE.get(), new Item.Properties()));

    // Lapis
    public static final RegistryObject<Item> LAPIS_ORE_ANDESITE = ITEMS.register("lapis_ore_andesite", () -> new BlockItem(ROOBlock.LAPIS_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_CALCITE = ITEMS.register("lapis_ore_calcite", () -> new BlockItem(ROOBlock.LAPIS_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_CREATE_LIMESTONE = ITEMS.register("lapis_ore_create_limestone", () -> new BlockItem(ROOBlock.LAPIS_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_CREATE_SCORCHIA = ITEMS.register("lapis_ore_create_scorchia", () -> new BlockItem(ROOBlock.LAPIS_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_CREATE_SCORIA = ITEMS.register("lapis_ore_create_scoria", () -> new BlockItem(ROOBlock.LAPIS_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_DIORITE = ITEMS.register("lapis_ore_diorite", () -> new BlockItem(ROOBlock.LAPIS_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_GRANITE = ITEMS.register("lapis_ore_granite", () -> new BlockItem(ROOBlock.LAPIS_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_QUARK_JASPER = ITEMS.register("lapis_ore_quark_jasper", () -> new BlockItem(ROOBlock.LAPIS_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_QUARK_LIMESTONE = ITEMS.register("lapis_ore_quark_limestone", () -> new BlockItem(ROOBlock.LAPIS_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_QUARK_SHALE = ITEMS.register("lapis_ore_quark_shale", () -> new BlockItem(ROOBlock.LAPIS_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_STONE = ITEMS.register("lapis_ore_stone", () -> new BlockItem(ROOBlock.LAPIS_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_TUFF = ITEMS.register("lapis_ore_tuff", () -> new BlockItem(ROOBlock.LAPIS_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_DEEPSLATE = ITEMS.register("lapis_ore_deepslate", () -> new BlockItem(ROOBlock.LAPIS_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_BASALT = ITEMS.register("lapis_ore_basalt", () -> new BlockItem(ROOBlock.LAPIS_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_BLACKSTONE = ITEMS.register("lapis_ore_blackstone", () -> new BlockItem(ROOBlock.LAPIS_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_NETHERRACK = ITEMS.register("lapis_ore_netherrack", () -> new BlockItem(ROOBlock.LAPIS_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_ORE_END_STONE = ITEMS.register("lapis_ore_end_stone", () -> new BlockItem(ROOBlock.LAPIS_ORE_END_STONE.get(), new Item.Properties()));

    // Diamond
    public static final RegistryObject<Item> DIAMOND_ORE_ANDESITE = ITEMS.register("diamond_ore_andesite", () -> new BlockItem(ROOBlock.DIAMOND_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_CALCITE = ITEMS.register("diamond_ore_calcite", () -> new BlockItem(ROOBlock.DIAMOND_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_CREATE_LIMESTONE = ITEMS.register("diamond_ore_create_limestone", () -> new BlockItem(ROOBlock.DIAMOND_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_CREATE_SCORCHIA = ITEMS.register("diamond_ore_create_scorchia", () -> new BlockItem(ROOBlock.DIAMOND_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_CREATE_SCORIA = ITEMS.register("diamond_ore_create_scoria", () -> new BlockItem(ROOBlock.DIAMOND_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_DIORITE = ITEMS.register("diamond_ore_diorite", () -> new BlockItem(ROOBlock.DIAMOND_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_GRANITE = ITEMS.register("diamond_ore_granite", () -> new BlockItem(ROOBlock.DIAMOND_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_QUARK_JASPER = ITEMS.register("diamond_ore_quark_jasper", () -> new BlockItem(ROOBlock.DIAMOND_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_QUARK_LIMESTONE = ITEMS.register("diamond_ore_quark_limestone", () -> new BlockItem(ROOBlock.DIAMOND_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_QUARK_SHALE = ITEMS.register("diamond_ore_quark_shale", () -> new BlockItem(ROOBlock.DIAMOND_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_STONE = ITEMS.register("diamond_ore_stone", () -> new BlockItem(ROOBlock.DIAMOND_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_TUFF = ITEMS.register("diamond_ore_tuff", () -> new BlockItem(ROOBlock.DIAMOND_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_DEEPSLATE = ITEMS.register("diamond_ore_deepslate", () -> new BlockItem(ROOBlock.DIAMOND_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_BASALT = ITEMS.register("diamond_ore_basalt", () -> new BlockItem(ROOBlock.DIAMOND_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_BLACKSTONE = ITEMS.register("diamond_ore_blackstone", () -> new BlockItem(ROOBlock.DIAMOND_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_NETHERRACK = ITEMS.register("diamond_ore_netherrack", () -> new BlockItem(ROOBlock.DIAMOND_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_ORE_END_STONE = ITEMS.register("diamond_ore_end_stone", () -> new BlockItem(ROOBlock.DIAMOND_ORE_END_STONE.get(), new Item.Properties()));

    // Emerald
    public static final RegistryObject<Item> EMERALD_ORE_ANDESITE = ITEMS.register("emerald_ore_andesite", () -> new BlockItem(ROOBlock.EMERALD_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_CALCITE = ITEMS.register("emerald_ore_calcite", () -> new BlockItem(ROOBlock.EMERALD_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_CREATE_LIMESTONE = ITEMS.register("emerald_ore_create_limestone", () -> new BlockItem(ROOBlock.EMERALD_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_CREATE_SCORCHIA = ITEMS.register("emerald_ore_create_scorchia", () -> new BlockItem(ROOBlock.EMERALD_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_CREATE_SCORIA = ITEMS.register("emerald_ore_create_scoria", () -> new BlockItem(ROOBlock.EMERALD_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_DIORITE = ITEMS.register("emerald_ore_diorite", () -> new BlockItem(ROOBlock.EMERALD_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_GRANITE = ITEMS.register("emerald_ore_granite", () -> new BlockItem(ROOBlock.EMERALD_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_QUARK_JASPER = ITEMS.register("emerald_ore_quark_jasper", () -> new BlockItem(ROOBlock.EMERALD_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_QUARK_LIMESTONE = ITEMS.register("emerald_ore_quark_limestone", () -> new BlockItem(ROOBlock.EMERALD_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_QUARK_SHALE = ITEMS.register("emerald_ore_quark_shale", () -> new BlockItem(ROOBlock.EMERALD_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_STONE = ITEMS.register("emerald_ore_stone", () -> new BlockItem(ROOBlock.EMERALD_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_TUFF = ITEMS.register("emerald_ore_tuff", () -> new BlockItem(ROOBlock.EMERALD_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_DEEPSLATE = ITEMS.register("emerald_ore_deepslate", () -> new BlockItem(ROOBlock.EMERALD_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_BASALT = ITEMS.register("emerald_ore_basalt", () -> new BlockItem(ROOBlock.EMERALD_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_BLACKSTONE = ITEMS.register("emerald_ore_blackstone", () -> new BlockItem(ROOBlock.EMERALD_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_NETHERRACK = ITEMS.register("emerald_ore_netherrack", () -> new BlockItem(ROOBlock.EMERALD_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_ORE_END_STONE = ITEMS.register("emerald_ore_end_stone", () -> new BlockItem(ROOBlock.EMERALD_ORE_END_STONE.get(), new Item.Properties()));

    // Quartz
    public static final RegistryObject<Item> QUARTZ_ORE_ANDESITE = ITEMS.register("quartz_ore_andesite", () -> new BlockItem(ROOBlock.QUARTZ_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_CALCITE = ITEMS.register("quartz_ore_calcite", () -> new BlockItem(ROOBlock.QUARTZ_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_CREATE_LIMESTONE = ITEMS.register("quartz_ore_create_limestone", () -> new BlockItem(ROOBlock.QUARTZ_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_CREATE_SCORCHIA = ITEMS.register("quartz_ore_create_scorchia", () -> new BlockItem(ROOBlock.QUARTZ_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_CREATE_SCORIA = ITEMS.register("quartz_ore_create_scoria", () -> new BlockItem(ROOBlock.QUARTZ_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_DIORITE = ITEMS.register("quartz_ore_diorite", () -> new BlockItem(ROOBlock.QUARTZ_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_GRANITE = ITEMS.register("quartz_ore_granite", () -> new BlockItem(ROOBlock.QUARTZ_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_QUARK_JASPER = ITEMS.register("quartz_ore_quark_jasper", () -> new BlockItem(ROOBlock.QUARTZ_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_QUARK_LIMESTONE = ITEMS.register("quartz_ore_quark_limestone", () -> new BlockItem(ROOBlock.QUARTZ_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_QUARK_SHALE = ITEMS.register("quartz_ore_quark_shale", () -> new BlockItem(ROOBlock.QUARTZ_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_STONE = ITEMS.register("quartz_ore_stone", () -> new BlockItem(ROOBlock.QUARTZ_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_TUFF = ITEMS.register("quartz_ore_tuff", () -> new BlockItem(ROOBlock.QUARTZ_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_DEEPSLATE = ITEMS.register("quartz_ore_deepslate", () -> new BlockItem(ROOBlock.QUARTZ_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_BASALT = ITEMS.register("quartz_ore_basalt", () -> new BlockItem(ROOBlock.QUARTZ_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_BLACKSTONE = ITEMS.register("quartz_ore_blackstone", () -> new BlockItem(ROOBlock.QUARTZ_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_NETHERRACK = ITEMS.register("quartz_ore_netherrack", () -> new BlockItem(ROOBlock.QUARTZ_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_ORE_END_STONE = ITEMS.register("quartz_ore_end_stone", () -> new BlockItem(ROOBlock.QUARTZ_ORE_END_STONE.get(), new Item.Properties()));

    // Tin
    public static final RegistryObject<Item> TIN_ORE_ANDESITE = ITEMS.register("tin_ore_andesite", () -> new BlockItem(ROOBlock.TIN_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_CALCITE = ITEMS.register("tin_ore_calcite", () -> new BlockItem(ROOBlock.TIN_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_CREATE_LIMESTONE = ITEMS.register("tin_ore_create_limestone", () -> new BlockItem(ROOBlock.TIN_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_CREATE_SCORCHIA = ITEMS.register("tin_ore_create_scorchia", () -> new BlockItem(ROOBlock.TIN_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_CREATE_SCORIA = ITEMS.register("tin_ore_create_scoria", () -> new BlockItem(ROOBlock.TIN_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_DIORITE = ITEMS.register("tin_ore_diorite", () -> new BlockItem(ROOBlock.TIN_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_GRANITE = ITEMS.register("tin_ore_granite", () -> new BlockItem(ROOBlock.TIN_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_QUARK_JASPER = ITEMS.register("tin_ore_quark_jasper", () -> new BlockItem(ROOBlock.TIN_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_QUARK_LIMESTONE = ITEMS.register("tin_ore_quark_limestone", () -> new BlockItem(ROOBlock.TIN_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_QUARK_SHALE = ITEMS.register("tin_ore_quark_shale", () -> new BlockItem(ROOBlock.TIN_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_STONE = ITEMS.register("tin_ore_stone", () -> new BlockItem(ROOBlock.TIN_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_TUFF = ITEMS.register("tin_ore_tuff", () -> new BlockItem(ROOBlock.TIN_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_DEEPSLATE = ITEMS.register("tin_ore_deepslate", () -> new BlockItem(ROOBlock.TIN_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_BASALT = ITEMS.register("tin_ore_basalt", () -> new BlockItem(ROOBlock.TIN_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_BLACKSTONE = ITEMS.register("tin_ore_blackstone", () -> new BlockItem(ROOBlock.TIN_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_NETHERRACK = ITEMS.register("tin_ore_netherrack", () -> new BlockItem(ROOBlock.TIN_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIN_ORE_END_STONE = ITEMS.register("tin_ore_end_stone", () -> new BlockItem(ROOBlock.TIN_ORE_END_STONE.get(), new Item.Properties()));

    // Lead
    public static final RegistryObject<Item> LEAD_ORE_ANDESITE = ITEMS.register("lead_ore_andesite", () -> new BlockItem(ROOBlock.LEAD_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_CALCITE = ITEMS.register("lead_ore_calcite", () -> new BlockItem(ROOBlock.LEAD_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_CREATE_LIMESTONE = ITEMS.register("lead_ore_create_limestone", () -> new BlockItem(ROOBlock.LEAD_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_CREATE_SCORCHIA = ITEMS.register("lead_ore_create_scorchia", () -> new BlockItem(ROOBlock.LEAD_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_CREATE_SCORIA = ITEMS.register("lead_ore_create_scoria", () -> new BlockItem(ROOBlock.LEAD_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_DIORITE = ITEMS.register("lead_ore_diorite", () -> new BlockItem(ROOBlock.LEAD_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_GRANITE = ITEMS.register("lead_ore_granite", () -> new BlockItem(ROOBlock.LEAD_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_QUARK_JASPER = ITEMS.register("lead_ore_quark_jasper", () -> new BlockItem(ROOBlock.LEAD_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_QUARK_LIMESTONE = ITEMS.register("lead_ore_quark_limestone", () -> new BlockItem(ROOBlock.LEAD_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_QUARK_SHALE = ITEMS.register("lead_ore_quark_shale", () -> new BlockItem(ROOBlock.LEAD_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_STONE = ITEMS.register("lead_ore_stone", () -> new BlockItem(ROOBlock.LEAD_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_TUFF = ITEMS.register("lead_ore_tuff", () -> new BlockItem(ROOBlock.LEAD_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_DEEPSLATE = ITEMS.register("lead_ore_deepslate", () -> new BlockItem(ROOBlock.LEAD_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_BASALT = ITEMS.register("lead_ore_basalt", () -> new BlockItem(ROOBlock.LEAD_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_BLACKSTONE = ITEMS.register("lead_ore_blackstone", () -> new BlockItem(ROOBlock.LEAD_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_NETHERRACK = ITEMS.register("lead_ore_netherrack", () -> new BlockItem(ROOBlock.LEAD_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEAD_ORE_END_STONE = ITEMS.register("lead_ore_end_stone", () -> new BlockItem(ROOBlock.LEAD_ORE_END_STONE.get(), new Item.Properties()));

    // Nickel
    public static final RegistryObject<Item> NICKEL_ORE_ANDESITE = ITEMS.register("nickel_ore_andesite", () -> new BlockItem(ROOBlock.NICKEL_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_CALCITE = ITEMS.register("nickel_ore_calcite", () -> new BlockItem(ROOBlock.NICKEL_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_CREATE_LIMESTONE = ITEMS.register("nickel_ore_create_limestone", () -> new BlockItem(ROOBlock.NICKEL_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_CREATE_SCORCHIA = ITEMS.register("nickel_ore_create_scorchia", () -> new BlockItem(ROOBlock.NICKEL_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_CREATE_SCORIA = ITEMS.register("nickel_ore_create_scoria", () -> new BlockItem(ROOBlock.NICKEL_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_DIORITE = ITEMS.register("nickel_ore_diorite", () -> new BlockItem(ROOBlock.NICKEL_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_GRANITE = ITEMS.register("nickel_ore_granite", () -> new BlockItem(ROOBlock.NICKEL_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_QUARK_JASPER = ITEMS.register("nickel_ore_quark_jasper", () -> new BlockItem(ROOBlock.NICKEL_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_QUARK_LIMESTONE = ITEMS.register("nickel_ore_quark_limestone", () -> new BlockItem(ROOBlock.NICKEL_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_QUARK_SHALE = ITEMS.register("nickel_ore_quark_shale", () -> new BlockItem(ROOBlock.NICKEL_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_STONE = ITEMS.register("nickel_ore_stone", () -> new BlockItem(ROOBlock.NICKEL_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_TUFF = ITEMS.register("nickel_ore_tuff", () -> new BlockItem(ROOBlock.NICKEL_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_DEEPSLATE = ITEMS.register("nickel_ore_deepslate", () -> new BlockItem(ROOBlock.NICKEL_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_BASALT = ITEMS.register("nickel_ore_basalt", () -> new BlockItem(ROOBlock.NICKEL_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_BLACKSTONE = ITEMS.register("nickel_ore_blackstone", () -> new BlockItem(ROOBlock.NICKEL_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_NETHERRACK = ITEMS.register("nickel_ore_netherrack", () -> new BlockItem(ROOBlock.NICKEL_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_ORE_END_STONE = ITEMS.register("nickel_ore_end_stone", () -> new BlockItem(ROOBlock.NICKEL_ORE_END_STONE.get(), new Item.Properties()));

    // Zinc
    public static final RegistryObject<Item> ZINC_ORE_ANDESITE = ITEMS.register("zinc_ore_andesite", () -> new BlockItem(ROOBlock.ZINC_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_CALCITE = ITEMS.register("zinc_ore_calcite", () -> new BlockItem(ROOBlock.ZINC_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_CREATE_LIMESTONE = ITEMS.register("zinc_ore_create_limestone", () -> new BlockItem(ROOBlock.ZINC_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_CREATE_SCORCHIA = ITEMS.register("zinc_ore_create_scorchia", () -> new BlockItem(ROOBlock.ZINC_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_CREATE_SCORIA = ITEMS.register("zinc_ore_create_scoria", () -> new BlockItem(ROOBlock.ZINC_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_DIORITE = ITEMS.register("zinc_ore_diorite", () -> new BlockItem(ROOBlock.ZINC_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_GRANITE = ITEMS.register("zinc_ore_granite", () -> new BlockItem(ROOBlock.ZINC_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_QUARK_JASPER = ITEMS.register("zinc_ore_quark_jasper", () -> new BlockItem(ROOBlock.ZINC_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_QUARK_LIMESTONE = ITEMS.register("zinc_ore_quark_limestone", () -> new BlockItem(ROOBlock.ZINC_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_QUARK_SHALE = ITEMS.register("zinc_ore_quark_shale", () -> new BlockItem(ROOBlock.ZINC_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_STONE = ITEMS.register("zinc_ore_stone", () -> new BlockItem(ROOBlock.ZINC_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_TUFF = ITEMS.register("zinc_ore_tuff", () -> new BlockItem(ROOBlock.ZINC_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_DEEPSLATE = ITEMS.register("zinc_ore_deepslate", () -> new BlockItem(ROOBlock.ZINC_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_BASALT = ITEMS.register("zinc_ore_basalt", () -> new BlockItem(ROOBlock.ZINC_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_BLACKSTONE = ITEMS.register("zinc_ore_blackstone", () -> new BlockItem(ROOBlock.ZINC_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_NETHERRACK = ITEMS.register("zinc_ore_netherrack", () -> new BlockItem(ROOBlock.ZINC_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZINC_ORE_END_STONE = ITEMS.register("zinc_ore_end_stone", () -> new BlockItem(ROOBlock.ZINC_ORE_END_STONE.get(), new Item.Properties()));

    // Aluminum
    public static final RegistryObject<Item> ALUMINUM_ORE_ANDESITE = ITEMS.register("aluminum_ore_andesite", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_CALCITE = ITEMS.register("aluminum_ore_calcite", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_CREATE_LIMESTONE = ITEMS.register("aluminum_ore_create_limestone", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_CREATE_SCORCHIA = ITEMS.register("aluminum_ore_create_scorchia", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_CREATE_SCORIA = ITEMS.register("aluminum_ore_create_scoria", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_DIORITE = ITEMS.register("aluminum_ore_diorite", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_GRANITE = ITEMS.register("aluminum_ore_granite", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_QUARK_JASPER = ITEMS.register("aluminum_ore_quark_jasper", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_QUARK_LIMESTONE = ITEMS.register("aluminum_ore_quark_limestone", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_QUARK_SHALE = ITEMS.register("aluminum_ore_quark_shale", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_STONE = ITEMS.register("aluminum_ore_stone", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_TUFF = ITEMS.register("aluminum_ore_tuff", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_DEEPSLATE = ITEMS.register("aluminum_ore_deepslate", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_BASALT = ITEMS.register("aluminum_ore_basalt", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_BLACKSTONE = ITEMS.register("aluminum_ore_blackstone", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_NETHERRACK = ITEMS.register("aluminum_ore_netherrack", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_ORE_END_STONE = ITEMS.register("aluminum_ore_end_stone", () -> new BlockItem(ROOBlock.ALUMINUM_ORE_END_STONE.get(), new Item.Properties()));

    // Cobalt
    public static final RegistryObject<Item> COBALT_ORE_ANDESITE = ITEMS.register("cobalt_ore_andesite", () -> new BlockItem(ROOBlock.COBALT_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_CALCITE = ITEMS.register("cobalt_ore_calcite", () -> new BlockItem(ROOBlock.COBALT_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_CREATE_LIMESTONE = ITEMS.register("cobalt_ore_create_limestone", () -> new BlockItem(ROOBlock.COBALT_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_CREATE_SCORCHIA = ITEMS.register("cobalt_ore_create_scorchia", () -> new BlockItem(ROOBlock.COBALT_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_CREATE_SCORIA = ITEMS.register("cobalt_ore_create_scoria", () -> new BlockItem(ROOBlock.COBALT_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_DIORITE = ITEMS.register("cobalt_ore_diorite", () -> new BlockItem(ROOBlock.COBALT_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_GRANITE = ITEMS.register("cobalt_ore_granite", () -> new BlockItem(ROOBlock.COBALT_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_QUARK_JASPER = ITEMS.register("cobalt_ore_quark_jasper", () -> new BlockItem(ROOBlock.COBALT_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_QUARK_LIMESTONE = ITEMS.register("cobalt_ore_quark_limestone", () -> new BlockItem(ROOBlock.COBALT_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_QUARK_SHALE = ITEMS.register("cobalt_ore_quark_shale", () -> new BlockItem(ROOBlock.COBALT_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_STONE = ITEMS.register("cobalt_ore_stone", () -> new BlockItem(ROOBlock.COBALT_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_TUFF = ITEMS.register("cobalt_ore_tuff", () -> new BlockItem(ROOBlock.COBALT_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_DEEPSLATE = ITEMS.register("cobalt_ore_deepslate", () -> new BlockItem(ROOBlock.COBALT_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_BASALT = ITEMS.register("cobalt_ore_basalt", () -> new BlockItem(ROOBlock.COBALT_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_BLACKSTONE = ITEMS.register("cobalt_ore_blackstone", () -> new BlockItem(ROOBlock.COBALT_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_NETHERRACK = ITEMS.register("cobalt_ore_netherrack", () -> new BlockItem(ROOBlock.COBALT_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> COBALT_ORE_END_STONE = ITEMS.register("cobalt_ore_end_stone", () -> new BlockItem(ROOBlock.COBALT_ORE_END_STONE.get(), new Item.Properties()));

    // Osmium
    public static final RegistryObject<Item> OSMIUM_ORE_ANDESITE = ITEMS.register("osmium_ore_andesite", () -> new BlockItem(ROOBlock.OSMIUM_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_CALCITE = ITEMS.register("osmium_ore_calcite", () -> new BlockItem(ROOBlock.OSMIUM_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_CREATE_LIMESTONE = ITEMS.register("osmium_ore_create_limestone", () -> new BlockItem(ROOBlock.OSMIUM_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_CREATE_SCORCHIA = ITEMS.register("osmium_ore_create_scorchia", () -> new BlockItem(ROOBlock.OSMIUM_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_CREATE_SCORIA = ITEMS.register("osmium_ore_create_scoria", () -> new BlockItem(ROOBlock.OSMIUM_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_DIORITE = ITEMS.register("osmium_ore_diorite", () -> new BlockItem(ROOBlock.OSMIUM_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_GRANITE = ITEMS.register("osmium_ore_granite", () -> new BlockItem(ROOBlock.OSMIUM_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_QUARK_JASPER = ITEMS.register("osmium_ore_quark_jasper", () -> new BlockItem(ROOBlock.OSMIUM_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_QUARK_LIMESTONE = ITEMS.register("osmium_ore_quark_limestone", () -> new BlockItem(ROOBlock.OSMIUM_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_QUARK_SHALE = ITEMS.register("osmium_ore_quark_shale", () -> new BlockItem(ROOBlock.OSMIUM_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_STONE = ITEMS.register("osmium_ore_stone", () -> new BlockItem(ROOBlock.OSMIUM_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_TUFF = ITEMS.register("osmium_ore_tuff", () -> new BlockItem(ROOBlock.OSMIUM_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_DEEPSLATE = ITEMS.register("osmium_ore_deepslate", () -> new BlockItem(ROOBlock.OSMIUM_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_BASALT = ITEMS.register("osmium_ore_basalt", () -> new BlockItem(ROOBlock.OSMIUM_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_BLACKSTONE = ITEMS.register("osmium_ore_blackstone", () -> new BlockItem(ROOBlock.OSMIUM_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_NETHERRACK = ITEMS.register("osmium_ore_netherrack", () -> new BlockItem(ROOBlock.OSMIUM_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_ORE_END_STONE = ITEMS.register("osmium_ore_end_stone", () -> new BlockItem(ROOBlock.OSMIUM_ORE_END_STONE.get(), new Item.Properties()));

    // Iridium
    public static final RegistryObject<Item> IRIDIUM_ORE_ANDESITE = ITEMS.register("iridium_ore_andesite", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_CALCITE = ITEMS.register("iridium_ore_calcite", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_CREATE_LIMESTONE = ITEMS.register("iridium_ore_create_limestone", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_CREATE_SCORCHIA = ITEMS.register("iridium_ore_create_scorchia", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_CREATE_SCORIA = ITEMS.register("iridium_ore_create_scoria", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_DIORITE = ITEMS.register("iridium_ore_diorite", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_GRANITE = ITEMS.register("iridium_ore_granite", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_QUARK_JASPER = ITEMS.register("iridium_ore_quark_jasper", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_QUARK_LIMESTONE = ITEMS.register("iridium_ore_quark_limestone", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_QUARK_SHALE = ITEMS.register("iridium_ore_quark_shale", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_STONE = ITEMS.register("iridium_ore_stone", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_TUFF = ITEMS.register("iridium_ore_tuff", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_DEEPSLATE = ITEMS.register("iridium_ore_deepslate", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_BASALT = ITEMS.register("iridium_ore_basalt", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_BLACKSTONE = ITEMS.register("iridium_ore_blackstone", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_NETHERRACK = ITEMS.register("iridium_ore_netherrack", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_ORE_END_STONE = ITEMS.register("iridium_ore_end_stone", () -> new BlockItem(ROOBlock.IRIDIUM_ORE_END_STONE.get(), new Item.Properties()));

    // Uranium
    public static final RegistryObject<Item> URANIUM_ORE_ANDESITE = ITEMS.register("uranium_ore_andesite", () -> new BlockItem(ROOBlock.URANIUM_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_CALCITE = ITEMS.register("uranium_ore_calcite", () -> new BlockItem(ROOBlock.URANIUM_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_CREATE_LIMESTONE = ITEMS.register("uranium_ore_create_limestone", () -> new BlockItem(ROOBlock.URANIUM_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_CREATE_SCORCHIA = ITEMS.register("uranium_ore_create_scorchia", () -> new BlockItem(ROOBlock.URANIUM_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_CREATE_SCORIA = ITEMS.register("uranium_ore_create_scoria", () -> new BlockItem(ROOBlock.URANIUM_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_DIORITE = ITEMS.register("uranium_ore_diorite", () -> new BlockItem(ROOBlock.URANIUM_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_GRANITE = ITEMS.register("uranium_ore_granite", () -> new BlockItem(ROOBlock.URANIUM_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_QUARK_JASPER = ITEMS.register("uranium_ore_quark_jasper", () -> new BlockItem(ROOBlock.URANIUM_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_QUARK_LIMESTONE = ITEMS.register("uranium_ore_quark_limestone", () -> new BlockItem(ROOBlock.URANIUM_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_QUARK_SHALE = ITEMS.register("uranium_ore_quark_shale", () -> new BlockItem(ROOBlock.URANIUM_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_STONE = ITEMS.register("uranium_ore_stone", () -> new BlockItem(ROOBlock.URANIUM_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_TUFF = ITEMS.register("uranium_ore_tuff", () -> new BlockItem(ROOBlock.URANIUM_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_DEEPSLATE = ITEMS.register("uranium_ore_deepslate", () -> new BlockItem(ROOBlock.URANIUM_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_BASALT = ITEMS.register("uranium_ore_basalt", () -> new BlockItem(ROOBlock.URANIUM_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_BLACKSTONE = ITEMS.register("uranium_ore_blackstone", () -> new BlockItem(ROOBlock.URANIUM_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_NETHERRACK = ITEMS.register("uranium_ore_netherrack", () -> new BlockItem(ROOBlock.URANIUM_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ORE_END_STONE = ITEMS.register("uranium_ore_end_stone", () -> new BlockItem(ROOBlock.URANIUM_ORE_END_STONE.get(), new Item.Properties()));

    // Ruby
    public static final RegistryObject<Item> RUBY_ORE_ANDESITE = ITEMS.register("ruby_ore_andesite", () -> new BlockItem(ROOBlock.RUBY_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_CALCITE = ITEMS.register("ruby_ore_calcite", () -> new BlockItem(ROOBlock.RUBY_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_CREATE_LIMESTONE = ITEMS.register("ruby_ore_create_limestone", () -> new BlockItem(ROOBlock.RUBY_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_CREATE_SCORCHIA = ITEMS.register("ruby_ore_create_scorchia", () -> new BlockItem(ROOBlock.RUBY_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_CREATE_SCORIA = ITEMS.register("ruby_ore_create_scoria", () -> new BlockItem(ROOBlock.RUBY_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_DIORITE = ITEMS.register("ruby_ore_diorite", () -> new BlockItem(ROOBlock.RUBY_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_GRANITE = ITEMS.register("ruby_ore_granite", () -> new BlockItem(ROOBlock.RUBY_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_QUARK_JASPER = ITEMS.register("ruby_ore_quark_jasper", () -> new BlockItem(ROOBlock.RUBY_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_QUARK_LIMESTONE = ITEMS.register("ruby_ore_quark_limestone", () -> new BlockItem(ROOBlock.RUBY_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_QUARK_SHALE = ITEMS.register("ruby_ore_quark_shale", () -> new BlockItem(ROOBlock.RUBY_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_STONE = ITEMS.register("ruby_ore_stone", () -> new BlockItem(ROOBlock.RUBY_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_TUFF = ITEMS.register("ruby_ore_tuff", () -> new BlockItem(ROOBlock.RUBY_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_DEEPSLATE = ITEMS.register("ruby_ore_deepslate", () -> new BlockItem(ROOBlock.RUBY_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_BASALT = ITEMS.register("ruby_ore_basalt", () -> new BlockItem(ROOBlock.RUBY_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_BLACKSTONE = ITEMS.register("ruby_ore_blackstone", () -> new BlockItem(ROOBlock.RUBY_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_NETHERRACK = ITEMS.register("ruby_ore_netherrack", () -> new BlockItem(ROOBlock.RUBY_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> RUBY_ORE_END_STONE = ITEMS.register("ruby_ore_end_stone", () -> new BlockItem(ROOBlock.RUBY_ORE_END_STONE.get(), new Item.Properties()));

    // Sapphire
    public static final RegistryObject<Item> SAPPHIRE_ORE_ANDESITE = ITEMS.register("sapphire_ore_andesite", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_CALCITE = ITEMS.register("sapphire_ore_calcite", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_CREATE_LIMESTONE = ITEMS.register("sapphire_ore_create_limestone", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_CREATE_SCORCHIA = ITEMS.register("sapphire_ore_create_scorchia", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_CREATE_SCORIA = ITEMS.register("sapphire_ore_create_scoria", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_DIORITE = ITEMS.register("sapphire_ore_diorite", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_GRANITE = ITEMS.register("sapphire_ore_granite", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_QUARK_JASPER = ITEMS.register("sapphire_ore_quark_jasper", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_QUARK_LIMESTONE = ITEMS.register("sapphire_ore_quark_limestone", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_QUARK_SHALE = ITEMS.register("sapphire_ore_quark_shale", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_STONE = ITEMS.register("sapphire_ore_stone", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_TUFF = ITEMS.register("sapphire_ore_tuff", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_DEEPSLATE = ITEMS.register("sapphire_ore_deepslate", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_BASALT = ITEMS.register("sapphire_ore_basalt", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_BLACKSTONE = ITEMS.register("sapphire_ore_blackstone", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_NETHERRACK = ITEMS.register("sapphire_ore_netherrack", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_ORE_END_STONE = ITEMS.register("sapphire_ore_end_stone", () -> new BlockItem(ROOBlock.SAPPHIRE_ORE_END_STONE.get(), new Item.Properties()));

    // Sulfur
    public static final RegistryObject<Item> SULFUR_ORE_ANDESITE = ITEMS.register("sulfur_ore_andesite", () -> new BlockItem(ROOBlock.SULFUR_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_CALCITE = ITEMS.register("sulfur_ore_calcite", () -> new BlockItem(ROOBlock.SULFUR_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_CREATE_LIMESTONE = ITEMS.register("sulfur_ore_create_limestone", () -> new BlockItem(ROOBlock.SULFUR_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_CREATE_SCORCHIA = ITEMS.register("sulfur_ore_create_scorchia", () -> new BlockItem(ROOBlock.SULFUR_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_CREATE_SCORIA = ITEMS.register("sulfur_ore_create_scoria", () -> new BlockItem(ROOBlock.SULFUR_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_DIORITE = ITEMS.register("sulfur_ore_diorite", () -> new BlockItem(ROOBlock.SULFUR_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_GRANITE = ITEMS.register("sulfur_ore_granite", () -> new BlockItem(ROOBlock.SULFUR_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_QUARK_JASPER = ITEMS.register("sulfur_ore_quark_jasper", () -> new BlockItem(ROOBlock.SULFUR_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_QUARK_LIMESTONE = ITEMS.register("sulfur_ore_quark_limestone", () -> new BlockItem(ROOBlock.SULFUR_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_QUARK_SHALE = ITEMS.register("sulfur_ore_quark_shale", () -> new BlockItem(ROOBlock.SULFUR_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_STONE = ITEMS.register("sulfur_ore_stone", () -> new BlockItem(ROOBlock.SULFUR_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_TUFF = ITEMS.register("sulfur_ore_tuff", () -> new BlockItem(ROOBlock.SULFUR_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_DEEPSLATE = ITEMS.register("sulfur_ore_deepslate", () -> new BlockItem(ROOBlock.SULFUR_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_BASALT = ITEMS.register("sulfur_ore_basalt", () -> new BlockItem(ROOBlock.SULFUR_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_BLACKSTONE = ITEMS.register("sulfur_ore_blackstone", () -> new BlockItem(ROOBlock.SULFUR_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_NETHERRACK = ITEMS.register("sulfur_ore_netherrack", () -> new BlockItem(ROOBlock.SULFUR_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SULFUR_ORE_END_STONE = ITEMS.register("sulfur_ore_end_stone", () -> new BlockItem(ROOBlock.SULFUR_ORE_END_STONE.get(), new Item.Properties()));

    // Cinnabar
    public static final RegistryObject<Item> CINNABAR_ORE_ANDESITE = ITEMS.register("cinnabar_ore_andesite", () -> new BlockItem(ROOBlock.CINNABAR_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_CALCITE = ITEMS.register("cinnabar_ore_calcite", () -> new BlockItem(ROOBlock.CINNABAR_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_CREATE_LIMESTONE = ITEMS.register("cinnabar_ore_create_limestone", () -> new BlockItem(ROOBlock.CINNABAR_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_CREATE_SCORCHIA = ITEMS.register("cinnabar_ore_create_scorchia", () -> new BlockItem(ROOBlock.CINNABAR_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_CREATE_SCORIA = ITEMS.register("cinnabar_ore_create_scoria", () -> new BlockItem(ROOBlock.CINNABAR_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_DIORITE = ITEMS.register("cinnabar_ore_diorite", () -> new BlockItem(ROOBlock.CINNABAR_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_GRANITE = ITEMS.register("cinnabar_ore_granite", () -> new BlockItem(ROOBlock.CINNABAR_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_QUARK_JASPER = ITEMS.register("cinnabar_ore_quark_jasper", () -> new BlockItem(ROOBlock.CINNABAR_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_QUARK_LIMESTONE = ITEMS.register("cinnabar_ore_quark_limestone", () -> new BlockItem(ROOBlock.CINNABAR_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_QUARK_SHALE = ITEMS.register("cinnabar_ore_quark_shale", () -> new BlockItem(ROOBlock.CINNABAR_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_STONE = ITEMS.register("cinnabar_ore_stone", () -> new BlockItem(ROOBlock.CINNABAR_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_TUFF = ITEMS.register("cinnabar_ore_tuff", () -> new BlockItem(ROOBlock.CINNABAR_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_DEEPSLATE = ITEMS.register("cinnabar_ore_deepslate", () -> new BlockItem(ROOBlock.CINNABAR_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_BASALT = ITEMS.register("cinnabar_ore_basalt", () -> new BlockItem(ROOBlock.CINNABAR_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_BLACKSTONE = ITEMS.register("cinnabar_ore_blackstone", () -> new BlockItem(ROOBlock.CINNABAR_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_NETHERRACK = ITEMS.register("cinnabar_ore_netherrack", () -> new BlockItem(ROOBlock.CINNABAR_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_ORE_END_STONE = ITEMS.register("cinnabar_ore_end_stone", () -> new BlockItem(ROOBlock.CINNABAR_ORE_END_STONE.get(), new Item.Properties()));

    // Potassium Nitrate
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_ANDESITE = ITEMS.register("potassium_nitrate_ore_andesite", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_CALCITE = ITEMS.register("potassium_nitrate_ore_calcite", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_CREATE_LIMESTONE = ITEMS.register("potassium_nitrate_ore_create_limestone", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_CREATE_SCORCHIA = ITEMS.register("potassium_nitrate_ore_create_scorchia", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_CREATE_SCORIA = ITEMS.register("potassium_nitrate_ore_create_scoria", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_DIORITE = ITEMS.register("potassium_nitrate_ore_diorite", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_GRANITE = ITEMS.register("potassium_nitrate_ore_granite", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_QUARK_JASPER = ITEMS.register("potassium_nitrate_ore_quark_jasper", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_QUARK_LIMESTONE = ITEMS.register("potassium_nitrate_ore_quark_limestone", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_QUARK_SHALE = ITEMS.register("potassium_nitrate_ore_quark_shale", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_STONE = ITEMS.register("potassium_nitrate_ore_stone", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_TUFF = ITEMS.register("potassium_nitrate_ore_tuff", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_DEEPSLATE = ITEMS.register("potassium_nitrate_ore_deepslate", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_BASALT = ITEMS.register("potassium_nitrate_ore_basalt", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_BLACKSTONE = ITEMS.register("potassium_nitrate_ore_blackstone", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_NETHERRACK = ITEMS.register("potassium_nitrate_ore_netherrack", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NITRATE_ORE_END_STONE = ITEMS.register("potassium_nitrate_ore_end_stone", () -> new BlockItem(ROOBlock.POTASSIUM_NITRATE_ORE_END_STONE.get(), new Item.Properties()));

    // Apatite
    public static final RegistryObject<Item> APATITE_ORE_ANDESITE = ITEMS.register("apatite_ore_andesite", () -> new BlockItem(ROOBlock.APATITE_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_CALCITE = ITEMS.register("apatite_ore_calcite", () -> new BlockItem(ROOBlock.APATITE_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_CREATE_LIMESTONE = ITEMS.register("apatite_ore_create_limestone", () -> new BlockItem(ROOBlock.APATITE_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_CREATE_SCORCHIA = ITEMS.register("apatite_ore_create_scorchia", () -> new BlockItem(ROOBlock.APATITE_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_CREATE_SCORIA = ITEMS.register("apatite_ore_create_scoria", () -> new BlockItem(ROOBlock.APATITE_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_DIORITE = ITEMS.register("apatite_ore_diorite", () -> new BlockItem(ROOBlock.APATITE_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_GRANITE = ITEMS.register("apatite_ore_granite", () -> new BlockItem(ROOBlock.APATITE_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_QUARK_JASPER = ITEMS.register("apatite_ore_quark_jasper", () -> new BlockItem(ROOBlock.APATITE_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_QUARK_LIMESTONE = ITEMS.register("apatite_ore_quark_limestone", () -> new BlockItem(ROOBlock.APATITE_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_QUARK_SHALE = ITEMS.register("apatite_ore_quark_shale", () -> new BlockItem(ROOBlock.APATITE_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_STONE = ITEMS.register("apatite_ore_stone", () -> new BlockItem(ROOBlock.APATITE_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_TUFF = ITEMS.register("apatite_ore_tuff", () -> new BlockItem(ROOBlock.APATITE_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_DEEPSLATE = ITEMS.register("apatite_ore_deepslate", () -> new BlockItem(ROOBlock.APATITE_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_BASALT = ITEMS.register("apatite_ore_basalt", () -> new BlockItem(ROOBlock.APATITE_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_BLACKSTONE = ITEMS.register("apatite_ore_blackstone", () -> new BlockItem(ROOBlock.APATITE_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_NETHERRACK = ITEMS.register("apatite_ore_netherrack", () -> new BlockItem(ROOBlock.APATITE_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> APATITE_ORE_END_STONE = ITEMS.register("apatite_ore_end_stone", () -> new BlockItem(ROOBlock.APATITE_ORE_END_STONE.get(), new Item.Properties()));

    // Fluorite
    public static final RegistryObject<Item> FLUORITE_ORE_ANDESITE = ITEMS.register("fluorite_ore_andesite", () -> new BlockItem(ROOBlock.FLUORITE_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_CALCITE = ITEMS.register("fluorite_ore_calcite", () -> new BlockItem(ROOBlock.FLUORITE_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_CREATE_LIMESTONE = ITEMS.register("fluorite_ore_create_limestone", () -> new BlockItem(ROOBlock.FLUORITE_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_CREATE_SCORCHIA = ITEMS.register("fluorite_ore_create_scorchia", () -> new BlockItem(ROOBlock.FLUORITE_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_CREATE_SCORIA = ITEMS.register("fluorite_ore_create_scoria", () -> new BlockItem(ROOBlock.FLUORITE_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_DIORITE = ITEMS.register("fluorite_ore_diorite", () -> new BlockItem(ROOBlock.FLUORITE_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_GRANITE = ITEMS.register("fluorite_ore_granite", () -> new BlockItem(ROOBlock.FLUORITE_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_QUARK_JASPER = ITEMS.register("fluorite_ore_quark_jasper", () -> new BlockItem(ROOBlock.FLUORITE_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_QUARK_LIMESTONE = ITEMS.register("fluorite_ore_quark_limestone", () -> new BlockItem(ROOBlock.FLUORITE_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_QUARK_SHALE = ITEMS.register("fluorite_ore_quark_shale", () -> new BlockItem(ROOBlock.FLUORITE_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_STONE = ITEMS.register("fluorite_ore_stone", () -> new BlockItem(ROOBlock.FLUORITE_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_TUFF = ITEMS.register("fluorite_ore_tuff", () -> new BlockItem(ROOBlock.FLUORITE_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_DEEPSLATE = ITEMS.register("fluorite_ore_deepslate", () -> new BlockItem(ROOBlock.FLUORITE_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_BASALT = ITEMS.register("fluorite_ore_basalt", () -> new BlockItem(ROOBlock.FLUORITE_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_BLACKSTONE = ITEMS.register("fluorite_ore_blackstone", () -> new BlockItem(ROOBlock.FLUORITE_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_NETHERRACK = ITEMS.register("fluorite_ore_netherrack", () -> new BlockItem(ROOBlock.FLUORITE_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLUORITE_ORE_END_STONE = ITEMS.register("fluorite_ore_end_stone", () -> new BlockItem(ROOBlock.FLUORITE_ORE_END_STONE.get(), new Item.Properties()));

    // Silver
    public static final RegistryObject<Item> SILVER_ORE_ANDESITE = ITEMS.register("silver_ore_andesite", () -> new BlockItem(ROOBlock.SILVER_ORE_ANDESITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_CALCITE = ITEMS.register("silver_ore_calcite", () -> new BlockItem(ROOBlock.SILVER_ORE_CALCITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_CREATE_LIMESTONE = ITEMS.register("silver_ore_create_limestone", () -> new BlockItem(ROOBlock.SILVER_ORE_CREATE_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_CREATE_SCORCHIA = ITEMS.register("silver_ore_create_scorchia", () -> new BlockItem(ROOBlock.SILVER_ORE_CREATE_SCORCHIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_CREATE_SCORIA = ITEMS.register("silver_ore_create_scoria", () -> new BlockItem(ROOBlock.SILVER_ORE_CREATE_SCORIA.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_DIORITE = ITEMS.register("silver_ore_diorite", () -> new BlockItem(ROOBlock.SILVER_ORE_DIORITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_GRANITE = ITEMS.register("silver_ore_granite", () -> new BlockItem(ROOBlock.SILVER_ORE_GRANITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_QUARK_JASPER = ITEMS.register("silver_ore_quark_jasper", () -> new BlockItem(ROOBlock.SILVER_ORE_QUARK_JASPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_QUARK_LIMESTONE = ITEMS.register("silver_ore_quark_limestone", () -> new BlockItem(ROOBlock.SILVER_ORE_QUARK_LIMESTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_QUARK_SHALE = ITEMS.register("silver_ore_quark_shale", () -> new BlockItem(ROOBlock.SILVER_ORE_QUARK_SHALE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_STONE = ITEMS.register("silver_ore_stone", () -> new BlockItem(ROOBlock.SILVER_ORE_STONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_TUFF = ITEMS.register("silver_ore_tuff", () -> new BlockItem(ROOBlock.SILVER_ORE_TUFF.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_DEEPSLATE = ITEMS.register("silver_ore_deepslate", () -> new BlockItem(ROOBlock.SILVER_ORE_DEEPSLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_BASALT = ITEMS.register("silver_ore_basalt", () -> new BlockItem(ROOBlock.SILVER_ORE_BASALT.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_BLACKSTONE = ITEMS.register("silver_ore_blackstone", () -> new BlockItem(ROOBlock.SILVER_ORE_BLACKSTONE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_NETHERRACK = ITEMS.register("silver_ore_netherrack", () -> new BlockItem(ROOBlock.SILVER_ORE_NETHERRACK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_ORE_END_STONE = ITEMS.register("silver_ore_end_stone", () -> new BlockItem(ROOBlock.SILVER_ORE_END_STONE.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
