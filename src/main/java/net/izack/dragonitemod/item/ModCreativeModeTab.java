package net.izack.dragonitemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DRAGONITE_TAB = new CreativeModeTab("dragonite") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DRAGONITECYTHE.get());
        }
    };
}
