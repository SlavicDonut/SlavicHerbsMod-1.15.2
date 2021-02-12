package donut.slavicherbs.common.world.gen.feature;

import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class JuniperTree extends Tree {
    public static final TreeFeatureConfig JUNIPER_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.JUNIPER_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.JUNIPER_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(3, 0))).baseHeight(14).setSapling((IPlantable) ModBlocks.JUNIPER_SAPLING).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(JUNIPER_TREE_CONFIG);
    }
}
