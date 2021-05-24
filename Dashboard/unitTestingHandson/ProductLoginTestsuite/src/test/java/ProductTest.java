import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductTest {

    //Write the code for test methods

    Product p1 = new Product("asd", "asd", 0.0);
    Product p2 = new Product();
    Product p3 = new Product("asd", "asd", 1111110.0);

    ProductDAO productDAO = new ProductDAO();

    @Test
    public void deleteproduct() {
        assertFalse(productDAO.addProduct(null));
        assertTrue(productDAO.addProduct(p1));
        assertTrue(productDAO.addProduct(p2));

        p1.setPrice(15152);

        assertFalse(productDAO.deleteProduct(null));
        assertTrue(productDAO.deleteProduct(p1));
        assertTrue(productDAO.deleteProduct(p2));


    }

}