package com.zorean.ageofutilities.handlers;

import com.zorean.ageofutilities.gen.AgeOfUtilitiesOreGen;
import com.zorean.ageofutilities.init.ModArmor;
import com.zorean.ageofutilities.init.ModBlocks;
import com.zorean.ageofutilities.init.ModItem;
import com.zorean.ageofutilities.init.ModTools;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {


    public static void Client() {


        // ModItem.register();
        //ModTools.register();
        // ModArmor.register();
        // ModBlocks.registerRenders();
        RecipeHandler.registerCrafting();
        RecipeHandler.registerSmelting();

    }


    public static void Common() {

        ModItem.init();
        ModItem.register();

        ModBlocks.init();
        ModBlocks.register();
        //ModBlocks.registerRenders();
        ModTools.init();
        ModTools.register();

        ModArmor.init();
        ModArmor.register();

        GameRegistry.registerWorldGenerator(new AgeOfUtilitiesOreGen(), 0);

    }

}
