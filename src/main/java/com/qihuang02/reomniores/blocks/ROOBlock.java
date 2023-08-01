package com.qihuang02.reomniores.blocks;

import com.qihuang02.reomniores.ReOmniOres;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ROOBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ReOmniOres.MODID);

    //STONE
    public static final BlockBehaviour.Properties OVERWORLD_ORES =
            BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE);
    //DEEPSTONE
    public static final BlockBehaviour.Properties OVERWORLD_ORES_HARD =
            BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE);
    //NETHER_ORES
    public static final BlockBehaviour.Properties NETHER_ORES =
            BlockBehaviour.Properties.copy(Blocks.NETHERRACK).requiresCorrectToolForDrops().strength(3.0f, 3.0F).sound(SoundType.NETHER_ORE);
    //END_ORES
    public static final BlockBehaviour.Properties END_ORES =
            BlockBehaviour.Properties.copy(Blocks.END_STONE).requiresCorrectToolForDrops().strength(3.0F, 7.0F).sound(SoundType.STONE);
    //STORAGE_BLOCK
    public static final BlockBehaviour.Properties STORAGE_BLOCK =
            BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL);

    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> URANIUM_BLOCK = BLOCKS.register("uranium_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> BRASS_BLOCK = BLOCKS.register("brass_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = BLOCKS.register("electrum_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> INVAR_BLOCK = BLOCKS.register("invar_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> CONSTANTAN_BLOCK = BLOCKS.register("constantan_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> SIGNALUM_BLOCK = BLOCKS.register("signalum_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> LUMIUM_BLOCK = BLOCKS.register("lumium_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> ENDERIUM_BLOCK = BLOCKS.register("enderium_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> SULFUR_BLOCK = BLOCKS.register("sulfur_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> CINNABAR_BLOCK = BLOCKS.register("cinnabar_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_BLOCK = BLOCKS.register("potassium_nitrate_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> APATITE_BLOCK = BLOCKS.register("apatite_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> FLUORITE_BLOCK = BLOCKS.register("fluorite_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> COAL_COKE_BLOCK = BLOCKS.register("coal_coke_block", () -> new Block(STORAGE_BLOCK));
    public static final RegistryObject<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", () -> new Block(STORAGE_BLOCK));

    //COAl
    public static final RegistryObject<Block> COAL_ORE_ANDESITE = BLOCKS.register("coal_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_CALCITE = BLOCKS.register("coal_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_CREATE_LIMESTONE = BLOCKS.register("coal_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_CREATE_SCORCHIA = BLOCKS.register("coal_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_CREATE_SCORIA = BLOCKS.register("coal_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_DIORITE = BLOCKS.register("coal_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_GRANITE = BLOCKS.register("coal_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_QUARK_JASPER = BLOCKS.register("coal_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_QUARK_LIMESTONE = BLOCKS.register("coal_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_QUARK_SHALE = BLOCKS.register("coal_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_STONE = BLOCKS.register("coal_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_TUFF = BLOCKS.register("coal_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COAL_ORE_DEEPSLATE = BLOCKS.register("coal_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> COAL_ORE_BASALT = BLOCKS.register("coal_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COAL_ORE_BLACKSTONE = BLOCKS.register("coal_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COAL_ORE_NETHERRACK = BLOCKS.register("coal_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COAL_ORE_END_STONE = BLOCKS.register("coal_ore_end_stone", () -> new Block(END_ORES));

    // IRON
    public static final RegistryObject<Block> IRON_ORE_ANDESITE = BLOCKS.register("iron_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_CALCITE = BLOCKS.register("iron_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_CREATE_LIMESTONE = BLOCKS.register("iron_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_CREATE_SCORCHIA = BLOCKS.register("iron_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_CREATE_SCORIA = BLOCKS.register("iron_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_DIORITE = BLOCKS.register("iron_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_GRANITE = BLOCKS.register("iron_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_QUARK_JASPER = BLOCKS.register("iron_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_QUARK_LIMESTONE = BLOCKS.register("iron_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_QUARK_SHALE = BLOCKS.register("iron_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_STONE = BLOCKS.register("iron_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_TUFF = BLOCKS.register("iron_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRON_ORE_DEEPSLATE = BLOCKS.register("iron_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> IRON_ORE_BASALT = BLOCKS.register("iron_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> IRON_ORE_BLACKSTONE = BLOCKS.register("iron_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> IRON_ORE_NETHERRACK = BLOCKS.register("iron_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> IRON_ORE_END_STONE = BLOCKS.register("iron_ore_end_stone", () -> new Block(END_ORES));

    // Gold
    public static final RegistryObject<Block> GOLD_ORE_ANDESITE = BLOCKS.register("gold_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_CALCITE = BLOCKS.register("gold_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_CREATE_LIMESTONE = BLOCKS.register("gold_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_CREATE_SCORCHIA = BLOCKS.register("gold_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_CREATE_SCORIA = BLOCKS.register("gold_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_DIORITE = BLOCKS.register("gold_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_GRANITE = BLOCKS.register("gold_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_QUARK_JASPER = BLOCKS.register("gold_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_QUARK_LIMESTONE = BLOCKS.register("gold_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_QUARK_SHALE = BLOCKS.register("gold_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_STONE = BLOCKS.register("gold_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_TUFF = BLOCKS.register("gold_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> GOLD_ORE_DEEPSLATE = BLOCKS.register("gold_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> GOLD_ORE_BASALT = BLOCKS.register("gold_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> GOLD_ORE_BLACKSTONE = BLOCKS.register("gold_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> GOLD_ORE_NETHERRACK = BLOCKS.register("gold_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> GOLD_ORE_END_STONE = BLOCKS.register("gold_ore_end_stone", () -> new Block(END_ORES));

    // Copper
    public static final RegistryObject<Block> COPPER_ORE_ANDESITE = BLOCKS.register("copper_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_CALCITE = BLOCKS.register("copper_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_CREATE_LIMESTONE = BLOCKS.register("copper_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_CREATE_SCORCHIA = BLOCKS.register("copper_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_CREATE_SCORIA = BLOCKS.register("copper_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_DIORITE = BLOCKS.register("copper_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_GRANITE = BLOCKS.register("copper_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_QUARK_JASPER = BLOCKS.register("copper_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_QUARK_LIMESTONE = BLOCKS.register("copper_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_QUARK_SHALE = BLOCKS.register("copper_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_STONE = BLOCKS.register("copper_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_TUFF = BLOCKS.register("copper_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COPPER_ORE_DEEPSLATE = BLOCKS.register("copper_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> COPPER_ORE_BASALT = BLOCKS.register("copper_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COPPER_ORE_BLACKSTONE = BLOCKS.register("copper_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COPPER_ORE_NETHERRACK = BLOCKS.register("copper_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COPPER_ORE_END_STONE = BLOCKS.register("copper_ore_end_stone", () -> new Block(END_ORES));

    // Redstone
    public static final RegistryObject<Block> REDSTONE_ORE_ANDESITE = BLOCKS.register("redstone_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_CALCITE = BLOCKS.register("redstone_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_CREATE_LIMESTONE = BLOCKS.register("redstone_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_CREATE_SCORCHIA = BLOCKS.register("redstone_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_CREATE_SCORIA = BLOCKS.register("redstone_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_DIORITE = BLOCKS.register("redstone_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_GRANITE = BLOCKS.register("redstone_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_QUARK_JASPER = BLOCKS.register("redstone_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_QUARK_LIMESTONE = BLOCKS.register("redstone_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_QUARK_SHALE = BLOCKS.register("redstone_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_STONE = BLOCKS.register("redstone_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_TUFF = BLOCKS.register("redstone_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_DEEPSLATE = BLOCKS.register("redstone_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> REDSTONE_ORE_BASALT = BLOCKS.register("redstone_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_BLACKSTONE = BLOCKS.register("redstone_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_NETHERRACK = BLOCKS.register("redstone_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> REDSTONE_ORE_END_STONE = BLOCKS.register("redstone_ore_end_stone", () -> new Block(END_ORES));

    // Lapis
    public static final RegistryObject<Block> LAPIS_ORE_ANDESITE = BLOCKS.register("lapis_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_CALCITE = BLOCKS.register("lapis_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_CREATE_LIMESTONE = BLOCKS.register("lapis_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_CREATE_SCORCHIA = BLOCKS.register("lapis_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_CREATE_SCORIA = BLOCKS.register("lapis_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_DIORITE = BLOCKS.register("lapis_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_GRANITE = BLOCKS.register("lapis_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_QUARK_JASPER = BLOCKS.register("lapis_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_QUARK_LIMESTONE = BLOCKS.register("lapis_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_QUARK_SHALE = BLOCKS.register("lapis_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_STONE = BLOCKS.register("lapis_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_TUFF = BLOCKS.register("lapis_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_DEEPSLATE = BLOCKS.register("lapis_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> LAPIS_ORE_BASALT = BLOCKS.register("lapis_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_BLACKSTONE = BLOCKS.register("lapis_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_NETHERRACK = BLOCKS.register("lapis_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> LAPIS_ORE_END_STONE = BLOCKS.register("lapis_ore_end_stone", () -> new Block(END_ORES));

    // Diamond
    public static final RegistryObject<Block> DIAMOND_ORE_ANDESITE = BLOCKS.register("diamond_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_CALCITE = BLOCKS.register("diamond_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_CREATE_LIMESTONE = BLOCKS.register("diamond_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_CREATE_SCORCHIA = BLOCKS.register("diamond_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_CREATE_SCORIA = BLOCKS.register("diamond_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_DIORITE = BLOCKS.register("diamond_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_GRANITE = BLOCKS.register("diamond_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_QUARK_JASPER = BLOCKS.register("diamond_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_QUARK_LIMESTONE = BLOCKS.register("diamond_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_QUARK_SHALE = BLOCKS.register("diamond_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_STONE = BLOCKS.register("diamond_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_TUFF = BLOCKS.register("diamond_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_DEEPSLATE = BLOCKS.register("diamond_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> DIAMOND_ORE_BASALT = BLOCKS.register("diamond_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_BLACKSTONE = BLOCKS.register("diamond_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_NETHERRACK = BLOCKS.register("diamond_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> DIAMOND_ORE_END_STONE = BLOCKS.register("diamond_ore_end_stone", () -> new Block(END_ORES));

    // Emerald
    public static final RegistryObject<Block> EMERALD_ORE_ANDESITE = BLOCKS.register("emerald_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_CALCITE = BLOCKS.register("emerald_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_CREATE_LIMESTONE = BLOCKS.register("emerald_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_CREATE_SCORCHIA = BLOCKS.register("emerald_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_CREATE_SCORIA = BLOCKS.register("emerald_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_DIORITE = BLOCKS.register("emerald_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_GRANITE = BLOCKS.register("emerald_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_QUARK_JASPER = BLOCKS.register("emerald_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_QUARK_LIMESTONE = BLOCKS.register("emerald_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_QUARK_SHALE = BLOCKS.register("emerald_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_STONE = BLOCKS.register("emerald_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_TUFF = BLOCKS.register("emerald_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_DEEPSLATE = BLOCKS.register("emerald_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> EMERALD_ORE_BASALT = BLOCKS.register("emerald_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_BLACKSTONE = BLOCKS.register("emerald_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_NETHERRACK = BLOCKS.register("emerald_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> EMERALD_ORE_END_STONE = BLOCKS.register("emerald_ore_end_stone", () -> new Block(END_ORES));

    // Quartz
    public static final RegistryObject<Block> QUARTZ_ORE_ANDESITE = BLOCKS.register("quartz_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_CALCITE = BLOCKS.register("quartz_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_CREATE_LIMESTONE = BLOCKS.register("quartz_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_CREATE_SCORCHIA = BLOCKS.register("quartz_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_CREATE_SCORIA = BLOCKS.register("quartz_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_DIORITE = BLOCKS.register("quartz_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_GRANITE = BLOCKS.register("quartz_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_QUARK_JASPER = BLOCKS.register("quartz_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_QUARK_LIMESTONE = BLOCKS.register("quartz_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_QUARK_SHALE = BLOCKS.register("quartz_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_STONE = BLOCKS.register("quartz_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_TUFF = BLOCKS.register("quartz_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_DEEPSLATE = BLOCKS.register("quartz_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> QUARTZ_ORE_BASALT = BLOCKS.register("quartz_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_BLACKSTONE = BLOCKS.register("quartz_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_NETHERRACK = BLOCKS.register("quartz_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> QUARTZ_ORE_END_STONE = BLOCKS.register("quartz_ore_end_stone", () -> new Block(END_ORES));

    // Tin
    public static final RegistryObject<Block> TIN_ORE_ANDESITE = BLOCKS.register("tin_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_CALCITE = BLOCKS.register("tin_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_CREATE_LIMESTONE = BLOCKS.register("tin_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_CREATE_SCORCHIA = BLOCKS.register("tin_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_CREATE_SCORIA = BLOCKS.register("tin_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_DIORITE = BLOCKS.register("tin_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_GRANITE = BLOCKS.register("tin_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_QUARK_JASPER = BLOCKS.register("tin_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_QUARK_LIMESTONE = BLOCKS.register("tin_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_QUARK_SHALE = BLOCKS.register("tin_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_STONE = BLOCKS.register("tin_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_TUFF = BLOCKS.register("tin_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> TIN_ORE_DEEPSLATE = BLOCKS.register("tin_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> TIN_ORE_BASALT = BLOCKS.register("tin_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> TIN_ORE_BLACKSTONE = BLOCKS.register("tin_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> TIN_ORE_NETHERRACK = BLOCKS.register("tin_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> TIN_ORE_END_STONE = BLOCKS.register("tin_ore_end_stone", () -> new Block(END_ORES));

    // Lead
    public static final RegistryObject<Block> LEAD_ORE_ANDESITE = BLOCKS.register("lead_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_CALCITE = BLOCKS.register("lead_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_CREATE_LIMESTONE = BLOCKS.register("lead_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_CREATE_SCORCHIA = BLOCKS.register("lead_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_CREATE_SCORIA = BLOCKS.register("lead_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_DIORITE = BLOCKS.register("lead_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_GRANITE = BLOCKS.register("lead_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_QUARK_JASPER = BLOCKS.register("lead_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_QUARK_LIMESTONE = BLOCKS.register("lead_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_QUARK_SHALE = BLOCKS.register("lead_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_STONE = BLOCKS.register("lead_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_TUFF = BLOCKS.register("lead_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> LEAD_ORE_DEEPSLATE = BLOCKS.register("lead_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> LEAD_ORE_BASALT = BLOCKS.register("lead_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> LEAD_ORE_BLACKSTONE = BLOCKS.register("lead_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> LEAD_ORE_NETHERRACK = BLOCKS.register("lead_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> LEAD_ORE_END_STONE = BLOCKS.register("lead_ore_end_stone", () -> new Block(END_ORES));

    // Nickel
    public static final RegistryObject<Block> NICKEL_ORE_ANDESITE = BLOCKS.register("nickel_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_CALCITE = BLOCKS.register("nickel_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_CREATE_LIMESTONE = BLOCKS.register("nickel_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_CREATE_SCORCHIA = BLOCKS.register("nickel_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_CREATE_SCORIA = BLOCKS.register("nickel_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_DIORITE = BLOCKS.register("nickel_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_GRANITE = BLOCKS.register("nickel_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_QUARK_JASPER = BLOCKS.register("nickel_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_QUARK_LIMESTONE = BLOCKS.register("nickel_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_QUARK_SHALE = BLOCKS.register("nickel_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_STONE = BLOCKS.register("nickel_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_TUFF = BLOCKS.register("nickel_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_DEEPSLATE = BLOCKS.register("nickel_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> NICKEL_ORE_BASALT = BLOCKS.register("nickel_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_BLACKSTONE = BLOCKS.register("nickel_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_NETHERRACK = BLOCKS.register("nickel_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> NICKEL_ORE_END_STONE = BLOCKS.register("nickel_ore_end_stone", () -> new Block(END_ORES));

    // Zinc
    public static final RegistryObject<Block> ZINC_ORE_ANDESITE = BLOCKS.register("zinc_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_CALCITE = BLOCKS.register("zinc_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_CREATE_LIMESTONE = BLOCKS.register("zinc_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_CREATE_SCORCHIA = BLOCKS.register("zinc_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_CREATE_SCORIA = BLOCKS.register("zinc_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_DIORITE = BLOCKS.register("zinc_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_GRANITE = BLOCKS.register("zinc_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_QUARK_JASPER = BLOCKS.register("zinc_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_QUARK_LIMESTONE = BLOCKS.register("zinc_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_QUARK_SHALE = BLOCKS.register("zinc_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_STONE = BLOCKS.register("zinc_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_TUFF = BLOCKS.register("zinc_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ZINC_ORE_DEEPSLATE = BLOCKS.register("zinc_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> ZINC_ORE_BASALT = BLOCKS.register("zinc_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> ZINC_ORE_BLACKSTONE = BLOCKS.register("zinc_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> ZINC_ORE_NETHERRACK = BLOCKS.register("zinc_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> ZINC_ORE_END_STONE = BLOCKS.register("zinc_ore_end_stone", () -> new Block(END_ORES));

    // Aluminum
    public static final RegistryObject<Block> ALUMINUM_ORE_ANDESITE = BLOCKS.register("aluminum_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_CALCITE = BLOCKS.register("aluminum_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_CREATE_LIMESTONE = BLOCKS.register("aluminum_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_CREATE_SCORCHIA = BLOCKS.register("aluminum_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_CREATE_SCORIA = BLOCKS.register("aluminum_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_DIORITE = BLOCKS.register("aluminum_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_GRANITE = BLOCKS.register("aluminum_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_QUARK_JASPER = BLOCKS.register("aluminum_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_QUARK_LIMESTONE = BLOCKS.register("aluminum_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_QUARK_SHALE = BLOCKS.register("aluminum_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_STONE = BLOCKS.register("aluminum_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_TUFF = BLOCKS.register("aluminum_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_DEEPSLATE = BLOCKS.register("aluminum_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> ALUMINUM_ORE_BASALT = BLOCKS.register("aluminum_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_BLACKSTONE = BLOCKS.register("aluminum_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_NETHERRACK = BLOCKS.register("aluminum_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> ALUMINUM_ORE_END_STONE = BLOCKS.register("aluminum_ore_end_stone", () -> new Block(END_ORES));

    // Cobalt
    public static final RegistryObject<Block> COBALT_ORE_ANDESITE = BLOCKS.register("cobalt_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_CALCITE = BLOCKS.register("cobalt_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_CREATE_LIMESTONE = BLOCKS.register("cobalt_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_CREATE_SCORCHIA = BLOCKS.register("cobalt_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_CREATE_SCORIA = BLOCKS.register("cobalt_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_DIORITE = BLOCKS.register("cobalt_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_GRANITE = BLOCKS.register("cobalt_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_QUARK_JASPER = BLOCKS.register("cobalt_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_QUARK_LIMESTONE = BLOCKS.register("cobalt_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_QUARK_SHALE = BLOCKS.register("cobalt_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_STONE = BLOCKS.register("cobalt_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_TUFF = BLOCKS.register("cobalt_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> COBALT_ORE_DEEPSLATE = BLOCKS.register("cobalt_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> COBALT_ORE_BASALT = BLOCKS.register("cobalt_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COBALT_ORE_BLACKSTONE = BLOCKS.register("cobalt_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COBALT_ORE_NETHERRACK = BLOCKS.register("cobalt_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> COBALT_ORE_END_STONE = BLOCKS.register("cobalt_ore_end_stone", () -> new Block(END_ORES));

    // Osmium
    public static final RegistryObject<Block> OSMIUM_ORE_ANDESITE = BLOCKS.register("osmium_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_CALCITE = BLOCKS.register("osmium_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_CREATE_LIMESTONE = BLOCKS.register("osmium_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_CREATE_SCORCHIA = BLOCKS.register("osmium_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_CREATE_SCORIA = BLOCKS.register("osmium_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_DIORITE = BLOCKS.register("osmium_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_GRANITE = BLOCKS.register("osmium_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_QUARK_JASPER = BLOCKS.register("osmium_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_QUARK_LIMESTONE = BLOCKS.register("osmium_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_QUARK_SHALE = BLOCKS.register("osmium_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_STONE = BLOCKS.register("osmium_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_TUFF = BLOCKS.register("osmium_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_DEEPSLATE = BLOCKS.register("osmium_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> OSMIUM_ORE_BASALT = BLOCKS.register("osmium_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_BLACKSTONE = BLOCKS.register("osmium_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_NETHERRACK = BLOCKS.register("osmium_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> OSMIUM_ORE_END_STONE = BLOCKS.register("osmium_ore_end_stone", () -> new Block(END_ORES));

    // Iridium
    public static final RegistryObject<Block> IRIDIUM_ORE_ANDESITE = BLOCKS.register("iridium_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_CALCITE = BLOCKS.register("iridium_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_CREATE_LIMESTONE = BLOCKS.register("iridium_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_CREATE_SCORCHIA = BLOCKS.register("iridium_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_CREATE_SCORIA = BLOCKS.register("iridium_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_DIORITE = BLOCKS.register("iridium_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_GRANITE = BLOCKS.register("iridium_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_QUARK_JASPER = BLOCKS.register("iridium_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_QUARK_LIMESTONE = BLOCKS.register("iridium_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_QUARK_SHALE = BLOCKS.register("iridium_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_STONE = BLOCKS.register("iridium_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_TUFF = BLOCKS.register("iridium_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_DEEPSLATE = BLOCKS.register("iridium_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> IRIDIUM_ORE_BASALT = BLOCKS.register("iridium_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_BLACKSTONE = BLOCKS.register("iridium_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_NETHERRACK = BLOCKS.register("iridium_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> IRIDIUM_ORE_END_STONE = BLOCKS.register("iridium_ore_end_stone", () -> new Block(END_ORES));

    // Uranium
    public static final RegistryObject<Block> URANIUM_ORE_ANDESITE = BLOCKS.register("uranium_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_CALCITE = BLOCKS.register("uranium_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_CREATE_LIMESTONE = BLOCKS.register("uranium_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_CREATE_SCORCHIA = BLOCKS.register("uranium_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_CREATE_SCORIA = BLOCKS.register("uranium_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_DIORITE = BLOCKS.register("uranium_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_GRANITE = BLOCKS.register("uranium_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_QUARK_JASPER = BLOCKS.register("uranium_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_QUARK_LIMESTONE = BLOCKS.register("uranium_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_QUARK_SHALE = BLOCKS.register("uranium_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_STONE = BLOCKS.register("uranium_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_TUFF = BLOCKS.register("uranium_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_DEEPSLATE = BLOCKS.register("uranium_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> URANIUM_ORE_BASALT = BLOCKS.register("uranium_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_BLACKSTONE = BLOCKS.register("uranium_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_NETHERRACK = BLOCKS.register("uranium_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> URANIUM_ORE_END_STONE = BLOCKS.register("uranium_ore_end_stone", () -> new Block(END_ORES));

    // Ruby
    public static final RegistryObject<Block> RUBY_ORE_ANDESITE = BLOCKS.register("ruby_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_CALCITE = BLOCKS.register("ruby_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_CREATE_LIMESTONE = BLOCKS.register("ruby_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_CREATE_SCORCHIA = BLOCKS.register("ruby_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_CREATE_SCORIA = BLOCKS.register("ruby_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_DIORITE = BLOCKS.register("ruby_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_GRANITE = BLOCKS.register("ruby_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_QUARK_JASPER = BLOCKS.register("ruby_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_QUARK_LIMESTONE = BLOCKS.register("ruby_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_QUARK_SHALE = BLOCKS.register("ruby_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_STONE = BLOCKS.register("ruby_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_TUFF = BLOCKS.register("ruby_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> RUBY_ORE_DEEPSLATE = BLOCKS.register("ruby_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> RUBY_ORE_BASALT = BLOCKS.register("ruby_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> RUBY_ORE_BLACKSTONE = BLOCKS.register("ruby_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> RUBY_ORE_NETHERRACK = BLOCKS.register("ruby_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> RUBY_ORE_END_STONE = BLOCKS.register("ruby_ore_end_stone", () -> new Block(END_ORES));

    // Sapphire
    public static final RegistryObject<Block> SAPPHIRE_ORE_ANDESITE = BLOCKS.register("sapphire_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_CALCITE = BLOCKS.register("sapphire_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_CREATE_LIMESTONE = BLOCKS.register("sapphire_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_CREATE_SCORCHIA = BLOCKS.register("sapphire_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_CREATE_SCORIA = BLOCKS.register("sapphire_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_DIORITE = BLOCKS.register("sapphire_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_GRANITE = BLOCKS.register("sapphire_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_QUARK_JASPER = BLOCKS.register("sapphire_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_QUARK_LIMESTONE = BLOCKS.register("sapphire_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_QUARK_SHALE = BLOCKS.register("sapphire_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_STONE = BLOCKS.register("sapphire_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_TUFF = BLOCKS.register("sapphire_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_DEEPSLATE = BLOCKS.register("sapphire_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> SAPPHIRE_ORE_BASALT = BLOCKS.register("sapphire_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_BLACKSTONE = BLOCKS.register("sapphire_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_NETHERRACK = BLOCKS.register("sapphire_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SAPPHIRE_ORE_END_STONE = BLOCKS.register("sapphire_ore_end_stone", () -> new Block(END_ORES));

    // Sulfur
    public static final RegistryObject<Block> SULFUR_ORE_ANDESITE = BLOCKS.register("sulfur_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_CALCITE = BLOCKS.register("sulfur_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_CREATE_LIMESTONE = BLOCKS.register("sulfur_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_CREATE_SCORCHIA = BLOCKS.register("sulfur_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_CREATE_SCORIA = BLOCKS.register("sulfur_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_DIORITE = BLOCKS.register("sulfur_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_GRANITE = BLOCKS.register("sulfur_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_QUARK_JASPER = BLOCKS.register("sulfur_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_QUARK_LIMESTONE = BLOCKS.register("sulfur_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_QUARK_SHALE = BLOCKS.register("sulfur_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_STONE = BLOCKS.register("sulfur_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_TUFF = BLOCKS.register("sulfur_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_DEEPSLATE = BLOCKS.register("sulfur_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> SULFUR_ORE_BASALT = BLOCKS.register("sulfur_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_BLACKSTONE = BLOCKS.register("sulfur_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_NETHERRACK = BLOCKS.register("sulfur_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SULFUR_ORE_END_STONE = BLOCKS.register("sulfur_ore_end_stone", () -> new Block(END_ORES));

    // Cinnabar
    public static final RegistryObject<Block> CINNABAR_ORE_ANDESITE = BLOCKS.register("cinnabar_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_CALCITE = BLOCKS.register("cinnabar_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_CREATE_LIMESTONE = BLOCKS.register("cinnabar_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_CREATE_SCORCHIA = BLOCKS.register("cinnabar_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_CREATE_SCORIA = BLOCKS.register("cinnabar_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_DIORITE = BLOCKS.register("cinnabar_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_GRANITE = BLOCKS.register("cinnabar_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_QUARK_JASPER = BLOCKS.register("cinnabar_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_QUARK_LIMESTONE = BLOCKS.register("cinnabar_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_QUARK_SHALE = BLOCKS.register("cinnabar_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_STONE = BLOCKS.register("cinnabar_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_TUFF = BLOCKS.register("cinnabar_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_DEEPSLATE = BLOCKS.register("cinnabar_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> CINNABAR_ORE_BASALT = BLOCKS.register("cinnabar_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_BLACKSTONE = BLOCKS.register("cinnabar_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_NETHERRACK = BLOCKS.register("cinnabar_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> CINNABAR_ORE_END_STONE = BLOCKS.register("cinnabar_ore_end_stone", () -> new Block(END_ORES));

    // Potassium Nitrate
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_ANDESITE = BLOCKS.register("potassium_nitrate_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_CALCITE = BLOCKS.register("potassium_nitrate_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_CREATE_LIMESTONE = BLOCKS.register("potassium_nitrate_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_CREATE_SCORCHIA = BLOCKS.register("potassium_nitrate_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_CREATE_SCORIA = BLOCKS.register("potassium_nitrate_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_DIORITE = BLOCKS.register("potassium_nitrate_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_GRANITE = BLOCKS.register("potassium_nitrate_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_QUARK_JASPER = BLOCKS.register("potassium_nitrate_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_QUARK_LIMESTONE = BLOCKS.register("potassium_nitrate_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_QUARK_SHALE = BLOCKS.register("potassium_nitrate_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_STONE = BLOCKS.register("potassium_nitrate_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_TUFF = BLOCKS.register("potassium_nitrate_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_DEEPSLATE = BLOCKS.register("potassium_nitrate_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_BASALT = BLOCKS.register("potassium_nitrate_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_BLACKSTONE = BLOCKS.register("potassium_nitrate_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_NETHERRACK = BLOCKS.register("potassium_nitrate_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> POTASSIUM_NITRATE_ORE_END_STONE = BLOCKS.register("potassium_nitrate_ore_end_stone", () -> new Block(END_ORES));


    // Apatite
    public static final RegistryObject<Block> APATITE_ORE_ANDESITE = BLOCKS.register("apatite_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_CALCITE = BLOCKS.register("apatite_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_CREATE_LIMESTONE = BLOCKS.register("apatite_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_CREATE_SCORCHIA = BLOCKS.register("apatite_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_CREATE_SCORIA = BLOCKS.register("apatite_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_DIORITE = BLOCKS.register("apatite_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_GRANITE = BLOCKS.register("apatite_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_QUARK_JASPER = BLOCKS.register("apatite_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_QUARK_LIMESTONE = BLOCKS.register("apatite_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_QUARK_SHALE = BLOCKS.register("apatite_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_STONE = BLOCKS.register("apatite_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_TUFF = BLOCKS.register("apatite_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> APATITE_ORE_DEEPSLATE = BLOCKS.register("apatite_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> APATITE_ORE_BASALT = BLOCKS.register("apatite_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> APATITE_ORE_BLACKSTONE = BLOCKS.register("apatite_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> APATITE_ORE_NETHERRACK = BLOCKS.register("apatite_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> APATITE_ORE_END_STONE = BLOCKS.register("apatite_ore_end_stone", () -> new Block(END_ORES));

    // Fluorite
    public static final RegistryObject<Block> FLUORITE_ORE_ANDESITE = BLOCKS.register("fluorite_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_CALCITE = BLOCKS.register("fluorite_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_CREATE_LIMESTONE = BLOCKS.register("fluorite_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_CREATE_SCORCHIA = BLOCKS.register("fluorite_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_CREATE_SCORIA = BLOCKS.register("fluorite_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_DIORITE = BLOCKS.register("fluorite_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_GRANITE = BLOCKS.register("fluorite_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_QUARK_JASPER = BLOCKS.register("fluorite_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_QUARK_LIMESTONE = BLOCKS.register("fluorite_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_QUARK_SHALE = BLOCKS.register("fluorite_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_STONE = BLOCKS.register("fluorite_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_TUFF = BLOCKS.register("fluorite_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_DEEPSLATE = BLOCKS.register("fluorite_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> FLUORITE_ORE_BASALT = BLOCKS.register("fluorite_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_BLACKSTONE = BLOCKS.register("fluorite_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_NETHERRACK = BLOCKS.register("fluorite_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> FLUORITE_ORE_END_STONE = BLOCKS.register("fluorite_ore_end_stone", () -> new Block(END_ORES));

    // Silver
    public static final RegistryObject<Block> SILVER_ORE_ANDESITE = BLOCKS.register("silver_ore_andesite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_CALCITE = BLOCKS.register("silver_ore_calcite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_CREATE_LIMESTONE = BLOCKS.register("silver_ore_create_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_CREATE_SCORCHIA = BLOCKS.register("silver_ore_create_scorchia", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_CREATE_SCORIA = BLOCKS.register("silver_ore_create_scoria", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_DIORITE = BLOCKS.register("silver_ore_diorite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_GRANITE = BLOCKS.register("silver_ore_granite", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_QUARK_JASPER = BLOCKS.register("silver_ore_quark_jasper", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_QUARK_LIMESTONE = BLOCKS.register("silver_ore_quark_limestone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_QUARK_SHALE = BLOCKS.register("silver_ore_quark_shale", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_STONE = BLOCKS.register("silver_ore_stone", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_TUFF = BLOCKS.register("silver_ore_tuff", () -> new Block(OVERWORLD_ORES));
    public static final RegistryObject<Block> SILVER_ORE_DEEPSLATE = BLOCKS.register("silver_ore_deepslate", () -> new Block(OVERWORLD_ORES_HARD));
    public static final RegistryObject<Block> SILVER_ORE_BASALT = BLOCKS.register("silver_ore_basalt", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SILVER_ORE_BLACKSTONE = BLOCKS.register("silver_ore_blackstone", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SILVER_ORE_NETHERRACK = BLOCKS.register("silver_ore_netherrack", () -> new Block(NETHER_ORES));
    public static final RegistryObject<Block> SILVER_ORE_END_STONE = BLOCKS.register("silver_ore_end_stone", () -> new Block(END_ORES));

}
