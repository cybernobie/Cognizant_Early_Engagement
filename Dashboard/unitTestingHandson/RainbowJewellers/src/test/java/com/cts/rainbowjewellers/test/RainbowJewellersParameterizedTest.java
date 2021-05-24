package com.cts.rainbowjewellers.test;

import com.cts.rainbowjewellers.service.RainbowJewellersService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {

    private double gram;
    private double expectedgoldprice;

    public RainbowJewellersParameterizedTest(double gram, double expectedgoldprice) {
        this.gram = gram;
        this.expectedgoldprice = expectedgoldprice;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {9.6, 48401.76},
                {56, 282343.6},
                {24.5, 123525.325},
                {0, 0.0},
                {-1, -5041.85}
        });
    }

    public double getGram() {
        return gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public double getExpectedgoldprice() {
        return expectedgoldprice;
    }

    public void setExpectedgoldprice(double expectedgoldprice) {
        this.expectedgoldprice = expectedgoldprice;
    }

    @Test
    public void testCalculateGoldPrice() {
        RainbowJewellersService service = new RainbowJewellersService();
        double price = service.calculategoldprice(gram);
        Assert.assertEquals(price, price, 0.0);
    }
}
