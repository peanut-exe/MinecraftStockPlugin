package Basic.Stocks.Evnet;

import Basic.Stocks.CheckMoney.BEChecking;
import Basic.Stocks.CheckMoney.DBChecking;
import Basic.Stocks.CheckMoney.PPChecking;
import Basic.Stocks.Main;
import Basic.Stocks.Manager.BEManager;
import Basic.Stocks.Manager.DBManager;
import Basic.Stocks.Manager.PPManager;
import com.cfriend.basicserverplugin.function.manager.MoneyManager;
import com.cfriend.basicserverplugin.util.FileManager;
import com.sun.istack.internal.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class StockGuiEvent implements Listener {

    Main pl;
    public StockGuiEvent(Main main) {
        pl = main;
    }

    @EventHandler
    public void PlayerInventoryInteract(InventoryClickEvent e) {
        ItemStack is;
        ItemMeta im;
        ItemStack is1;ItemMeta im1;
        ItemStack is2;ItemMeta im2;
        ItemStack is3;ItemMeta im3;
        ItemStack is4;ItemMeta im4;
        ItemStack is5;ItemMeta im5;
        ItemStack is6;ItemMeta im6;
        ItemStack is7;ItemMeta im7;
        Inventory inv;
        ItemStack cancels;ItemMeta cancelm;
        Player p = (Player) e.getWhoClicked();
        cancels = new ItemStack(Material.BARRIER);cancelm = cancels.getItemMeta();cancelm.setDisplayName("이전으로");cancels.setItemMeta(cancelm);
        if (e.getView().getTitle().equals("주식 구매")) {
            e.setCancelled(true);
            switch (e.getSlot()) {
                case 10:
                    p.closeInventory();
                    inv = Bukkit.createInventory(null, 27, "두부 운수 주식 구매");
                    is4 = new ItemStack(Material.EMERALD);im4 = is4.getItemMeta();im4.setDisplayName("구매");is4.setItemMeta(im4);
                    is = new ItemStack(Material.MINECART);im = is.getItemMeta();im.setDisplayName("현재 구매가 : " + DBChecking.buy);is.setItemMeta(im);
                    is3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);im3 = is3.getItemMeta();im3.setDisplayName(" ");im3.setLore(Arrays.asList(" "));is3.setItemMeta(im3);
                    inv.setItem(4, new ItemStack(is4));
                    inv.setItem(13, new ItemStack(is));
                    inv.setItem(22, new ItemStack(cancels));
                    /*Inventory inv = Bukkit.createInventory(null, 54, "두부 운수 주식 구매");
                    int i = 1500 * Integer.parseInt(DBManager.b);
                    String buy = Integer.toString(i);
                    p.openInventory(inv);*/
                    p.openInventory(inv);
                    break;
                case 11:
                    p.closeInventory();
                    inv = Bukkit.createInventory(null, 27, "땅콩 식품 주식 구매");
                    is4 = new ItemStack(Material.EMERALD);im4 = is4.getItemMeta();im4.setDisplayName("구매");is4.setItemMeta(im4);
                    is = new ItemStack(Material.CARROT);im = is.getItemMeta();im.setDisplayName("현재 구매가 : " + PPChecking.buy);is.setItemMeta(im);
                    is3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);im3 = is3.getItemMeta();im3.setDisplayName(" ");im3.setLore(Arrays.asList(" "));is3.setItemMeta(im3);
                    inv.setItem(4, new ItemStack(is4));
                    inv.setItem(13, new ItemStack(is));
                    inv.setItem(22, new ItemStack(cancels));
                    p.openInventory(inv);
                    break;
                case 12:
                    p.closeInventory();
                    inv = Bukkit.createInventory(null, 27, "백조 전자 주식 구매");
                    is4 = new ItemStack(Material.EMERALD);im4 = is4.getItemMeta();im4.setDisplayName("구매");is4.setItemMeta(im4);
                    is = new ItemStack(Material.CARROT);im = is.getItemMeta();im.setDisplayName("현재 구매가 : " + BEChecking.buy);is.setItemMeta(im);
                    is3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);im3 = is3.getItemMeta();im3.setDisplayName(" ");im3.setLore(Arrays.asList(" "));is3.setItemMeta(im3);
                    inv.setItem(4, new ItemStack(is4));
                    inv.setItem(13, new ItemStack(is));
                    inv.setItem(22, new ItemStack(cancels));
                    p.openInventory(inv);
                    break;
            }
        } else if (e.getView().getTitle().equals("두부 운수 주식 구매")) {
            e.setCancelled(true);
            switch (e.getSlot()){
                case 3:
                    p.closeInventory();
                    if (FileManager.getPlFile().getInt(p.getUniqueId() + ".money") <= Integer.parseInt(DBChecking.buy)) {
                        MoneyManager.plusMoney(p, p.getName(), "-1500");
                        is = new ItemStack(Material.PAPER);im = is.getItemMeta();im.setDisplayName("두부 운수 증권");is.setItemMeta(im);
                        p.getInventory().addItem(new ItemStack(is));
                    } else {
                        p.sendMessage("돈이 부족합니다");
                    }
                    break;
            }
        } else if (e.getView().getTitle().equals("땅콩 식품 주식 구매")) {
            e.setCancelled(true);
            switch (e.getSlot()){
                case 3:
                    p.closeInventory();
                    if (FileManager.getPlFile().getInt(p.getUniqueId() + ".money") <= Integer.parseInt(PPChecking.buy)) {
                        MoneyManager.plusMoney(p, p.getName(), "-1500");
                        is = new ItemStack(Material.PAPER);im = is.getItemMeta();im.setDisplayName("땅콩 식품 증권");is.setItemMeta(im);
                        p.getInventory().addItem(new ItemStack(is));
                    } else {
                        p.sendMessage("돈이 부족합니다");
                    }
                    break;
            }
        } else if (e.getView().getTitle().equals("백조 전자 주식 구매")) {
            e.setCancelled(true);
            switch (e.getSlot()){
                case 3:
                    p.closeInventory();
                    if (FileManager.getPlFile().getInt(p.getUniqueId() + ".money") <= Integer.parseInt(BEChecking.buy)) {
                        MoneyManager.plusMoney(p, p.getName(), "-1500");
                        is = new ItemStack(Material.PAPER);im = is.getItemMeta();im.setDisplayName("백조 전자 증권");is.setItemMeta(im);
                        p.getInventory().addItem(new ItemStack(is));
                    } else {
                        p.sendMessage("돈이 부족합니다");
                    }
                    break;
            }
        } else if (e.getView().getTitle().equals("주식 매각")) {
            e.setCancelled(true);
        }
    }
}
