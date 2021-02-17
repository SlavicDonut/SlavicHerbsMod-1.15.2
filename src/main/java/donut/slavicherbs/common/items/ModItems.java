package donut.slavicherbs.common.items;

import donut.slavicherbs.SlavicHerbs;
import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.LilyPadItem;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> registry) {
        BlockItem chamomile = new BlockItem(ModBlocks.CHAMOMILE, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        chamomile.setRegistryName(ModBlocks.CHAMOMILE.getRegistryName());
        registry.getRegistry().register(chamomile);

        BlockItem nettle = new BlockItem(ModBlocks.NETTLE, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        nettle.setRegistryName(ModBlocks.NETTLE.getRegistryName());
        registry.getRegistry().register(nettle);

        BlockItem ribleaf = new BlockItem(ModBlocks.RIBLEAF, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        ribleaf.setRegistryName(ModBlocks.RIBLEAF.getRegistryName());
        registry.getRegistry().register(ribleaf);

        BlockItem sage = new BlockItem(ModBlocks.SAGE, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        sage.setRegistryName(ModBlocks.SAGE.getRegistryName());
        registry.getRegistry().register(sage);

        BlockItem yarrow = new BlockItem(ModBlocks.YARROW, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        yarrow.setRegistryName(ModBlocks.YARROW.getRegistryName());
        registry.getRegistry().register(yarrow);

        BlockItem sweetFlag = new SweetFlagItem(ModBlocks.SWEET_FLAG, (new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS)));
        sweetFlag.setRegistryName(ModBlocks.SWEET_FLAG.getRegistryName());
        registry.getRegistry().register(sweetFlag);

        BlockItem juniperSapling = new BlockItem(ModBlocks.JUNIPER_SAPLING, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        juniperSapling.setRegistryName(ModBlocks.JUNIPER_SAPLING.getRegistryName());
        registry.getRegistry().register(juniperSapling);

        BlockItem juniperLeaves = new BlockItem(ModBlocks.JUNIPER_LEAVES, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        juniperLeaves.setRegistryName(ModBlocks.JUNIPER_LEAVES.getRegistryName());
        registry.getRegistry().register(juniperLeaves);

        BlockItem juniperLog = new BlockItem(ModBlocks.JUNIPER_LOG, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        juniperLog.setRegistryName(ModBlocks.JUNIPER_LOG.getRegistryName());
        registry.getRegistry().register(juniperLog);

        BlockItem juniperStrippedLog = new BlockItem(ModBlocks.STRIPPED_JUNIPER_LOG, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        juniperStrippedLog.setRegistryName(ModBlocks.STRIPPED_JUNIPER_LOG.getRegistryName());
        registry.getRegistry().register(juniperStrippedLog);

        BlockItem juniperPlanks = new BlockItem(ModBlocks.JUNIPER_PLANKS, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        juniperPlanks.setRegistryName(ModBlocks.JUNIPER_PLANKS.getRegistryName());
        registry.getRegistry().register(juniperPlanks);

        BlockItem sandalwoodSapling = new BlockItem(ModBlocks.SANDALWOOD_SAPLING, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        sandalwoodSapling.setRegistryName(ModBlocks.SANDALWOOD_SAPLING.getRegistryName());
        registry.getRegistry().register(sandalwoodSapling);

        BlockItem sandalwoodLeaves = new BlockItem(ModBlocks.SANDALWOOD_LEAVES, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        sandalwoodLeaves.setRegistryName(ModBlocks.SANDALWOOD_LEAVES.getRegistryName());
        registry.getRegistry().register(sandalwoodLeaves);

        BlockItem sandalwoodLog = new BlockItem(ModBlocks.SANDALWOOD_LOG, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        sandalwoodLog.setRegistryName(ModBlocks.SANDALWOOD_LOG.getRegistryName());
        registry.getRegistry().register(sandalwoodLog);

        BlockItem sandalwoodStrippedLog = new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_LOG, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        sandalwoodStrippedLog.setRegistryName(ModBlocks.STRIPPED_SANDALWOOD_LOG.getRegistryName());
        registry.getRegistry().register(sandalwoodStrippedLog);

        BlockItem sandalwoodPlanks = new BlockItem(ModBlocks.SANDALWOOD_PLANKS, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        sandalwoodPlanks.setRegistryName(ModBlocks.SANDALWOOD_PLANKS.getRegistryName());
        registry.getRegistry().register(sandalwoodPlanks);

        BlockItem lindenSapling = new BlockItem(ModBlocks.LINDEN_SAPLING, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        lindenSapling.setRegistryName(ModBlocks.LINDEN_SAPLING.getRegistryName());
        registry.getRegistry().register(lindenSapling);

        BlockItem lindenLeaves = new BlockItem(ModBlocks.LINDEN_LEAVES, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        lindenLeaves.setRegistryName(ModBlocks.LINDEN_LEAVES.getRegistryName());
        registry.getRegistry().register(lindenLeaves);

        BlockItem lindenLog = new BlockItem(ModBlocks.LINDEN_LOG, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        lindenLog.setRegistryName(ModBlocks.LINDEN_LOG.getRegistryName());
        registry.getRegistry().register(lindenLog);

        BlockItem lindenStrippedLog = new BlockItem(ModBlocks.STRIPPED_LINDEN_LOG, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        lindenStrippedLog.setRegistryName(ModBlocks.STRIPPED_LINDEN_LOG.getRegistryName());
        registry.getRegistry().register(lindenStrippedLog);

        BlockItem lindenPlanks = new BlockItem(ModBlocks.LINDEN_PLANKS, new Item.Properties().group(SlavicHerbs.SLAVIC_HERBS));
        lindenPlanks.setRegistryName(ModBlocks.LINDEN_PLANKS.getRegistryName());
        registry.getRegistry().register(lindenPlanks);


    }
}
