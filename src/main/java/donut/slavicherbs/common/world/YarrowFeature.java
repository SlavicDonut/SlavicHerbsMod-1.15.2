package donut.slavicherbs.common.world;

import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.DefaultFlowersFeature;

import java.util.Random;

public class YarrowFeature extends DefaultFlowersFeature {
    public static final BlockClusterFeatureConfig DEFAULT_YARROW_CONFIG = new BlockClusterFeatureConfig.Builder(new WeightedBlockStateProvider().addWeightedBlockstate(ModBlocks.YARROW.getDefaultState(), 2), new SimpleBlockPlacer()).tries(64).build();
    public YarrowFeature() {
        super(dynamic -> DEFAULT_YARROW_CONFIG);
        setRegistryName("yarrow_feature");
    }

    @Override
    public BlockState getFlowerToPlace(Random random, BlockPos pos, BlockClusterFeatureConfig blockClusterFeatureConfig) {
        return blockClusterFeatureConfig.stateProvider.getBlockState(random, pos);
    }

}
