import org.junit.Assert;
import org.junit.Test;
import org.powermock.modules.junit4.PowerMockRunner;

public class CustomerTest {
    //Write the code for testing assertion using JUNIT

    Customer customer1 = new Customer("1234567899876541", null, null, null, 0, null);
    Customer customer2 = new Customer("9834567899876541", "Hari", "Hari", null, 0, null);
    Customer customer3 = new Customer("8974567899876541", "null", "super", null, 0, "null");


    public CustomerTest() throws Exception {
    }

    @Test
    public void testAadharcard() {

        Assert.assertFalse(Customer.isValidAadharNo(customer1.getAadharCardNo()));
        Assert.assertTrue(Customer.isValidAadharNo(customer2.getAadharCardNo()));
        Assert.assertTrue(Customer.isValidAadharNo(customer3.getAadharCardNo()));
    }

    @Test
    public void FirstandLastNameNotEqualsValidCase() {
        Assert.assertNotEquals(customer3.getFirstName(),customer3.getLastName());
    }

    @Test(expected = AssertionError.class)
    public void FirstandLastNameNotEqualsInValidCase() {
        Assert.assertNotEquals(customer2.getFirstName(),customer2.getLastName());
    }

    @Test
    public void emailNotNull() {
        Assert.assertNull(customer1.getEmailId());
        Assert.assertNotNull(customer3.getEmailId());
    }
}
