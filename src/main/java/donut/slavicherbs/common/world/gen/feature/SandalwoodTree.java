package donut.slavicherbs.common.world.gen.feature;

import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class SandalwoodTree extends Tree {
    public static final TreeFeatureConfig SANDALWOOD_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.SANDALWOOD_LOG.getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.SANDALWOOD_LEAVES.getDefaultState()),
            new AcaciaFoliagePlacer(3, 0))).baseHeight(14).heightRandA(4).foliageHeight(8).ignoreVines().setSapling((IPlantable) ModBlocks.SANDALWOOD_SAPLING).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(SANDALWOOD_TREE_CONFIG);
    }
}
