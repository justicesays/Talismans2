package Talismans2.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * @author Gigabit101
 */

public class ConfigTalismans {
    private static ConfigTalismans instance = null;
    public static String CATEGORY_THAUMCRAFT = "thaumcraft";
    public static String CATEGORY_BLOODMAGIC = "blood magic";
    public static String CATEGORY_LOOT = "loot";
    public static String CATEGORY_RECIPES = "recipes";

    public static boolean ThaumscraftModuleTrue;
    public static boolean BloodMagicModuleTrue;
    public static boolean BlankTalismanLootTrue;
    public static boolean FlameTalismanLootTrue;
    public static boolean WaterTalismanLootTrue;
    public static boolean LightTalismanLootTrue;
    public static boolean MiningTalismanLootTrue;
    public static boolean MovementTalismanLootTrue;
    public static boolean InvisibleTalismanLootTrue;
    public static boolean WitherlessTalismanLootTrue;
    public static boolean CopyTalismansTrue;


    public static int ChanceBlankTalisman;
    public static int ChanceFlameTalisman;
    public static int ChanceWaterTalisman;
    public static int ChanceLightTalisman;
    public static int ChanceMovementTalisman;
    public static int ChanceMiningTalisman;
    public static int ChanceInvisibleTalisman;
    public static int ChanceWitherlessTalisman;

    public static Configuration config;


    private ConfigTalismans(File configFile) {
        config = new Configuration(configFile);
        config.load();

        ConfigTalismans.Configs();


        config.save();

    }

    public static ConfigTalismans initialize(File configFile) {

        if (instance == null)
            instance = new ConfigTalismans(configFile);
        else
            throw new IllegalStateException(
                    "Cannot initialize TalismanConfig twice");

        return instance;
    }

    public static ConfigTalismans instance() {
        if (instance == null) {

            throw new IllegalStateException(
                    "Instance of Talisman2Config requested before initialization");
        }
        return instance;
    }

    public static void Configs (){

        CopyTalismansTrue = config.get(CATEGORY_RECIPES, "Allow Talismans to be copied", false).getBoolean(true);
        ThaumscraftModuleTrue = config.get(CATEGORY_THAUMCRAFT, "Thaumcraft Module On", true).getBoolean(true);
        BloodMagicModuleTrue = config.get(CATEGORY_BLOODMAGIC, "Blood Magic Module On", true).getBoolean(true);
        //Loot
        BlankTalismanLootTrue = config.get(CATEGORY_LOOT, "Add Blank Talismans To DungeonLoot", true).getBoolean(true);
        FlameTalismanLootTrue = config.get(CATEGORY_LOOT, "Add Flame Talismans To DungeonLoot", true).getBoolean(true);
        WaterTalismanLootTrue = config.get(CATEGORY_LOOT, "Add Water Talismans To DungeonLoot", true).getBoolean(true);
        LightTalismanLootTrue = config.get(CATEGORY_LOOT, "Add Light Talismans To DungeonLoot", true).getBoolean(true);
        MiningTalismanLootTrue = config.get(CATEGORY_LOOT, "Add Mining Talismans To DungeonLoot", true).getBoolean(true);
        MovementTalismanLootTrue = config.get(CATEGORY_LOOT, "Add Movement Talismans To DungeonLoot", true).getBoolean(true);
        InvisibleTalismanLootTrue = config.get(CATEGORY_LOOT, "Add Invisible Talisman To DungeonLoot", true).getBoolean(true);
        WitherlessTalismanLootTrue = config.get(CATEGORY_LOOT, "Add Witherless Talisman To DungeonLoot", true).getBoolean(true);

        //Loot Chance
        ChanceBlankTalisman = config.get(Configuration.CATEGORY_GENERAL, "Blank Talisman spawning chance", 15).getInt();
        ChanceFlameTalisman = config.get(Configuration.CATEGORY_GENERAL, "Flame Talisman spawning chance", 15).getInt();
        ChanceWaterTalisman = config.get(Configuration.CATEGORY_GENERAL, "Water Talisman spawning chance", 15).getInt();
        ChanceLightTalisman = config.get(Configuration.CATEGORY_GENERAL, "Light Talisman spawning chance", 15).getInt();
        ChanceMovementTalisman = config.get(Configuration.CATEGORY_GENERAL, "Movement Talisman spawning chance", 15).getInt();
        ChanceMiningTalisman = config.get(Configuration.CATEGORY_GENERAL, "Mining Talisman spawning chance", 15).getInt();
        ChanceInvisibleTalisman = config.get(Configuration.CATEGORY_GENERAL, "Invisible Talisman Spawning Chance", 15).getInt();
        ChanceWitherlessTalisman = config.get(Configuration.CATEGORY_GENERAL, "Witherless Talisman Spawning Chance", 15).getInt();

        if(config.hasChanged())
            config.save();
    }
}
