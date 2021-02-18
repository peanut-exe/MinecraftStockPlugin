package Basic.Stocks;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FileConfig {
    static File playersInfo;
    static FileConfiguration stockConfig;

    public static void newFile() {
        playersInfo = new File(Bukkit.getServer().getPluginManager().getPlugin("StockPlugin").getDataFolder(), "StockData.yml");
        if (playersInfo.exists()) {
            try {
                playersInfo.createNewFile();
            } catch (IOException e) {
                //
            }
        }
        stockConfig = YamlConfiguration.loadConfiguration(playersInfo);
    }
    public static FileConfiguration getStockConfig() {
        return stockConfig;
    }
    public static void ReloadStockConfig() {
        stockConfig = YamlConfiguration.loadConfiguration(playersInfo);
    }
}
