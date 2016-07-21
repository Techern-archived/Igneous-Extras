package org.techern.minecraft.igneousextras.items.tools;

import net.minecraft.item.ItemPickaxe;
import org.techern.minecraft.igneousextras.items.IgneousItems;

public class ItemIgneousPickaxe extends ItemPickaxe {
	public ItemIgneousPickaxe(ToolMaterial mat, String unlocalizedName) {
		super(mat);
		this.setUnlocalizedName(unlocalizedName + "_pickaxe");
		this.setRegistryName(unlocalizedName + "_pickaxe");
		this.setCreativeTab(IgneousItems.TOOLS_TAB);
	}
}
