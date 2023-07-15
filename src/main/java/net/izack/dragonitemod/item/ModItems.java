package net.izack.dragonitemod.item;
import net.izack.dragonitemod.DragoniteMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragoniteMod.MOD_ID);
    // How to add an Item
    public static final RegistryObject<Item> DRAGONITEBLADE = ITEMS.register("dragoniteblade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRAGONITE_TAB))); //Here we put the properties to the object
    public static final RegistryObject<Item> DRAGONITEHANDLE = ITEMS.register("dragonitehandle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRAGONITE_TAB))); //Here we put the properties to the object
    public static final RegistryObject<Item> DRAGONITECYTHE = ITEMS.register("dragonitescythe",
            () -> new SwordItem(Tiers.NETHERITE, 10, 3, new Item.Properties().tab(ModCreativeModeTab.DRAGONITE_TAB))); //Here we put the properties to the object


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
