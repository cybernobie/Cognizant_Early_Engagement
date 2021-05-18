import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class EBBillTest {
    //Write JUNIT Test Code
    
    EBBill bill = null;
    
    @Test
    public void testCalculateBillAmount_Input_0() {
        bill = new EBBill(0);
        assertEquals(0, bill.calculateBillAmount(), 0.001);
    }
    
    @Test
    public void testCalculateBillAmount_Input_50() {
        bill = new EBBill(50);
        assertEquals(130, bill.calculateBillAmount(), 0.001);
    }
    
    @Test
    public void testCalculateBillAmount_Input_100() {
        bill = new EBBill(100);
        assertEquals(292.5, bill.calculateBillAmount(), 0.001);
    }
    
    @Test
    public void testCalculateBillAmount_Input_200() {
        bill = new EBBill(200);
        assertEquals(818.5, bill.calculateBillAmount(), 0.001);
    }
    
    @Test
    public void testCalculateBillAmount_Input_1000() {
        bill = new EBBill(1000);
        assertEquals(7018.5, bill.calculateBillAmount(), 0.001);
    }
    
    @Test
    public void testCalculateBillAmount_Input_5000() {
        bill = new EBBill(5000);
        assertEquals(47018.5, bill.calculateBillAmount(), 0.001);
    }
 
}

