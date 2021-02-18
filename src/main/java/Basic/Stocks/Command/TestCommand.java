package Basic.Stocks.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (command.getName().equals("test")) {
            String g = "" + 1234;
            double i = Double.parseDouble(g);
            p.sendMessage(String.valueOf(i));
        }
        return false;
    }
}
