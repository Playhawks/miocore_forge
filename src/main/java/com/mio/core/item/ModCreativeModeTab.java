package com.mio.core.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab MIOCORE_TAB = new CreativeModeTab("miocoretab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ALUMINIUM_INGOT.get());
        }
    };

}
