package net.vretu.emeraldstuff.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vretu.emeraldstuff.enums;
import net.vretu.emeraldstuff.enums.Armour;
import net.vretu.emeraldstuff.enums.Tool;

public class ModItems {
    public static final Item EMERALD_SWORD = new SwordItem(
            EmeraldToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings());
    public static final Item EMERALD_HELMET = new ArmorItem(EmeraldArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item EMERALD_CHESTPLATE = new ArmorItem(EmeraldArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item EMERALD_LEGGINGS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item EMERALD_BOOTS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new FabricItemSettings());

    public static void registerModItems() {
        Registry.register(Registries.ITEM, new Identifier("emeraldstuff", "emerald_sword"), EMERALD_SWORD);
        Registry.register(Registries.ITEM, new Identifier("emeraldstuff", "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registries.ITEM, new Identifier("emeraldstuff", "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("emeraldstuff", "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("emeraldstuff", "emerald_boots"), EMERALD_BOOTS);
    }
}
