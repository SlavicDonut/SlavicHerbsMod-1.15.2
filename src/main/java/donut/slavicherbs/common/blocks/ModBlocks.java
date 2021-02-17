package donut.slavicherbs.common.blocks;

import donut.slavicherbs.common.world.gen.feature.JuniperTree;
import donut.slavicherbs.common.world.gen.feature.LindenFeature;
import donut.slavicherbs.common.world.gen.feature.SandalwoodTree;
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
    public static WaterHerbBlock SWEET_FLAG = new WaterHerbBlock((Block.Properties.create(Material.PLANTS).doesNotBlockMovement().sound(SoundType.PLANT).notSolid()));

    public static ModSaplingBlock JUNIPER_SAPLING = new ModSaplingBlock(() -> new JuniperTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0, 0).sound(SoundType.PLANT));
    public static Block JUNIPER_LEAVES = new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid());
    public static LogBlock JUNIPER_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static LogBlock STRIPPED_JUNIPER_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static Block JUNIPER_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

    public static ModSaplingBlock SANDALWOOD_SAPLING = new ModSaplingBlock(() -> new SandalwoodTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0, 0).sound(SoundType.PLANT));
    public static Block SANDALWOOD_LEAVES = new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid());
    public static LogBlock SANDALWOOD_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static LogBlock STRIPPED_SANDALWOOD_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static Block SANDALWOOD_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

    public static ModSaplingBlock LINDEN_SAPLING = new ModSaplingBlock(() -> new LindenFeature(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0, 0).sound(SoundType.PLANT));
    public static Block LINDEN_LEAVES = new Block(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT).notSolid());
    public static LogBlock LINDEN_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static LogBlock STRIPPED_LINDEN_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD));
    public static Block LINDEN_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD));

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

        SWEET_FLAG.setRegistryName("sweet_flag");
        registry.getRegistry().register(SWEET_FLAG);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(SWEET_FLAG, RenderType.getCutoutMipped());
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

        SANDALWOOD_SAPLING.setRegistryName("sandalwood_sapling");
        registry.getRegistry().register(SANDALWOOD_SAPLING);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(SANDALWOOD_SAPLING, RenderType.getCutoutMipped());
        }

        SANDALWOOD_LEAVES.setRegistryName("sandalwood_leaves");
        registry.getRegistry().register(SANDALWOOD_LEAVES);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(SANDALWOOD_LEAVES, RenderType.getCutoutMipped());
        }

        SANDALWOOD_LOG.setRegistryName("sandalwood_log");
        registry.getRegistry().register(SANDALWOOD_LOG);

        STRIPPED_SANDALWOOD_LOG.setRegistryName("stripped_sandalwood_log");
        registry.getRegistry().register(STRIPPED_SANDALWOOD_LOG);

        SANDALWOOD_PLANKS.setRegistryName("sandalwood_planks");
        registry.getRegistry().register(SANDALWOOD_PLANKS);

        LINDEN_SAPLING.setRegistryName("linden_sapling");
        registry.getRegistry().register(LINDEN_SAPLING);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(LINDEN_SAPLING, RenderType.getCutoutMipped());
        }

        LINDEN_LEAVES.setRegistryName("linden_leaves");
        registry.getRegistry().register(LINDEN_LEAVES);
        if(FMLEnvironment.dist == Dist.CLIENT) {
            RenderTypeLookup.setRenderLayer(LINDEN_LEAVES, RenderType.getCutoutMipped());
        }

        LINDEN_LOG.setRegistryName("linden_log");
        registry.getRegistry().register(LINDEN_LOG);

        STRIPPED_LINDEN_LOG.setRegistryName("stripped_linden_log");
        registry.getRegistry().register(STRIPPED_LINDEN_LOG);

        LINDEN_PLANKS.setRegistryName("linden_planks");
        registry.getRegistry().register(LINDEN_PLANKS);



    }
}