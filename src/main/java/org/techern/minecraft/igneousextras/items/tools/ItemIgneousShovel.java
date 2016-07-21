package org.techern.minecraft.igneousextras.items.tools;

import net.minecraft.item.ItemSpade;
import org.techern.minecraft.igneousextras.items.IgneousItems;

public class ItemIgneousShovel extends ItemSpade {
	public ItemIgneousShovel(ToolMaterial mat, String unlocalizedName) {
		super(mat);
		this.setUnlocalizedName(unlocalizedName + "_shovel");
		this.setRegistryName(unlocalizedName + "_shovel");
		this.setCreativeTab(IgneousItems.TOOLS_TAB);
	}
}
