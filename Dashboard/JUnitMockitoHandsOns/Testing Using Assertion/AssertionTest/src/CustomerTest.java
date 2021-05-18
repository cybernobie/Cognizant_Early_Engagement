import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
	
    Customer customer = new Customer("234567891234", "Abhishek", "Sawant",
	                                 "Mumbai", (long) 3210, "abc@def.com");
	
	@Test 
	public void testCustomer_InvalidAadharCardNo(){
	    assertFalse(customer.isValidAadharNo("123456789123"));
	}
	
	@Test 
	public void testCustomer_ValidAadharCardNo(){
	    assertTrue(customer.isValidAadharNo("423456789123"));
	}
	
	@Test 
	public void testCustomer_FirstAndLastNameNotEqual(){
	    assertNotEquals(customer.getFirstName(), customer.getLastName());
	}
	
	@Test 
	public void testCustomer_EmailIdNotNull(){
	    assertNotNull(customer.getEmailId());
	}

}
