package org.techern.minecraft.igneousextras.items;

import net.minecraft.item.ItemPickaxe;

public class ItemIgneousPickaxe extends ItemPickaxe {
	public ItemIgneousPickaxe(ToolMaterial mat, String unlocalizedName) {
		super(mat);
		this.setUnlocalizedName(unlocalizedName + "_pickaxe");
		this.setRegistryName(unlocalizedName + "_pickaxe");
	}
}
