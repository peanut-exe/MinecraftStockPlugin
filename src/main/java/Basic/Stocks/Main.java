package Basic.Stocks;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends JavaPlugin implements Listener {

    public static int buymoney = 1500;
    public static double length = (int) (Math.log10(buymoney));
    public static String Stocks;
    public static double time = 0;

    @Override
    public void onEnable() {
        int e = 0;
        System.out.println("Stocks is ENABLE");
        System.out.println(length);
        Bukkit.getPluginManager().registerEvents(new Stocks(this), this);
        Bukkit.getPluginManager().registerEvents(new StockGuiEvent(this), this);
        getCommand("stock").setExecutor(new StockCommand());
        getCommand("sre").setExecutor(new reloadCommand());
    }

    @Override
    public void onLoad() {
        System.out.println(length);
    }
}
