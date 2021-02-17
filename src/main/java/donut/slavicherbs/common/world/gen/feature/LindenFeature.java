package donut.slavicherbs.common.world.gen.feature;

import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class LindenFeature extends Tree {
    public static final TreeFeatureConfig LINDEN_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.LINDEN_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.LINDEN_LEAVES.getDefaultState()),
            new BlobFoliagePlacer(3, 0))).baseHeight(14).heightRandA(4).foliageHeight(8).ignoreVines().setSapling((IPlantable) ModBlocks.LINDEN_SAPLING).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(LINDEN_TREE_CONFIG);
    }
}
