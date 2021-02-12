package donut.slavicherbs.common.items;

import donut.slavicherbs.SlavicHerbs;
import donut.slavicherbs.common.blocks.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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
    }
}
