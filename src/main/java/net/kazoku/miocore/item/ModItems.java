package net.kazoku.miocore.item;

import net.kazoku.miocore.MioCore;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MioCore.MOD_ID);

    //region Ingot Items

    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> ARDITE_INGOT = ITEMS.register("ardite_ingot" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));

    //endregion

    //region Nugget Items

    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> ARDITE_NUGGET = ITEMS.register("ardite_nugget" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));

    //endregion

    //region Raw Items

    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> RAW_ARDITE = ITEMS.register("raw_ardite" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));

    //endregion

    //region Special Items

    public static final RegistryObject<Item> ENHANCED_BONE_MEAL = ITEMS.register("enhanced_bone_meal" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MIOCORE_TAB)));

    //endregion


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
