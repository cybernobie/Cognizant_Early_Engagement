package test;

import com.cts.bank.dao.AccountDAO;
import com.cts.bank.exception.AccountTransactionException;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//Provide necessary Annotation to class, attributes and test methods
@RunWith(MockitoJUnitRunner.class)
public class AccountDAOTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    //Provide necessary Annotation
    @Mock
    private DataSource ds;
    @InjectMocks
    private AccountDAO dao;
    @Mock
    private Connection con;
    @Mock
    private PreparedStatement ps;

    @Before
    public void setUp() throws Exception {
        //fill code
        Mockito.when(ds.getConnection()).thenReturn(con);
        Mockito.when(con.prepareStatement("UPDATE ACCOUNT SET balance = balance + ? WHERE accNo = ?")).thenReturn(ps);
        Mockito.when(ps.executeUpdate()).thenReturn(1);
    }

    @After
    public void tearDown() throws Exception {
        ps.close();
    }

    @Test(expected = AccountTransactionException.class)
    public void testInvalidAccount() throws AccountTransactionException {
        //fill code
        dao.deposit("", 125);

    }

    @Test(expected = AccountTransactionException.class)
    public void testNullAccount() throws AccountTransactionException {
        //fill code
        dao.deposit(null, 125);
    }

    @Test(expected = AccountTransactionException.class)
    public void testInvalidAmount() throws AccountTransactionException {
        //fill code
        dao.deposit("123", -12);
    }


    @Test
    public void testMethodCall() throws SQLException, AccountTransactionException {
        //fill code
        Assert.assertTrue(dao.deposit("15412", 25215));
        Mockito.verify(ds, Mockito.times(1)).getConnection();
        Mockito.verify(con, Mockito.times(1)).prepareStatement(Mockito.anyString());
        Mockito.verify(ps, Mockito.times(1)).executeUpdate();
    }
}
