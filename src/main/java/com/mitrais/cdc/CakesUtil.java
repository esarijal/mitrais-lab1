package com.mitrais.cdc;

import com.mitrais.cdc.model.Cake;
import com.mitrais.cdc.model.ReadyMadeCake;

import java.util.Arrays;
import java.util.Comparator;

public class CakesUtil {

    public static double sumAllCakePrices(Cake[] cakes){
        return Arrays.stream(cakes)
                .mapToDouble(Cake::calcPrice).sum();
    }

    public static double sumReadyMadeCakePrices(Cake[] cakes){
        return Arrays.stream(cakes)
                .filter(cake -> cake instanceof ReadyMadeCake)
                .mapToDouble(Cake::calcPrice).sum();
    }

    public static Integer sumReadyMadeCakeQuantitySold(Cake[] cakes){
        return Arrays.stream(cakes)
                .filter(cake -> cake instanceof ReadyMadeCake)
                .map(cake -> ((ReadyMadeCake) cake).getQuantity())
                .reduce(Integer::sum).orElse(0);
    }

    public static Cake getHighestPriceCakeSold(Cake[] cakes){
        return Arrays.stream(cakes)
                .max(Comparator.comparing(Cake::calcPrice)).orElse(null);
    }
}
