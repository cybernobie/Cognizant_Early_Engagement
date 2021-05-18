import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginTest {
    	    	 
    //Write the code for adding and deleting Login data
    
    LoginDAO logindao = new LoginDAO();
    Login login = new Login("L", "Lawliet");
    
    // Adding login data
    @Test 
    public void testLoginDAO_addLogin_NullObject() {
        assertFalse(logindao.addLogin(null));
    }
    
    @Test 
    public void testLoginDAO_addLogin_NotNullObject() {
        assertTrue(logindao.addLogin(login));
    }
    
    // Deleting login data
    @Test 
    public void testLoginDAO_deleteLogin_NullObject() {
        assertFalse(logindao.deleteLogin(null));
    }
    
    @Test 
    public void testLoginDAO_deleteExistingLogin_NotNullObject() {
        logindao.addLogin(login);
        assertTrue(logindao.deleteLogin(login));
    }
    
    // Deleting non existing login data
    @Test 
    public void testLoginDAO_deleteNonExistingLogin_NotNullObject() {
        assertFalse(logindao.deleteLogin(login));
    }
    
    // Deleting non existing login data by altering its attributes
    @Test 
    public void testLoginDAO_deleteNonExistingLogin_AlterUsernameAndPassword() {
        login.setUserName("");
        login.setPassword("");
        assertFalse(logindao.deleteLogin(login));
    } 
    
}

