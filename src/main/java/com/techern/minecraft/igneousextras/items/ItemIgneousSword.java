package com.techern.minecraft.igneousextras.items;

import net.minecraft.item.ItemSword;

public class ItemIgneousSword extends ItemSword {
	public ItemIgneousSword(ToolMaterial mat, String unlocalizedName) {
		super(mat);
		this.setUnlocalizedName(unlocalizedName + "_sword");
		this.setRegistryName(unlocalizedName + "_sword");
	}
}
