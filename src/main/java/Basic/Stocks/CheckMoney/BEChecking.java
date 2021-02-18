package Basic.Stocks.CheckMoney;

import Basic.Stocks.Manager.BEManager;
import Basic.Stocks.Manager.DBManager;
import Basic.Stocks.Manager.PPManager;

import java.util.zip.DeflaterOutputStream;

import static Basic.Stocks.Main.buymoney;

public class BEChecking {
    static double z;
    static String o;
    public static String i;
    public static String buy;
    public static double mon;
    public static void BECheck() {
        mon = Double.parseDouble(BEManager.d);
        o = String.format("%.2f%n", buymoney * mon / 100.0);
        if (BEManager.stock_ture == true) {
            z = Double.parseDouble(o);
        } else {
            z = 0 - Double.parseDouble(o);
        }
        double j = 1500 * z;
        i = Double.toString(j);
        buy = i;
    }
}
