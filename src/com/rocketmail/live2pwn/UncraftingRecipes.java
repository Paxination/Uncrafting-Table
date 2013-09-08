package com.rocketmail.live2pwn;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class UncraftingRecipes {

	public static void initializeRecipes(){

		//Diamond boots
		//gold boots
		//iron boots
		//leather boots
		//diamond chestplate
		//gold chestplate
		//iron chestplate
		//leather chestplate
		//diamond helmet
		//gold helmet
		//iron helmet
		//leather helmet
		UncraftRecipe brickBlock = new UncraftRecipe(new ItemStack(Material.BRICK, 1), Material.CLAY_BRICK, Material.CLAY_BRICK, Material.AIR, Material.CLAY_BRICK, Material.CLAY_BRICK, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe clayBlock = new UncraftRecipe(new ItemStack(Material.CLAY, 1), Material.CLAY_BALL, Material.CLAY_BALL, Material.AIR, Material.CLAY_BALL, Material.CLAY_BALL, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe diamondBlock = new UncraftRecipe(new ItemStack(Material.DIAMOND_BLOCK, 1), Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND, Material.DIAMOND);
		UncraftRecipe glowstoneBlock = new UncraftRecipe(new ItemStack(Material.GLOWSTONE, 1), Material.GLOWSTONE_DUST, Material.GLOWSTONE_DUST, Material.AIR, Material.GLOWSTONE_DUST, Material.GLOWSTONE_DUST, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe goldBlock = new UncraftRecipe(new ItemStack(Material.GOLD_BLOCK, 1), Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.GOLD_INGOT);
		UncraftRecipe ironBlock = new UncraftRecipe(new ItemStack(Material.IRON_BLOCK, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);
		UncraftRecipe lapisBlock = new UncraftRecipe(new ItemStack(Material.LAPIS_LAZULI_BLOCK, 1), Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI);
		UncraftRecipe melonBlock = new UncraftRecipe(new ItemStack(Material.MELON_BLOCK, 1), Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON, Material.MELON);
		UncraftRecipe sandstoneBlock = new UncraftRecipe(new ItemStack(Material.SANDSTONE, 1), Material.SAND, Material.SAND, Material.AIR, Material.SAND, Material.SAND, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe snowBlock = new UncraftRecipe(new ItemStack(Material.SNOW_BLOCK, 1), Material.SNOW_BALL, Material.SNOW_BALL, Material.AIR, Material.SNOW_BALL, Material.SNOW_BALL, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe stoneBrickBlock = new UncraftRecipe(new ItemStack(Material.STONE_BRICK, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STONE, Material.STONE, Material.STONE, Material.STONE);
		UncraftRecipe tnt = new UncraftRecipe(new ItemStack(Material.TNT, 1), Material.SULPHUR, Material.SAND, Material.SULPHUR, Material.SAND, Material.SULPHUR, Material.SAND, Material.SULPHUR, Material.SAND, Material.SULPHUR);
		UncraftRecipe woodPlank = new UncraftRecipe(new ItemStack(Material.WOOD, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.LOG, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe bed = new UncraftRecipe(new ItemStack(Material.BED, 1), Material.AIR, Material.AIR, Material.AIR, Material.WOOL, Material.WOOL, Material.WOOL, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe bookshelf = new UncraftRecipe(new ItemStack(Material.BOOKSHELF, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.BOOK, Material.BOOK, Material.BOOK, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe ironDoor = new UncraftRecipe(new ItemStack(Material.IRON_DOOR, 1), Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR);
		UncraftRecipe woodDoor = new UncraftRecipe(new ItemStack(Material.WOOD_DOOR, 1), Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.AIR);
		UncraftRecipe netherBrickFence = new UncraftRecipe(new ItemStack(Material.NETHER_FENCE, 6), Material.AIR, Material.AIR, Material.AIR, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK);
		UncraftRecipe woodFence = new UncraftRecipe(new ItemStack(Material.FENCE, 2), Material.AIR, Material.AIR, Material.AIR, Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.STICK);
		UncraftRecipe fenceGate = new UncraftRecipe(new ItemStack(Material.FENCE_GATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.STICK, Material.WOOD, Material.STICK, Material.STICK, Material.WOOD, Material.STICK);
		UncraftRecipe glassPane = new UncraftRecipe(new ItemStack(Material.GLASS_PANE, 16), Material.AIR, Material.AIR, Material.AIR, Material.GLASS, Material.GLASS, Material.GLASS, Material.GLASS, Material.GLASS, Material.GLASS);
		UncraftRecipe ironBars = new UncraftRecipe(new ItemStack(Material.IRON_BARS, 16), Material.AIR, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);
		UncraftRecipe jackOLantern = new UncraftRecipe(new ItemStack(Material.JACK_O_LANTERN, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.PUMPKIN, Material.AIR, Material.AIR, Material.TORCH, Material.AIR);
		UncraftRecipe jukebox = new UncraftRecipe(new ItemStack(Material.JUKEBOX, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.DIAMOND, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe ladder = new UncraftRecipe(new ItemStack(Material.LADDER, 3), Material.STICK, Material.AIR, Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.AIR, Material.STICK);
		UncraftRecipe noteBlock = new UncraftRecipe(new ItemStack(Material.NOTE_BLOCK, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.REDSTONE, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe painting = new UncraftRecipe(new ItemStack(Material.PAINTING, 1), Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.WOOL, Material.STICK, Material.STICK, Material.STICK, Material.STICK);
		UncraftRecipe sign = new UncraftRecipe(new ItemStack(Material.SIGN, 3), Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe bricksSlab = new UncraftRecipe(new ItemStack(Material.BRICKS_SLAB, 6), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.BRICKS, Material.BRICKS, Material.BRICKS);
		UncraftRecipe cobblestoneSlab = new UncraftRecipe(new ItemStack(Material.COBBLESTONE_SLAB, 6), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE);
		UncraftRecipe sandstoneSlab = new UncraftRecipe(new ItemStack(Material.SANDSTONE_SLAB, 6), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SANDSTONE, Material.SANDSTONE, Material.SANDSTONE);
		UncraftRecipe stoneBricksSlab = new UncraftRecipe(new ItemStack(Material.STONE_BRICKS_SLAB, 6) Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STONE_BRICK);
		UncraftRecipe stoneSlab = new UncraftRecipe(new ItemStack(Material.STONE_SLAB, 6) Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STONE, Material.STONE, Material.STONE);
		//wood slab
		UncraftRecipe brickStairs = new UncraftRecipe(new ItemStack(Material.BRICK_STAIRS, 4), Material.AIR, Material.AIR, Material.AIR, Material.BRICKS, Material.BRICKS, Material.BRICKS, Material.BRICKS, Material.BRICKS, Material.BRICKS); 
		UncraftRecipe netherBrickStairs = new UncraftRecipe(new ItemStack(Material.NETHER_BRICK_STAIRS, 4), Material.AIR, Material.AIR, Material.AIR, Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK,Material.NETHER_BRICK, Material.NETHER_BRICK, Material.NETHER_BRICK);
		UncraftRecipe stoneBrickStairs = new UncraftRecipe(new ItemStack(Material.STONE_BRICK_STAIRS, 4), Material.AIR, Material.AIR, Material.AIR, Material.STONE_BRICK, Material.STONE_BRICK, Material.STONE_BRICK, Material.STONE_BRICK, Material.STONE_BRICK, Material.STONE_BRICK);
		UncraftRecipe cobblestoneStairs = new UncraftRecipe(new ItemStack(Material.COBBLESTONE_STAIRS, 4), Material.AIR, Material.AIR, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE);
 		//wood stairs
		UncraftRecipe trapdoor = new UncraftRecipe(new ItemStack(Material.TRAP_DOOR, 2), Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		//bonemeal
		//cyan dye
		//dandilion dye
		//gray dye
		//light blue dye
		//light gray dye
		//lime dye
		//magenta dye
		//orange dye
		//pink dye
		//purple dye
		//rose red dye
		UncraftRecipe bowl = new UncraftRecipe(new ItemStack(Material.BOWL, 4), Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.AIR, Material.WOOD, Material.AIR, Material.WOOD, Material.AIR);
		UncraftRecipe bread = new UncraftRecipe(new ItemStack(Material.BREAD, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.WHEAT, Material.WHEAT, Material.WHEAT);
		UncraftRecipe cake = new UncraftRecipe(new ItemStack(Material.CAKE, 1), Material.AIR, Material.AIR, Material.AIR, Material.SUGAR, Material.EGG, Material.SUGAR, Material.WHEAT, Material.WHEAT, Material.WHEAT);
		//cookie
		//golden apple
		//enchanted golden apple
		UncraftRecipe melonSeeds = new UncraftRecipe(new ItemStack(Material.MELON_SEEDS, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.MELON, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe mushroomStew = new UncraftRecipe(new ItemStack(Material.MUSHROOM_SOUP, 1), Material.AIR, Material.RED_MUSHROOM, Material.AIR, Material.AIR, Material.BROWN_MUSHROOM, Material.AIR, Material.AIR, Material.BOWL, Material.AIR);
		UncraftRecipe pumpkinSeeds = new UncraftRecipe(new ItemStack(Material.PUMPKIN_SEEDS, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.PUMPKIN, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe sugar = new UncraftRecipe(new ItemStack(Material.SUGAR, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SUGAR_CANE, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe goldIngot = new UncraftRecipe(new ItemStack(Material.GOLD_INGOT, 1), Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET, Material.GOLD_NUGGET);
		UncraftRecipe blazePowder = new UncraftRecipe(new ItemStack(Material.BLAZE_POWDER, 2), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.BLAZE_ROD, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe book = new UncraftRecipe(new ItemStack(Material.BOOK, 1), Material.AIR, Material.PAPER, Material.AIR, Material.AIR, Material.PAPER, Material.AIR, Material.AIR, Material.PAPER, Material.LEATHER);
		UncraftRecipe brewingStand = new UncraftRecipe(new ItemStack(Material.BREWING_STAND_ITEM, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.BLAZE_ROD, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE);
		UncraftRecipe cauldron = new UncraftRecipe(new ItemStack(Material.CAULDRON_ITEM, 1), Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);
		UncraftRecipe chest = new UncraftRecipe(new ItemStack(Material.CHEST, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe workbench = new UncraftRecipe(new ItemStack(Material.WORKBENCH, 1), Material.WOOD, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe dispenser = new UncraftRecipe(new ItemStack(Material.DISPENSER, 1), Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.BOW, Material.COBBLESTONE, Material.COBBLESTONE, Material.REDSTONE, Material.COBBLESTONE);
		UncraftRecipe enchantingTable = new UncraftRecipe(new ItemStack(Material.ENCHANTMENT_TABLE, 1), Material.AIR, Material.BOOK, Material.AIR, Material.DIAMOND, Material.OBSIDIAN, Material.DIAMOND, Material.OBSIDIAN, Material.OBSIDIAN, Material.OBSIDIAN);
		UncraftRecipe eyeOfEnder = new UncraftRecipe(new ItemStack(Material.EYE_OF_ENDER, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.BLAZE_POWDER, Material.AIR, Material.AIR, Material.ENDER_PEARL, Material.AIR);
		UncraftRecipe fermentedSpiderEye = new UncraftRecipe(new ItemStack(Material.FERMENTED_SPIDER_EYE, 1), Material.SPIDER_EYE, Material.AIR, Material.AIR, Material.BROWN_MUSHROOM, Material.SUGAR, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		UncraftRecipe furnace = new UncraftRecipe(new ItemStack(Material.FURNACE, 1), Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.AIR, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE, Material.COBBLESTONE);
		UncraftRecipe glassBottle = new UncraftRecipe(new ItemStack(Material.GLASS_BOTTLE, 3), Material.AIR, Material.AIR, Material.AIR, Material.GLASS, Material.AIR, Material.GLASS, Material.AIR, Material.GLASS, Material.AIR);
		UncraftRecipe magmaCream = new UncraftRecipe(new ItemStack(Material.MAGMA_CREAM, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SLIME_BALL, Material.AIR, Material.AIR, Material.BLAZE_POWDER, Material.AIR);
		UncraftRecipe paper = new UncraftRecipe(new ItemStack(Material.PAPER, 3), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SUGAR_CANE, Material.SUGAR_CANE, Material.SUGAR_CANE);
		UncraftRecipe stick = new UncraftRecipe(new ItemStack(Material.STICK, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.AIR, Material.AIR, Material.WOOD, Material.AIR);
		UncraftRecipe torch = new UncraftRecipe(new ItemStack(Material.TORCH, 4), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.COAL, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		UncraftRecipe piston = new UncraftRecipe(new ItemStack(Material.PISTON_BASE, 1), Material.WOOD, Material.WOOD, Material.WOOD, Material.COBBLESTONE, Material.IRON_INGOT, Material.COBBLESTONE, Material.COBBLESTONE, Material.REDSTONE, Material.COBBLESTONE);
		UncraftRecipe lever = new UncraftRecipe(new ItemStack(Material.LEVER, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.COBBLESTONE, Material.AIR);
		UncraftRecipe stonePressurePlate = new UncraftRecipe(new ItemStack(Material.STONE_PLATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STONE, Material.STONE, Material.AIR);
		UncraftRecipe woodPressurePlate = new UncraftRecipe(new ItemStack(Material.WOOD_PLATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.WOOD, Material.AIR);
		UncraftRecipe redstoneRepeater = new UncraftRecipe(new ItemStack(Material.DIODE, 1), Material.AIR, Material.AIR, Material.AIR, Material.REDSTONE_TORCH_ON, Material.REDSTONE, Material.REDSTONE_TORCH_ON, Material.STONE, Material.STONE, Material.STONE);
		UncraftRecipe stickyPiston = new UncraftRecipe(new ItemStack(Material.PISTON_STICKY_BASE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.SLIME_BALL, Material.AIR, Material.AIR, Material.PISTON_BASE, Material.AIR);
		UncraftRecipe stoneButton = new UncraftRecipe(new ItemStack(Material.STONE_BUTTON, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.STONE, Material.AIR, Material.AIR, Material.STONE, Material.AIR);
		UncraftRecipe redstoneTorch = new UncraftRecipe(new ItemStack(Material.REDSTONE_TORCH_ON, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.REDSTONE, Material.AIR, Material.AIR, Material.STICK, Material.AIR);
		//diamond axe
		//gold axe
		//iron axe
		//stone axe
		//wood axe
		UncraftRecipe bucket = new UncraftRecipe(new ItemStack(Material.BUCKET, 1), Material.AIR, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.AIR);
		UncraftRecipe clock = new UncraftRecipe(new ItemStack(Material.WATCH, 1), Material.AIR, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.REDSTONE, Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.AIR);
		UncraftRecipe compass = new UncraftRecipe(new ItemStack(Material.COMPASS, 1), Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.REDSTONE, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.AIR);
		//fishing rod
		//flint and steel
		//diamond hoe
		//gold hoe
		//iron hoe
		//stone hoe
		//wood hoe
		UncraftRecipe map = new UncraftRecipe(new ItemStack(Material.MAP, 1), Material.PAPER, Material.PAPER, Material.PAPER, Material.PAPER, Material.COMPASS, Material.PAPER, Material.PAPER, Material.PAPER, Material.PAPER);
		//diamond pickaxe
		//gold pickaxe
		//iron pickaxe
		//stone pickaxe
		//wood pickaxe
		//shears
		//diamond shovel
		//gold shovel
		//iron shovel
		//stone shovel
		//wood shovel
		UncraftRecipe boat = new UncraftRecipe(new ItemStack(Material.BOAT, 1), Material.AIR, Material.AIR, Material.AIR, Material.WOOD, Material.AIR, Material.WOOD, Material.WOOD, Material.WOOD, Material.WOOD);
		UncraftRecipe detectorRail = new UncraftRecipe(new ItemStack(Material.DETECTOR_RAIL, 6), Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.STONE_PLATE, Material.IRON_INGOT, Material.IRON_INGOT, Material.REDSTONE, Material.IRON_INGOT);
		UncraftRecipe poweredRail = new UncraftRecipe(new ItemStack(Material.POWERED_RAIL, 6), Material.GOLD_INGOT, Material.AIR, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.STICK, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.REDSTONE, Material.GOLD_INGOT);
		UncraftRecipe rail = new UncraftRecipe(new ItemStack(Material.RAILS, 16), Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.STICK, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT);
		UncraftRecipe minecart = new UncraftRecipe(new ItemStack(Material.MINECART, 1), Material.AIR, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT, Material.IRON_INGOT);
		UncraftRecipe poweredMinecart = new UncraftRecipe(new ItemStack(Material.POWERED_MINECART, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.FURNACE, Material.AIR, Material.AIR, Material.MINECART, Material.AIR);
		UncraftRecipe chestMinecart = new UncraftRecipe(new ItemStack(Material.STORAGE_MINECART, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.CHEST, Material.AIR, Material.AIR, Material.MINECART, Material.AIR);
		UncraftRecipe arrow = new UncraftRecipe(new ItemStack(Material.ARROW, 4), Material.AIR, Material.FLINT, Material.AIR, Material.AIR, Material.STICK, Material.AIR, Material.AIR, Material.FEATHER, Material.AIR);
		//bow
		//diamond sword
		//gold sword
		//iron sword
		//stone sword
		//wood sword
		UncraftRecipe wool = new UncraftRecipe(new ItemStack(Material.WOOL, 1), Material.STRING, Material.STRING, Material.AIR, Material.STRING, Material.STRING, Material.AIR, Material.AIR, Material.AIR, Material.AIR);
		//black wool
		//blue wool
		//brown wool
		//cyan wool
		//gray wool
		//green wool
		//light blue wool
		//light grey wool
		//lime wool
		//magenta wool
		//orange wool
		//pink wool
		//purple wool
		//red wool
		//yellow wool
		//emerald block
		//redstone lamp
		//stained clay
		//nether brick
		//block of redstone
		//quartz block
		//hay bale
		//block of coal
		//horse armor
		//tnt cart
		//hopper cart
		UncraftRecipe goldPressurePad = new UncraftRecipe(new ItemStack(Material.GOLD_PLATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.GOLD_INGOT, Material.GOLD_INGOT, Material.AIR);
		UncraftRecipe ironPressurePad = new UncraftRecipe(new ItemStack(Material.IRON_PLATE, 1), Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.AIR, Material.IRON_INGOT, Material.IRON_INGOT, Material.AIR);
		//tripwire hook
		//trapped chest
		//daylight sensor
		//dropper
		//redstone comparator
		//pumpkin pie
		//golden carrot
		//cobblestone wall
		//book and quill
		//fire charge
		//ender chest
		//beacon
		//anvil
		UncraftRecipe flowerPot = new UncraftRecipe(new ItemStack(Material.FLOWER_POT_ITEM, 1), Material.AIR, Material.AIR, Material.AIR, Material.CLAY_BRICK, Material.AIR, Material.CLAY_BRICK, Material.AIR, Material.CLAY_BRICK, Material.AIR);
		UncraftRecipe itemFrame = new UncraftRecipe(new ItemStack(Material.ITEM_FRAME, 1), Material.STICK, Material.STICK, Material.STICK, Material.STICK, Material.LEATHER, Material.STICK, Material.STICK, Material.STICK, Material.STICK);
		//carrot on a stick
		//firework rocket
		//firework star
		//lead
		//carpet
		//glistering melon
		
		Main.recipes.add(brickBlock);
		Main.recipes.add(clayBlock);
		Main.recipes.add(diamondBlock);
		Main.recipes.add(glowstoneBlock);
		Main.recipes.add(goldBlock);
		Main.recipes.add(ironBlock);
		Main.recipes.add(melonBlock);
		Main.recipes.add(sandstoneBlock);
		Main.recipes.add(snowBlock);
		Main.recipes.add(tnt);
		Main.recipes.add(woodPlank);
		Main.recipes.add(bed);
		Main.recipes.add(bookshelf);
		Main.recipes.add(ironDoor);
		Main.recipes.add(woodDoor);
		Main.recipes.add(netherBrickFence);
		Main.recipes.add(woodFence);
		Main.recipes.add(fenceGate);
		Main.recipes.add(jackOLantern);
		Main.recipes.add(jukebox);
		Main.recipes.add(ladder);
		Main.recipes.add(noteBlock);
		Main.recipes.add(painting);
		Main.recipes.add(sign);
		Main.recipes.add(trapdoor);
		Main.recipes.add(bowl);
		Main.recipes.add(bread);
		Main.recipes.add(cake);
		Main.recipes.add(melonSeeds);
		Main.recipes.add(mushroomStew);
		Main.recipes.add(pumpkinSeeds);
		Main.recipes.add(sugar);
		Main.recipes.add(goldIngot);
		Main.recipes.add(blazePowder);
		Main.recipes.add(book);
		Main.recipes.add(brewingStand);
		Main.recipes.add(cauldron);
		Main.recipes.add(chest);
		Main.recipes.add(workbench);
		Main.recipes.add(dispenser);
		Main.recipes.add(enchantingTable);
		Main.recipes.add(eyeOfEnder);
		Main.recipes.add(fermentedSpiderEye);
		Main.recipes.add(furnace);
		Main.recipes.add(glassBottle);
		Main.recipes.add(magmaCream);
		Main.recipes.add(paper);
		Main.recipes.add(stick);
		Main.recipes.add(torch);
		Main.recipes.add(piston);
		Main.recipes.add(lever);
		Main.recipes.add(stonePressurePlate);
		Main.recipes.add(woodPressurePlate);
		Main.recipes.add(redstoneRepeater);
		Main.recipes.add(stickyPiston);
		Main.recipes.add(stoneButton);
		Main.recipes.add(redstoneTorch);
		Main.recipes.add(bucket);
		Main.recipes.add(clock);
		Main.recipes.add(compass);
		Main.recipes.add(map);
		Main.recipes.add(boat);
		Main.recipes.add(detectorRail);
		Main.recipes.add(poweredRail);
		Main.recipes.add(rail);
		Main.recipes.add(minecart);
		Main.recipes.add(poweredMinecart);
		Main.recipes.add(chestMinecart);
		Main.recipes.add(wool);
		Main.recipes.add(goldPressurePad);
		Main.recipes.add(ironPressurePad);
		Main.recipes.add(flowerPot);
		Main.recipes.add(itemFrame);
		
		
		Main.recipes.add(arrow);
		for(UncraftRecipe u : Main.recipes){
		System.out.println(Main.prefix + "Loaded recipe for: " + u.getRecipe().getType().toString());
		}
	}
}
