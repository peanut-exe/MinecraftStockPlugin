package Basic.Stocks;

import Basic.Stocks.Manager.BEManager;
import Basic.Stocks.Manager.DBManager;
import Basic.Stocks.Manager.PPManager;
import Basic.Stocks.Manager.SPManager;
import com.cfriend.basicserverplugin.function.manager.MoneyManager;
import com.cfriend.basicserverplugin.util.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;

public class Stocks implements Listener {

    Main pl;
    public Stocks(Main main) {
        pl = main;
    }

    @EventHandler
    public void InventoryClick(InventoryClickEvent e) {
        ItemStack is;ItemMeta im;
        ItemStack is1;ItemMeta im1;
        ItemStack is2;ItemMeta im2;
        ItemStack is3;ItemMeta im3;
        ItemStack is4;ItemMeta im4;
        ItemStack is5;ItemMeta im5;
        ItemStack is6;ItemMeta im6;
        ItemStack is7;ItemMeta im7;
        ItemStack cancels;ItemMeta cancelm;
        Player p = (Player) e.getWhoClicked();
        cancels = new ItemStack(Material.BARRIER);cancelm = cancels.getItemMeta();cancelm.setDisplayName("이전으로");cancels.setItemMeta(cancelm);
        if (e.getView().getTitle().equals("주식")) {
            e.setCancelled(true);
            switch (e.getSlot()) {
                case 10:
                    p.closeInventory();
                    Inventory view_inv = Bukkit.createInventory(null, 54, "주가 확인");
                    is = new ItemStack(Material.COAL);im = is.getItemMeta();im.setDisplayName("두부 운수 현재 구매가 : " + DBManager.i);im.setLore(Arrays.asList("두부 운수의 주가 " + DBManager.stocks + "입니다"));is.setItemMeta(im);
                    is1 = new ItemStack(Material.COAL);im1 = is1.getItemMeta();im1.setDisplayName("땅콩 식품 현재 구매가 : " + PPManager.i);im1.setLore(Arrays.asList("땅콩 식품의 주가 " + PPManager.stocks + "입니다"));is1.setItemMeta(im1);
                    is2 = new ItemStack(Material.COAL);im2 = is2.getItemMeta();im2.setDisplayName("백조 전자 현재 구매가 : " + BEManager.i);im2.setLore(Arrays.asList("백조 전자의 주가 " + BEManager.stocks + "입니다"));is2.setItemMeta(im2);
                    //is4 = new ItemStack(Material.COAL);im4 = is2.getItemMeta();im4.setDisplayName("백조 전자");im4.setLore(Arrays.asList("백조 전자의 주가" + BEManager.FullStock + "입니다"));is4.setItemMeta(im4);
                    is5 = new ItemStack(Material.COAL);im5 = is5.getItemMeta();im2.setDisplayName("실버 판테온 현재 구매 : " + SPManager.i);im5.setLore(Arrays.asList("실버 판테온의 주가 " + SPManager.stocks + "입니다"));is5.setItemMeta(im5);
                    //비리온 제과
                    is3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);im3 = is3.getItemMeta();im3.setDisplayName(" ");im3.setLore(Arrays.asList(" "));is3.setItemMeta(im3);
                    view_inv.setItem(10, new ItemStack(is));
                    view_inv.setItem(11, new ItemStack(is1));
                    view_inv.setItem(12, new ItemStack(is2));
                    //view_inv.setItem(13, new ItemStack(is4));
                    view_inv.setItem(37, new ItemStack(is3));
                    view_inv.setItem(38, new ItemStack(is3));
                    view_inv.setItem(39, new ItemStack(is3));
                    view_inv.setItem(40, new ItemStack(is3));
                    view_inv.setItem(41, new ItemStack(is3));
                    view_inv.setItem(42, new ItemStack(is3));
                    view_inv.setItem(43, new ItemStack(is3));
                    view_inv.setItem(44, new ItemStack(is3));
                    view_inv.setItem(36, new ItemStack(is3));
                    view_inv.setItem(49, new ItemStack(cancels));
                    view_inv.setItem(13, new ItemStack(is5));
                    p.openInventory(view_inv);
                    break;
                case 13:
                    p.closeInventory();
                    Inventory inv = Bukkit.createInventory(null, 54, "주식 구매");
                    is = new ItemStack(Material.COAL);im = is.getItemMeta();im.setDisplayName("두부 운수");im.setLore(Arrays.asList("두부 운수의 주식을 구매합니다"));is.setItemMeta(im);
                    is1 = new ItemStack(Material.CARROT);im1 = is1.getItemMeta();im1.setDisplayName("땅콩 식품");im1.setLore(Arrays.asList("땅콩 식품의 주식을 구매합니다"));is1.setItemMeta(im1);
                    is2 = new ItemStack(Material.REDSTONE);im2 = is2.getItemMeta();im2.setDisplayName("백조 전자");im2.setLore(Arrays.asList("백조 전자의 주식을 구매합니다"));is2.setItemMeta(im2);
                    is5 = new ItemStack(Material.COAL);im5 = is5.getItemMeta();im2.setDisplayName("실버 판테온");im5.setLore(Arrays.asList("실버 판테온의 주가 " + SPManager.stocks + "입니다"));is5.setItemMeta(im5);
                    is3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);im3 = is3.getItemMeta();im3.setDisplayName(" ");im3.setLore(Arrays.asList(" "));is3.setItemMeta(im3);
                    inv.setItem(10, new ItemStack(is));
                    inv.setItem(11, new ItemStack(is1));
                    inv.setItem(12, new ItemStack(is2));
                    inv.setItem(37, new ItemStack(is3));
                    inv.setItem(38, new ItemStack(is3));
                    inv.setItem(39, new ItemStack(is3));
                    inv.setItem(40, new ItemStack(is3));
                    inv.setItem(41, new ItemStack(is3));
                    inv.setItem(42, new ItemStack(is3));
                    inv.setItem(43, new ItemStack(is3));
                    inv.setItem(44, new ItemStack(is3));
                    inv.setItem(36, new ItemStack(is3));
                    p.openInventory(inv);
                    break;
                case 16:
                    p.closeInventory();
                    Inventory inv_sell = Bukkit.createInventory(null, 54, "주식 매각");
                    is = new ItemStack(Material.COAL);im = is.getItemMeta();im.setDisplayName("두부 운수");im.setLore(Arrays.asList("두부 운송의 주식을 매각합니다"));is.setItemMeta(im);
                    is1 = new ItemStack(Material.CARROT);im1 = is1.getItemMeta();im1.setDisplayName("땅콩 식품");im1.setLore(Arrays.asList("땅콩 식품의 주식을 매각합니다"));is1.setItemMeta(im1);
                    is2 = new ItemStack(Material.REDSTONE);im2 = is2.getItemMeta();im2.setDisplayName("백조 전자");im2.setLore(Arrays.asList("백조 전자의 주식을 매각합니다"));is2.setItemMeta(im2);
                    is3 = new ItemStack(Material.RED_STAINED_GLASS_PANE);im3 = is3.getItemMeta();im3.setDisplayName(" ");im3.setLore(Arrays.asList(" "));is3.setItemMeta(im3);
                    inv_sell.setItem(10, new ItemStack(is));
                    inv_sell.setItem(11, new ItemStack(is1));
                    inv_sell.setItem(12, new ItemStack(is2));
                    inv_sell.setItem(37, new ItemStack(is3));
                    inv_sell.setItem(38, new ItemStack(is3));
                    inv_sell.setItem(39, new ItemStack(is3));
                    inv_sell.setItem(40, new ItemStack(is3));
                    inv_sell.setItem(41, new ItemStack(is3));
                    inv_sell.setItem(42, new ItemStack(is3));
                    inv_sell.setItem(43, new ItemStack(is3));
                    inv_sell.setItem(44, new ItemStack(is3));
                    inv_sell.setItem(36, new ItemStack(is3));
                    p.openInventory(inv_sell);
                    break;
            }
        } else if (e.getView().getTitle().equals("주가 확인")) {
            e.setCancelled(true);
            switch (e.getSlot()) {
                case 49:
                    p.closeInventory();
            }
        }
    }
    @EventHandler
    public void PlayerInteracts(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (p.getItemInHand().getType().equals(Material.FEATHER) && e.getAction() == Action.RIGHT_CLICK_AIR) {
            p.performCommand("stock");
        }
    }
}
