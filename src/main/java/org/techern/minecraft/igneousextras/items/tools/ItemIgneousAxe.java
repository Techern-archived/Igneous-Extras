package org.techern.minecraft.igneousextras.items.tools;

import net.minecraft.item.ItemAxe;
import org.techern.minecraft.igneousextras.items.IgneousItems;

public class ItemIgneousAxe extends ItemAxe {
	public ItemIgneousAxe(ToolMaterial mat, String unlocalizedName) {
		super(mat, 8.0F, -3.2F);
		this.setUnlocalizedName(unlocalizedName + "_axe");
		this.setRegistryName(unlocalizedName + "_axe");
		this.setCreativeTab(IgneousItems.TOOLS_TAB);
	}
}
