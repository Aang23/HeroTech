package io.github.amalgammc.herotech.common.items;

import io.github.amalgammc.herotech.HeroTech;
import io.github.amalgammc.herotech.common.items.models.mk6armor;
import io.github.amalgammc.herotech.init.ModItems;
import io.github.amalgammc.herotech.util.IHasModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBaseModel extends ItemArmor implements IHasModel {

	public ArmorBaseModel(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		setMaxStackSize(1);

		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		HeroTech.proxy.registerItemRenderer(this, 0, "inventory");
	}

	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
		if (itemStack != ItemStack.EMPTY) {
			if (itemStack.getItem() instanceof ItemArmor) {
				mk6armor model = new mk6armor();

				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;

				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.rightArmPose = _default.rightArmPose;
				model.leftArmPose = _default.leftArmPose;

				return model;
			}
		} return null;
	}
}
