package net.cookie.dunes.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModCreativeModeTab {
    public static final CreativeModeTab DUNES_MATERIALS = new CreativeModeTab("dunesmaterials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COBALT_INGOT.get());
        }
    };


}
