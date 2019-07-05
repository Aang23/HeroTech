package io.github.amalgammc.herotech.init;

import io.github.amalgammc.herotech.HeroTech;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModMaterials {

    public static final List<Item> MATERIALS = new ArrayList<Item>();
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_MK6 = EnumHelper.addArmorMaterial("armor_material_mk6", HeroTech.MODID + ":mk6armor", 12, new int[] {2, 7, 5, 3}, 10, SoundEvents.BLOCK_ANVIL_USE, 0.0F);
}
