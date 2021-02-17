package donut.slavicherbs.common.world;

import donut.slavicherbs.SlavicHerbs;
import donut.slavicherbs.common.blocks.ModBlocks;
import donut.slavicherbs.common.world.gen.feature.JuniperTree;
import donut.slavicherbs.common.world.gen.feature.LindenFeature;
import donut.slavicherbs.common.world.gen.feature.SandalwoodTree;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.xml.crypto.dom.DOMURIReference;

@Mod.EventBusSubscriber(modid = SlavicHerbs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModWorldGen {
    public static ChamomileFeature CHAMOMILE_FEATURE = new ChamomileFeature();
    public static NettleFeature NETTLE_FEATURE = new NettleFeature();
    public static RibleafFeature RIBLEAF_FEATURE = new RibleafFeature();
    public static SageFeature SAGE_FEATURE = new SageFeature();
    public static YarrowFeature YARROW_FEATURE = new YarrowFeature();
    public static SweetFlagFeature SWEET_FLAG_FEATURE = new SweetFlagFeature();

    private static final BlockState SWEET_FLAG = ModBlocks.SWEET_FLAG.getDefaultState();
    public static final BlockClusterFeatureConfig SWEET_FLAG_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SWEET_FLAG), new SimpleBlockPlacer())).tries(10).build();



    @SubscribeEvent
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> registry) {
        registry.getRegistry().register(CHAMOMILE_FEATURE);
        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, CHAMOMILE_FEATURE.withConfiguration(ChamomileFeature.DEFAULT_CHAMOMILE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(2))));

        registry.getRegistry().register(NETTLE_FEATURE);
        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, NETTLE_FEATURE.withConfiguration(NettleFeature.DEFAULT_NETTLE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(2))));

        registry.getRegistry().register(RIBLEAF_FEATURE);
        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RIBLEAF_FEATURE.withConfiguration(RibleafFeature.DEFAULT_RIBLEAF_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(2))));

        registry.getRegistry().register(SAGE_FEATURE);
        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, SAGE_FEATURE.withConfiguration(SageFeature.DEFAULT_SAGE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(2))));

        registry.getRegistry().register(YARROW_FEATURE);
        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, YARROW_FEATURE.withConfiguration(YarrowFeature.DEFAULT_YARROW_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(2))));

//        registry.getRegistry().register(SWEET_FLAG_FEATURE);
//        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, SWEET_FLAG_FEATURE.withConfiguration(SweetFlagFeature.DEFAULT_SWEET_FLAG_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(2))));

        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SWEET_FLAG_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(4))));

        Biomes.PLAINS.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(LindenFeature.LINDEN_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
        Biomes.SAVANNA.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(SandalwoodTree.SANDALWOOD_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
        Biomes.TAIGA.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(JuniperTree.JUNIPER_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    }
}