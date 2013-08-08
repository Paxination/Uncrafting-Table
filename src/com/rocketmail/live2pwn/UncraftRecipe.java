package com.rocketmail.live2pwn;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class UncraftRecipe {
	Material slot1;
	Material slot2;
	Material slot3;
	Material slot4;
	Material slot5;
	Material slot6;
	Material slot7;
	Material slot8;
	Material slot9;
	ItemStack crafted;
	
	public UncraftRecipe(ItemStack crafty, Material st1, Material st2, Material st3, Material st4, Material st5, Material st6, Material st7, Material st8, Material st9){
		this.crafted = crafty;
		this.slot1 = st1;
		this.slot2 = st2;
		this.slot3 = st3;
		this.slot4 = st4;
		this.slot5 = st5;
		this.slot6 = st6;
		this.slot7 = st7;
		this.slot8 = st8;
		this.slot9 = st9;
	}
	
	public Material[] getProduct(){
		Material[] m = {this.slot1, this.slot2, this.slot3, this.slot4, this.slot5, this.slot6, this.slot7, this.slot8, this.slot9};
		return m;
	}
	
	public ItemStack getRecipe(){
		return this.crafted;
	}
	
	public void recipifyTable(Inventory i){
		if(UncraftManager.getMatchingRecipe(this, i)){
			if(i.getItem(12) != null){i.getItem(12).setAmount(i.getItem(12).getAmount() + 1);}else{i.setItem(12, new ItemStack(this.slot1, 1));}
			if(i.getItem(13) != null){i.getItem(13).setAmount(i.getItem(13).getAmount() + 1);}else{i.setItem(13, new ItemStack(this.slot2, 1));}
			if(i.getItem(14) != null){i.getItem(14).setAmount(i.getItem(14).getAmount() + 1);}else{i.setItem(14, new ItemStack(this.slot3, 1));}
			if(i.getItem(21) != null){i.getItem(21).setAmount(i.getItem(21).getAmount() + 1);}else{i.setItem(21, new ItemStack(this.slot4, 1));}
			if(i.getItem(22) != null){i.getItem(22).setAmount(i.getItem(22).getAmount() + 1);}else{i.setItem(22, new ItemStack(this.slot5, 1));}
			if(i.getItem(23) != null){i.getItem(23).setAmount(i.getItem(23).getAmount() + 1);}else{i.setItem(23, new ItemStack(this.slot6, 1));}
			if(i.getItem(30) != null){i.getItem(30).setAmount(i.getItem(30).getAmount() + 1);}else{i.setItem(30, new ItemStack(this.slot7, 1));}
			if(i.getItem(31) != null){i.getItem(31).setAmount(i.getItem(31).getAmount() + 1);}else{i.setItem(31, new ItemStack(this.slot8, 1));}
			if(i.getItem(32) != null){i.getItem(32).setAmount(i.getItem(32).getAmount() + 1);}else{i.setItem(32, new ItemStack(this.slot9, 1));}
		}
	}
	
	public int getRecipeAmount(){
		return this.crafted.getAmount();
	}
	
}
