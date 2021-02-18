package Basic.Stocks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class StockCommand implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (command.getName().equals("stock")) {
                ItemStack is;ItemMeta im;
                ItemStack is1;ItemMeta im1;
                ItemStack is2;ItemMeta im2;
                ItemStack is3;ItemMeta im3;
                ItemStack is4;ItemMeta im4;
                Inventory inv = Bukkit.createInventory(null, 27, "주식");
                is = new ItemStack(Material.FEATHER);im = is.getItemMeta();im.setDisplayName("주가 확인");im.setLore(Arrays.asList("현재 주가를 확인합니다"));is.setItemMeta(im);
                is1 = new ItemStack(Material.FEATHER);im1 = is1.getItemMeta();im1.setDisplayName("주식 구매");im1.setLore(Arrays.asList("주식을 구매합니다"));is1.setItemMeta(im1);
                is2 = new ItemStack(Material.FEATHER);im2 = is2.getItemMeta();im2.setDisplayName("주식 매각");im2.setLore(Arrays.asList("주식을 매각합니다"));is2.setItemMeta(im2);
                inv.setItem(10, new ItemStack(is));
                inv.setItem(13, new ItemStack(is1));
                inv.setItem(16, new ItemStack(is2));
                p.openInventory(inv);
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }
}
