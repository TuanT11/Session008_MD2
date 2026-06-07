import java.util.Scanner;

class CurrencyConverter{
    public static double rate = 25000.0d;
    public static void setRate(double r){
        rate = r;
    }
    public static double getRate(){
        return rate;
    }

    public static double formatUSD(double usd){
        return Double.parseDouble(String.format("%.1f", usd));
    }
    public static double toUSD(int vnd){
        return formatUSD((double)vnd / rate);
    }
}

public class Bai3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vnd = sc.nextInt();
        System.out.println(CurrencyConverter.toUSD(vnd));
    }
}
