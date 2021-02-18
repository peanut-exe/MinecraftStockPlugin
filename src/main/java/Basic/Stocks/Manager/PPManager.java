package Basic.Stocks.Manager;

import static Basic.Stocks.Main.*;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PPManager {
    static int stock = 0;
    public static String FullStock;
    static Boolean stock_ture;
    public static void PP() {
        Random r = new Random();
        int Randomstock;
        Randomstock = (int) (Math.random() * 200 + 1);
        stock_ture = r.nextBoolean();
        if (1 <= Randomstock && Randomstock <= 60) {
            stock = 1;
        } else if (61 <= Randomstock && Randomstock <= 100) {
            stock = 2;
        } else if (101 <= Randomstock && Randomstock <= 130) {
            stock = 3;
        } else if (131 <= Randomstock && Randomstock <= 150) {
            stock = 4;
        } else if (151 <= Randomstock && Randomstock <= 160) {
            stock = 5;
        } else if (161 <= Randomstock && Randomstock <= 169) {
            stock = 6;
        } else if (170 <= Randomstock && Randomstock <= 178) {
            stock = 7;
        } else if (179 <= Randomstock && Randomstock <= 186) {
            stock = 8;
        } else if (187 <= Randomstock && Randomstock <= 194) {
            stock = 9;
        } else if (195 <= Randomstock && Randomstock <= 200) {
            stock = 10;
        }
        //투자한 주식의 모든 0자리 구하는 구문
        if (length == 0) {
            time = 1.0;
        } else if (length == 1) {
            time = 10.0;
        } else if (length == 2) {
            time = 100.0;
        } else if (length == 3) {
            time = 1000.0;
        } else if (length == 4) {
            time = 10000.0;
        } else if (length == 5) {
            time = 100000.0;
        } else if (length == 6) {
            time = 1000000.0;
        } else if (length == 7) {
            time = 10000000.0;
        } else if (length == 8) {
            time = 100000000.0;
        } else if (length == 9) {
            time = 1000000000.0;
        } else if (length == 10) {
            time = 10000000000.0;
        }
    }
    public static String stocks;
    static String d;
    static String Boolean;
    public static String buy;
    static String o;
    static String z;
    public static int mon;
    public static String i;
    public static void PPStock() {
        d = String.format("%.1f%%%n", (double) stock / (double) buymoney * time);
        mon = Integer.parseInt(d);
        o = String.format("%.1f%n", (double) buymoney * (double) mon / 100.0);
        if (stock_ture == true) {
            Boolean = "↑";
            z = o;
        } else {
            Boolean = "↓";
            z = "-" + o;
        }
        int j = 1500 * Integer.parseInt(DBManager.z);
        i = Integer.toString(j);
        buy = i;
        stocks = Boolean + d;
    }

}
