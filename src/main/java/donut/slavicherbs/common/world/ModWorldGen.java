package donut.slavicherbs.common.world;

import donut.slavicherbs.SlavicHerbs;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SlavicHerbs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModWorldGen {
    public static ChamomileFeature CHAMOMILE_FEATURE = new ChamomileFeature();
    public static NettleFeature NETTLE_FEATURE = new NettleFeature();
    public static RibleafFeature RIBLEAF_FEATURE = new RibleafFeature();
    public static SageFeature SAGE_FEATURE = new SageFeature();
    public static YarrowFeature YARROW_FEATURE = new YarrowFeature();

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

    }
}