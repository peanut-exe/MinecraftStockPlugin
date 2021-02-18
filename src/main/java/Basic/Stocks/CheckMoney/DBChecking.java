package Basic.Stocks.CheckMoney;

import Basic.Stocks.Manager.DBManager;

import static Basic.Stocks.Main.buymoney;

public class DBChecking {
    static double z;
    static String o;
    static String l;
    public static String buy;
    public static String i;
    public static double mon;
    public static void DBCheck() {
        l = DBManager.d.replace("%", "");
        mon = Double.parseDouble((DBManager.d));
        o = String.format("%.2f%n", buymoney * mon / 100.0);
        if (DBManager.stock_ture) {
            z = Double.parseDouble(o);
        } else {
            z = 0 - Double.parseDouble(o);
        }
        double j = 1500 * z;
        i = Double.toString(j);
        buy = i;
    }
}
