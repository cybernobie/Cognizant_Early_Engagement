package com.cts.rainbowjewellers.test;

import com.cts.rainbowjewellers.service.RainbowJewellersService;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

@RunWith(Parameterized.class) // For carrying out parameterized junit test
public class RainbowJewellersParameterizedTest {
    
    RainbowJewellersService service = new RainbowJewellersService();
    
    // Input value (argument) of calculategoldprice() which returns the 'actual' value
    private double gram; 
    private double expectedGoldPrice; // 'expected' value
    
    // Constructor which accepts the parameters passed from dataProvider() as arguments
    public RainbowJewellersParameterizedTest(double gram, double expectedGoldPrice){
        this.gram = gram;
        this.expectedGoldPrice = expectedGoldPrice;
    }
    
    @Parameters 
    public static Collection dataProvider() {
        return Arrays.asList(new Object[][] {
            {9.6, 48401.76},
            {56, 282343.6},
            {24.5, 123525.325},
            {0, 0},
            {-1, -5041.85}
        });
    }

    @Test
	public void testCalculateGoldPrice() {
	     //fill code here
	     assertEquals(expectedGoldPrice, service.calculategoldprice(gram), 0.0001);
	}

}
