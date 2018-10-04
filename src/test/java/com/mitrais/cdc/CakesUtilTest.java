package com.mitrais.cdc;

import com.mitrais.cdc.model.Cake;
import com.mitrais.cdc.model.OrderCake;
import com.mitrais.cdc.model.ReadyMadeCake;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CakesUtilTest {

    private List<Cake> cakes;

    @Test
    public void allCakeUtilsTest(){
        Cake[] cakesArray = this.cakes.toArray(new Cake[0]);
        assertEquals("sumAllCakePrices",
                33,
                CakesUtil.sumAllCakePrices(cakesArray),0.001);
        assertEquals("getHighestPriceCakeSold",
                this.cakes.get(5),
                CakesUtil.getHighestPriceCakeSold(cakesArray));
        assertEquals("sumReadyMadeCakePrices",
                13,
                CakesUtil.sumReadyMadeCakePrices(cakesArray), 0.001);
        assertEquals(8, CakesUtil.sumReadyMadeCakeQuantitySold(cakesArray), 0);
    }

    @Before
    public void setUp() throws Exception {
        cakes = new ArrayList<>();
        cakes.add(new ReadyMadeCake("ReadyMadeCake 1" ,2, 3));
        cakes.add(new ReadyMadeCake("ReadyMadeCake 2" ,1, 4));
        cakes.add(new ReadyMadeCake("ReadyMadeCake 3" ,3, 1));

        cakes.add(new OrderCake("OrderCake 1", 2, 1));
        cakes.add(new OrderCake("OrderCake 1", 3, 2));
        cakes.add(new OrderCake("OrderCake 1", 4, 3));
    }
}