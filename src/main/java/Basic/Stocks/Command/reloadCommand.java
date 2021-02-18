package Basic.Stocks.Command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static Basic.Stocks.CheckMoney.BEChecking.BECheck;
import static Basic.Stocks.CheckMoney.DBChecking.DBCheck;
import static Basic.Stocks.CheckMoney.PPChecking.PPCheck;
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
            BECheck();
            PPCheck();
            DBCheck();
            Bukkit.broadcastMessage(ChatColor.YELLOW +"주가가 변동되었습니다");
        }
        return false;
    }
}
