package org.techern.minecraft.igneousextras.items.weapons;

import net.minecraft.item.ItemSword;
import org.techern.minecraft.igneousextras.items.IgneousItems;

public class ItemIgneousSword extends ItemSword {
	public ItemIgneousSword(ToolMaterial mat, String unlocalizedName) {
		super(mat);
		this.setCreativeTab(IgneousItems.SWORDS_TAB);
		this.setUnlocalizedName(unlocalizedName + "_sword");
		this.setRegistryName(unlocalizedName + "_sword");
	}
}
