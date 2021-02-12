package donut.slavicherbs.common.world;

import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.DefaultFlowersFeature;

import java.util.Random;

public class SageFeature extends DefaultFlowersFeature {
    public static final BlockClusterFeatureConfig DEFAULT_SAGE_CONFIG = new BlockClusterFeatureConfig.Builder(new WeightedBlockStateProvider().addWeightedBlockstate(ModBlocks.SAGE.getDefaultState(), 2), new SimpleBlockPlacer()).tries(64).build();
    public SageFeature() {
        super(dynamic -> DEFAULT_SAGE_CONFIG);
        setRegistryName("sage_feature");
    }

    @Override
    public BlockState getFlowerToPlace(Random random, BlockPos pos, BlockClusterFeatureConfig blockClusterFeatureConfig) {
        return blockClusterFeatureConfig.stateProvider.getBlockState(random, pos);
    }


}
