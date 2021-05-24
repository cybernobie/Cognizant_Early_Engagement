import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {
    LoginDAO loginDAO = new LoginDAO();
    ;
    Login l1 = new Login("Mahesh", "pass");

    //Write the code for adding and deleting Login data
    Login l2 = new Login("Get Lost", "pas");

    @Test
    public void addlogin() {
        Login login = new Login("dummy", "password");
        assertTrue(loginDAO.addLogin(login));
    }

    @Test
    public void nulllogin() {
        Assert.assertTrue(loginDAO.loginlist.isEmpty());
    }

    @Test
    public void deletelogin() {
        Login login = new Login("dummy", "password");
        loginDAO.addLogin(login);
        assertTrue(loginDAO.loginlist.size() > 0);
        loginDAO.deleteLogin(login);
        assertEquals(0, loginDAO.loginlist.size());

    }

    @Test
    public void nonexistantdelete() {
        assertFalse(loginDAO.deleteLogin(new Login("asd", "asd")));

    }

    @Test
    public void methoddeleteLogin() {
        assertFalse(loginDAO.addLogin(null));
        assertTrue(loginDAO.addLogin(l1));

        l1.setUserName("Mah");
        l1.setPassword("lost");

        assertFalse(loginDAO.deleteLogin(null));
        assertTrue(loginDAO.deleteLogin(l1));
        //  assertFalse(loginDAO.deleteLogin(l2));
    }
}

