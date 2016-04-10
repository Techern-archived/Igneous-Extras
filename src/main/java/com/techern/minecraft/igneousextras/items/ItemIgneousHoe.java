package com.techern.minecraft.igneousextras.items;

import net.minecraft.item.ItemHoe;

public class ItemIgneousHoe extends ItemHoe {
	public ItemIgneousHoe(ToolMaterial mat, String unlocalizedName) {
		super(mat);
		this.setUnlocalizedName(unlocalizedName + "_hoe");
	}
}
