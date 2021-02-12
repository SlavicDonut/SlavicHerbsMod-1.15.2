package donut.slavicherbs.common.blocks;

import donut.slavicherbs.common.world.gen.feature.JuniperTree;
import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static HerbBlock CHAMOMILE = new HerbBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static HerbBlock NETTLE = new HerbBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static HerbBlock RIBLEAF = new HerbBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static HerbBlock SAGE = new HerbBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static HerbBlock YARROW = new HerbBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT));
    public static ModSaplingBlock JUNIPER_SAPLING = new ModSaplingBlock(() -> new JuniperTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0, 0).sound(SoundType.PLANT));
    public static Block JUNIPER_LEAVES = new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid());
    public static LogBlock JUNIPER_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static LogBlock STRIPPED_JUNIPER_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static Block JUNIPER_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> registry) {

        CHAMOMILE.setRegistryName("chamomile");
        registry.getRegistry().register(CHAMOMILE);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(CHAMOMILE, RenderType.getCutoutMipped());
        }

        NETTLE.setRegistryName("nettle");
        registry.getRegistry().register(NETTLE);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(NETTLE, RenderType.getCutoutMipped());
        }

        RIBLEAF.setRegistryName("ribleaf");
        registry.getRegistry().register(RIBLEAF);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(RIBLEAF, RenderType.getCutoutMipped());
        }

        SAGE.setRegistryName("sage");
        registry.getRegistry().register(SAGE);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(SAGE, RenderType.getCutoutMipped());
        }

        YARROW.setRegistryName("yarrow");
        registry.getRegistry().register(YARROW);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(YARROW, RenderType.getCutoutMipped());
        }

        JUNIPER_SAPLING.setRegistryName("juniper_sapling");
        registry.getRegistry().register(JUNIPER_SAPLING);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(JUNIPER_SAPLING, RenderType.getCutoutMipped());
        }

        JUNIPER_LEAVES.setRegistryName("juniper_leaves");
        registry.getRegistry().register(JUNIPER_LEAVES);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(JUNIPER_LEAVES, RenderType.getCutoutMipped());
        }

        JUNIPER_LOG.setRegistryName("juniper_log");
        registry.getRegistry().register(JUNIPER_LOG);

        STRIPPED_JUNIPER_LOG.setRegistryName("stripped_juniper_log");
        registry.getRegistry().register(STRIPPED_JUNIPER_LOG);

        JUNIPER_PLANKS.setRegistryName("juniper_planks");
        registry.getRegistry().register(JUNIPER_PLANKS);
    }
}