package util;

public class CurrencyConverter {

    public static double IOF = 1.06;

    public static double converter(double priceDollar, double buyDollar){
        return priceDollar * buyDollar * IOF;
    }

}
