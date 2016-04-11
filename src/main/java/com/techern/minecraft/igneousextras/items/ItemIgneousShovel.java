package com.techern.minecraft.igneousextras.items;

import net.minecraft.item.ItemSpade;

public class ItemIgneousShovel extends ItemSpade {
	public ItemIgneousShovel(ToolMaterial mat, String unlocalizedName) {
		super(mat);
		this.setUnlocalizedName(unlocalizedName + "_shovel");
		this.setRegistryName(unlocalizedName + "_shovel");
	}
}
