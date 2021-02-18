package Basic.Stocks.Manager;

import Basic.Stocks.CheckMoney.DBChecking;

import java.util.Random;

import static Basic.Stocks.Main.*;


public class DBManager {
    private static int stock1;
    public static Boolean stock_ture;
    public static void DB() {
        Random r = new Random();
        int Randomstock;
        Randomstock = (int) (Math.random() * 200 + 1);
        stock_ture = r.nextBoolean();
        if (1 <= Randomstock && Randomstock <= 60) {
            stock1 = 1;
        } else if (61 <= Randomstock && Randomstock <= 100) {
            stock1 = 2;
        } else if (101 <= Randomstock && Randomstock <= 130) {
            stock1 = 3;
        } else if (131 <= Randomstock && Randomstock <= 150) {
            stock1 = 4;
        } else if (151 <= Randomstock && Randomstock <= 160) {
            stock1 = 5;
        } else if (161 <= Randomstock && Randomstock <= 169) {
            stock1 = 6;
        } else if (170 <= Randomstock && Randomstock <= 178) {
            stock1 = 7;
        } else if (179 <= Randomstock && Randomstock <= 186) {
            stock1 = 8;
        } else if (187 <= Randomstock && Randomstock <= 194) {
            stock1 = 9;
        } else if (195 <= Randomstock && Randomstock <= 200) {
            stock1 = 10;
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
    public static String d;
    static String Boolean;
    public static void DBStock() {
        d = String.format("%.1f%%%n", (double) stock1 / buymoney * time);
        if (stock_ture == true) {
            Boolean = "↑";
        } else {
            Boolean = "↓";
        }
        stocks = Boolean + d;
    }
}
