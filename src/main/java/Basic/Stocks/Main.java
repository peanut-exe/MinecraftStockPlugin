package Basic.Stocks;

import Basic.Stocks.Command.StockCommand;
import Basic.Stocks.Command.TestCommand;
import Basic.Stocks.Command.reloadCommand;
import Basic.Stocks.Evnet.StockGuiEvent;
import Basic.Stocks.Evnet.Stocks;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public static double buymoney = 1500;
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
        getCommand("test").setExecutor(new TestCommand());
    }

    @Override
    public void onLoad() {
        System.out.println(length);
    }
}
