package com.rocketmail.live2pwn;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class UncraftManager implements Listener{

	@EventHandler
	public void onInventoryClick(InventoryClickEvent evt){
		if(evt.getInventory().getTitle() != null){
			if(evt.getInventory().getTitle().equals(Main.inventory.getName())){
				if(evt.getCurrentItem() != null && evt.getCurrentItem().isSimilar(Main.d)){evt.setCancelled(true);}

			}
		}
	}

	public static void runUnCraft(Inventory e){
		if(e.getItem(19) != null){
			ItemStack i = e.getItem(19);
			if(getRecipeFor(i) != null){
				UncraftRecipe u = getRecipeFor(i);
				if(getSlotsClear(e) || getMatchingRecipe(u, e)){
					if(u.getRecipeAmount() <= e.getItem(19).getAmount()){
						u.recipifyTable(e);
						if(u.getRecipeAmount() < e.getItem(19).getAmount()){
							e.getItem(19).setAmount(e.getItem(19).getAmount() - u.getRecipeAmount());
						}else{
							e.setItem(19, new ItemStack(Material.AIR, 0));
						}
					}
				}
			}
		}
	}

	public static UncraftRecipe getRecipeFor(ItemStack i){
		boolean found = false;
		UncraftRecipe u = null;
		for(UncraftRecipe r : Main.recipes){
			if(r.getRecipe().isSimilar(i)){
				found = true;
				u = r;
			}
		}
		if(found){
			return u;
		}else{
			return null;
		}
	}

	public static boolean getSlotsClear(Inventory i){
		boolean yes = false;
		if(i.getItem(12) == null && i.getItem(13) == null && i.getItem(14) == null){
			if(i.getItem(21) == null && i.getItem(22) == null && i.getItem(23) == null){
				if(i.getItem(30) == null && i.getItem(31) == null && i.getItem(32) == null){
					yes = true;
				}
			}
		}
		if(yes){
			return true;
		}else{
			return false;
		}
	}

	//could be more compact code, please fix
	public static boolean getMatchingRecipe(UncraftRecipe u, Inventory i){
		boolean yes = false;
		boolean matches0 = false;
		boolean matches1 = false;
		boolean matches2 = false;
		boolean matches3 = false;
		boolean matches4 = false;
		boolean matches5 = false;
		boolean matches6 = false;
		boolean matches7 = false;
		boolean matches8 = false;
		try{if((i.getItem(12) == null && u.slot1 == Material.AIR) || (i.getItem(12) != null && i.getItem(12).isSimilar(new ItemStack(u.slot1))) || (i.getItem(12) == null && u.slot1 != Material.AIR)) matches0 = true;}catch(Exception e){}
		try{if((i.getItem(13) == null && u.slot2 == Material.AIR) || (i.getItem(13) != null && i.getItem(13).isSimilar(new ItemStack(u.slot2))) || (i.getItem(13) == null && u.slot2 != Material.AIR)) matches1 = true;}catch(Exception e){}
		try{if((i.getItem(14) == null && u.slot3 == Material.AIR) || (i.getItem(14) != null && i.getItem(14).isSimilar(new ItemStack(u.slot3))) || (i.getItem(14) == null && u.slot3 != Material.AIR)) matches2 = true;}catch(Exception e){}
		try{if((i.getItem(21) == null && u.slot4 == Material.AIR) || (i.getItem(21) != null && i.getItem(21).isSimilar(new ItemStack(u.slot4))) || (i.getItem(21) == null && u.slot4 != Material.AIR)) matches3 = true;}catch(Exception e){}
		try{if((i.getItem(22) == null && u.slot5 == Material.AIR) || (i.getItem(22) != null && i.getItem(22).isSimilar(new ItemStack(u.slot5))) || (i.getItem(22) == null && u.slot5 != Material.AIR)) matches4 = true;}catch(Exception e){}
		try{if((i.getItem(23) == null && u.slot6 == Material.AIR) || (i.getItem(23) != null && i.getItem(23).isSimilar(new ItemStack(u.slot6))) || (i.getItem(23) == null && u.slot6 != Material.AIR)) matches5 = true;}catch(Exception e){}
		try{if((i.getItem(30) == null && u.slot7 == Material.AIR) || (i.getItem(30) != null && i.getItem(30).isSimilar(new ItemStack(u.slot7))) || (i.getItem(30) == null && u.slot7 != Material.AIR)) matches6 = true;}catch(Exception e){}
		try{if((i.getItem(31) == null && u.slot8 == Material.AIR) || (i.getItem(31) != null && i.getItem(31).isSimilar(new ItemStack(u.slot8))) || (i.getItem(31) == null && u.slot8 != Material.AIR)) matches7 = true;}catch(Exception e){}
		try{if((i.getItem(32) == null && u.slot9 == Material.AIR) || (i.getItem(32) != null && i.getItem(32).isSimilar(new ItemStack(u.slot9))) || (i.getItem(32) == null && u.slot9 != Material.AIR)) matches8 = true;}catch(Exception e){}

		boolean underLimit = false;
		boolean ul0, ul1, ul2, ul3, ul4, ul5, ul6, ul7, ul8;
		ul0 = ul1 = ul2 = ul3 = ul4 = ul5 = ul6 = ul7 = ul8 = false;
		if(i.getItem(12) == null || (i.getItem(12) != null && i.getItem(12).getAmount() < i.getItem(12).getMaxStackSize()))ul0 = true;
		if(i.getItem(13) == null || (i.getItem(13) != null && i.getItem(13).getAmount() < i.getItem(13).getMaxStackSize()))ul1 = true;
		if(i.getItem(14) == null || (i.getItem(14) != null && i.getItem(14).getAmount() < i.getItem(14).getMaxStackSize()))ul2 = true;
		if(i.getItem(21) == null || (i.getItem(21) != null && i.getItem(21).getAmount() < i.getItem(21).getMaxStackSize()))ul3 = true;
		if(i.getItem(22) == null || (i.getItem(22) != null && i.getItem(22).getAmount() < i.getItem(22).getMaxStackSize()))ul4 = true;
		if(i.getItem(23) == null || (i.getItem(23) != null && i.getItem(23).getAmount() < i.getItem(23).getMaxStackSize()))ul5 = true;
		if(i.getItem(30) == null || (i.getItem(30) != null && i.getItem(30).getAmount() < i.getItem(30).getMaxStackSize()))ul6 = true;
		if(i.getItem(31) == null || (i.getItem(31) != null && i.getItem(31).getAmount() < i.getItem(31).getMaxStackSize()))ul7 = true;
		if(i.getItem(32) == null || (i.getItem(32) != null && i.getItem(32).getAmount() < i.getItem(32).getMaxStackSize()))ul8 = true;
		
		if(ul0 && ul1 && ul2 && ul3 && ul4 && ul5 && ul6 && ul7 && ul8)underLimit = true;
		if(matches0 && matches1 && matches2 && matches3 && matches4 && matches5 && matches6 && matches7 && matches8 && underLimit)yes = true;

		if(yes){
			return true;
		}else{
			return false;
		}
	}

}
