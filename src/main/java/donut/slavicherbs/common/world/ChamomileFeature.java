package donut.slavicherbs.common.world;

import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.DefaultFlowersFeature;

import java.util.Random;

public class ChamomileFeature extends DefaultFlowersFeature {
    public static final BlockClusterFeatureConfig DEFAULT_CHAMOMILE_CONFIG = new BlockClusterFeatureConfig.Builder(new WeightedBlockStateProvider().addWeightedBlockstate(ModBlocks.CHAMOMILE.getDefaultState(), 2), new SimpleBlockPlacer()).tries(64).build();
    public ChamomileFeature() {
        super(dynamic -> DEFAULT_CHAMOMILE_CONFIG);
        setRegistryName("chamomile_feature");
    }

    @Override
    public BlockState getFlowerToPlace(Random random, BlockPos pos, BlockClusterFeatureConfig blockClusterFeatureConfig) {
        return blockClusterFeatureConfig.stateProvider.getBlockState(random, pos);
    }


}
