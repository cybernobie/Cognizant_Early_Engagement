import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class EBBillTest {
    private EBBill ebBill;


    @Test
    public void test0() {
        ebBill = new EBBill(0);
        assertTrue(ebBill.calculateBillAmount() == 0);
    }

    @Test
    public void test50() {
        ebBill = new EBBill(50);
        assertTrue(ebBill.calculateBillAmount() == 130);
    }

    @Test
    public void test100() {
        ebBill = new EBBill(100);
        assertTrue(ebBill.calculateBillAmount() == 292.5);
    }

    @Test
    public void test200() {
        ebBill = new EBBill(200);
        assertTrue(ebBill.calculateBillAmount() == 818.5);
    }

    @Test
    public void test1000() {
        ebBill = new EBBill(1000);
        assertTrue(ebBill.calculateBillAmount() == 7018.5);
    }

    @Test
    public void test5000() {
        ebBill = new EBBill(5000);
        assertTrue(ebBill.calculateBillAmount() == 47018.5);
    }


}