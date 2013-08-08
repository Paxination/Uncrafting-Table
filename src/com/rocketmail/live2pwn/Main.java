package com.rocketmail.live2pwn;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	public final static Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	public static String prefix = "[UnCft] ";

	public static Inventory inventory;
	public static ItemStack d =  new ItemStack(Material.ENDER_PORTAL, 1);
	public static ArrayList<UncraftRecipe> recipes = new ArrayList<UncraftRecipe>();
	public static ArrayList<String> playersInTable = new ArrayList<String>();

	@Override
	public void onDisable(){
		int r = new Random().nextInt(5);
		switch(r){
		case 0: this.logger.info(prefix + "Goodbye."); break;
		case 1: this.logger.info(prefix + "Shutting down."); break;
		case 2: this.logger.info(prefix + "I dont hate you."); break;
		case 3: this.logger.info(prefix + "No hard feelings."); break;
		case 4: this.logger.info(prefix + "Sleep mode activated."); break;
		case 5: this.logger.info(prefix + "Are you still there?"); break;
		}
	}

	@Override
	public void onEnable(){
		initializeItems();
		Bukkit.getPluginManager().registerEvents(this, this);
		Bukkit.getPluginManager().registerEvents(new UncraftManager(), this);
		new UncraftingRecipes();
		UncraftingRecipes.initializeRecipes();
		int r = new Random().nextInt(5);
		switch(r){
		case 0: this.logger.info(prefix + "Hellooo."); break;
		case 1: this.logger.info(prefix + "Sentry mode activated.");break;
		case 2: this.logger.info(prefix + "There you are.");break;
		case 3: this.logger.info(prefix + "I see you.");break;
		case 4: this.logger.info(prefix + "Could you come over here?");break;
		case 5: this.logger.info(prefix + "Who are you?");break;
		}
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for(Player p : Bukkit.getOnlinePlayers()){
					runEffectChecker(p);
					if(playersInTable.contains(p.getName())){
						UncraftManager.runUnCraft(inventory);
					}
				}
			}
		}, 1L, 1L);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player p = (Player)sender;
		if (commandLabel.equalsIgnoreCase("uncft")) {
			PluginDescriptionFile pdf = this.getDescription();
			p.sendMessage(ChatColor.GOLD + "[" + ChatColor.YELLOW + "UnCft" + ChatColor.GOLD + "]" + ChatColor.DARK_AQUA + " Uncrafting Table V" + pdf.getVersion() + " developed by Live2Pwn (A.k.a live2pwn2010).");
		}
		return false;
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent evt){
		Player p = evt.getPlayer();
		if(evt.getClickedBlock() != null){
			if(evt.getClickedBlock().getType() == Material.WORKBENCH && evt.getAction() == Action.RIGHT_CLICK_BLOCK && isUncraftingTable(evt.getClickedBlock())){
				evt.setCancelled(true);
				openUT(p);
				playersInTable.add(p.getName());
			}
		}
	}
	
	@EventHandler
	public void onPlayerCloseInventory(InventoryCloseEvent evt){
		playersInTable.remove(evt.getPlayer().getName());
		if(evt.getInventory().getTitle() != null && evt.getInventory().getTitle().equals(Main.inventory.getName())){
			for(ItemStack i : evt.getInventory().getContents()){
				if(i != null && !i.isSimilar(d)){
					Item dropped = evt.getPlayer().getWorld().dropItem(evt.getPlayer().getLocation(), i);
				}
			}
		}
	}
	
	public void runEffectChecker(Player p){
		int range = 20;
		Location loc = p.getLocation();
		int x_start = loc.getBlockX() - (range/2);
		int y_start = loc.getBlockY() - (range/2);
		int z_start = loc.getBlockZ() - (range/2);

		int x_length = x_start + range;
		int y_length = y_start + range;
		int z_length = z_start + range;

		for(int x_operate = x_start; x_operate <= x_length; x_operate++){ 
			for(int y_operate = y_start; y_operate <= y_length; y_operate++){
				for(int z_operate = z_start; z_operate <= z_length; z_operate++){
					Block blockToChange = loc.getWorld().getBlockAt(x_operate,y_operate,z_operate);
					Block b = blockToChange;
					if(isUncraftingTable(b)){
						int r = new Random().nextInt(8);
						if(r == 2){
							p.getWorld().playEffect(b.getLocation(), Effect.MOBSPAWNER_FLAMES, 2004);
						}
					}
				}
			}
		}
	}

	public static boolean isUncraftingTable(Block b){
		boolean isUT = false;
		if(b.getType() == Material.WORKBENCH){
			if(b.getLocation().add(0.0, -1.0, 0).getBlock().getType() == Material.DIAMOND_BLOCK){
				isUT = true;
			}
		}
		if(isUT){
			return true;
		}else{
			return false;
		}
	}

	public void initializeItems(){
		inventory = Bukkit.createInventory(null, 45, "Uncrafting");
		ItemMeta mitem = d.getItemMeta();
		mitem.setDisplayName(" ");
		d.setItemMeta(mitem);
	}

	public void openUT(Player p){
		inventory = Bukkit.createInventory(p, 45, "Uncrafting");

		for(int i = 0; i < 45; i++){
			if(i != 19 && i != 12 && i != 13 && i != 14 && i != 12 && i != 21 && i != 22 && i != 23 && i != 25 && i != 30 && i != 31 && i != 32){
				inventory.setItem(i, d);

			}
		}
		p.openInventory(inventory);
	}
}
