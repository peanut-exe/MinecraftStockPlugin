package Basic.Stocks.CheckMoney;

import Basic.Stocks.Manager.PPManager;

import static Basic.Stocks.Main.buymoney;

public class PPChecking {
    static double z;
    static String o;
    public static String buy;
    public static String i;
    public static double mon;
    public static void PPCheck() {
        mon = Double.parseDouble(PPManager.d);
        o = String.format("%.2f%n", buymoney * PPChecking.mon / 100.0);
        if (PPManager.stock_ture == true) {
            z = Double.parseDouble(o);
        } else {
            z = 0 - Double.parseDouble(o);
        }
        double j = 1500 * z;
        i = Double.toString(j);
        buy = i;
    }
}
