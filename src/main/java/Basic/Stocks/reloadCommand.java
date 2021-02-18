package Basic.Stocks;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static Basic.Stocks.Manager.BEManager.*;
import static Basic.Stocks.Manager.DBManager.*;
import static Basic.Stocks.Manager.PPManager.*;
import static Basic.Stocks.Manager.SPManager.SP;
import static Basic.Stocks.Manager.SPManager.SPStock;


public class reloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equals("sre")) {
            PP();
            DB();
            BE();
            SP();
            PPStock();
            DBStock();
            BJEStock();
            SPStock();
            Bukkit.broadcastMessage("주가 변동");
        }
        return false;
    }
}
