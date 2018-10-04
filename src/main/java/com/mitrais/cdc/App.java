package com.mitrais.cdc;

import com.mitrais.cdc.model.Cake;
import com.mitrais.cdc.model.OrderCake;
import com.mitrais.cdc.model.ReadyMadeCake;

import java.util.Arrays;
import java.util.Comparator;

public class App
{
    public static void main(String[] args) {
        Cake[] cakes = new Cake[20];
        cakesInputHelper(cakes);

        double sumAllCakes = CakesUtil.sumAllCakePrices(cakes);

        double sumReadyMadeCakes = CakesUtil.sumReadyMadeCakePrices(cakes);

        Integer quantitySold = CakesUtil.sumReadyMadeCakeQuantitySold(cakes);

        Cake cake = CakesUtil.getHighestPriceCakeSold(cakes);

        System.out.println("Total price of all types of cakes : " + sumAllCakes);
        System.out.println("Total price of ready made cakes : " + sumReadyMadeCakes);
        System.out.println("Total quantity sold of ready made cakes : " + quantitySold);
        if(cake == null){
            System.out.println("No cake sold");
        }
        else {
            System.out.println("Cake that has been sold for the highest price: " + cake.toString());
        }
    }

    private static void cakesInputHelper(Cake[] cakes) {
        cakes[0] = new OrderCake("Ordered Cake 1", 2, 0.2);
        cakes[1] = new OrderCake("Ordered Cake 2", 2.3, 0.4);
        cakes[2] = new OrderCake("Ordered Cake 3", 3, 0.6);
        cakes[3] = new OrderCake("Ordered Cake 4", 3, 0.6);
        cakes[4] = new OrderCake("Ordered Cake 5", 4, 0.8);
        cakes[5] = new OrderCake("Ordered Cake 6", 5, 1);
        cakes[6] = new OrderCake("Ordered Cake 7", 4.2, 0.98);
        cakes[7] = new OrderCake("Ordered Cake 8", 3.2, 0.77);
        cakes[8] = new OrderCake("Ordered Cake 9", 1.2, 0.12);
        cakes[9] = new ReadyMadeCake("Ready Made Cake 1", 5.1, 2);
        cakes[10] = new ReadyMadeCake("Ready Made Cake 2", 6.3, 10);
        cakes[11] = new ReadyMadeCake("Ready Made Cake 3", 4.3, 3);
        cakes[12] = new ReadyMadeCake("Ready Made Cake 4", 3.2, 12);
        cakes[13] = new ReadyMadeCake("Ready Made Cake 5", 4.1, 1);
        cakes[14] = new ReadyMadeCake("Ready Made Cake 6", 8.3, 15);
        cakes[15] = new ReadyMadeCake("Ready Made Cake 7", 3.3, 4);
        cakes[16] = new ReadyMadeCake("Ready Made Cake 8", 2.9, 8);
        cakes[17] = new ReadyMadeCake("Ready Made Cake 9", 6.6, 30);
        cakes[18] = new ReadyMadeCake("Ready Made Cake 10", 7.2, 2);
        cakes[19] = new ReadyMadeCake("Ready Made Cake 11", 6.2, 1);
    }

}
