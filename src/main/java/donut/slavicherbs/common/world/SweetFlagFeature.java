package donut.slavicherbs.common.world;

import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.DefaultFlowersFeature;

import java.util.Random;

public class SweetFlagFeature extends DefaultFlowersFeature {
    public static final BlockClusterFeatureConfig DEFAULT_SWEET_FLAG_CONFIG = new BlockClusterFeatureConfig.Builder(new WeightedBlockStateProvider().addWeightedBlockstate(ModBlocks.SWEET_FLAG.getDefaultState(), 2), new SimpleBlockPlacer()).tries(64).build();
    public SweetFlagFeature() {
        super(dynamic -> DEFAULT_SWEET_FLAG_CONFIG);
        setRegistryName("sweet_flag_feature");
    }

    @Override
    public BlockState getFlowerToPlace(Random random, BlockPos pos, BlockClusterFeatureConfig blockClusterFeatureConfig) {
        return blockClusterFeatureConfig.stateProvider.getBlockState(random, pos);
    }
}
