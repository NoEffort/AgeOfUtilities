package com.zorean.ageofutilities.handlers;

import com.zorean.ageofutilities.init.ModArmor;
import com.zorean.ageofutilities.init.ModBlocks;
import com.zorean.ageofutilities.init.ModItem;
import com.zorean.ageofutilities.init.ModTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

    public static void registerCrafting() {

        GameRegistry.addShapedRecipe(new ResourceLocation("ageofutilities:antium_ore"), new ResourceLocation("ageofutilities:ageofutilities_blocks"),
                new ItemStack(ModBlocks.antium_ore), new Object[]{"SSS", "SIS", "SSS", 'S', Blocks.STONE, 'I', ModItem.antium_ingot});
        GameRegistry.addShapedRecipe(new ResourceLocation("ageofutilities:antium_block"), new ResourceLocation("ageofutilities:ageofutilities_blocks"),
                new ItemStack(ModBlocks.antium_block), new Object[]{"III", "III", "III", 'I', ModItem.antium_ingot});

        GameRegistry.addShapelessRecipe(new ResourceLocation("ageofutilities:antium_ingot"), new ResourceLocation("ageofutilities:ageofutilities_items"),
                new ItemStack(ModItem.antium_ingot, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(ModBlocks.antium_block))});


        registerToolCrafting(ModTools.antium_axe, ModTools.antium_hoe, ModTools.antium_pickaxe, ModTools.antium_shovel, ModTools.antium_sword, ModItem.antium_ingot);
        registerArmourCrafting(ModArmor.antium_helmet, ModArmor.antium_chestplate, ModArmor.antium_leggings, ModArmor.antium_boots, ModItem.antium_ingot);

    }

    public static void registerSmelting() {

        GameRegistry.addSmelting(ModBlocks.antium_ore, new ItemStack(ModItem.antium_ingot), 10);
    }

    private static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item shovel, Item sword, Item ingot) {

        GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_tools"),
                new ItemStack(axe), new Object[]{"II ", "IS ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + hoe.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_tools"),
                new ItemStack(hoe), new Object[]{"II ", " S ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_tools"),
                new ItemStack(pickaxe), new Object[]{"III", " S ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_tools"),
                new ItemStack(shovel), new Object[]{" I ", " S ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_tools"),
                new ItemStack(sword), new Object[]{" I ", " I ", " S ", 'S', Items.STICK, 'I', ModItem.antium_ingot});

    }

    private static void registerArmourCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {

        GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_armor"),
                new ItemStack(ModArmor.antium_helmet), new Object[]{"III", "I I", "   ", 'I', ModItem.antium_ingot});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_armor"),
                new ItemStack(ModArmor.antium_chestplate), new Object[]{"I I", "III", "III", 'I', ModItem.antium_ingot});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_armor"),
                new ItemStack(ModArmor.antium_leggings), new Object[]{"III", "I I", "I I", 'I', ModItem.antium_ingot});
        GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("ageofutilities:ageofutilities_antium_armor"),
                new ItemStack(ModArmor.antium_boots), new Object[]{"   ", "   ", "I I", 'I', ModItem.antium_ingot});

    }

}
