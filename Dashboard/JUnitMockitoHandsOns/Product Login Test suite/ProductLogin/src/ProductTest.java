import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ProductTest {
    
    //Write the code for test methods
    
    ProductDAO productdao = new ProductDAO();
    Product product = new Product("1234", "PredatorLaptop", 70000.95);
    
    // Adding the product
    @Test 
    public void testProductDAO_addProduct_NullObject() {
        assertFalse(productdao.addProduct(null));
    }
    
    @Test 
    public void testProductDAO_addProduct_NotNullObject() {
        assertTrue(productdao.addProduct(product));
    }
    
    // Deleting the product
    @Test 
    public void testProductDAO_deleteProduct_NullObject() {
        assertFalse(productdao.deleteProduct(null));
    }
    
    @Test 
    public void testProductDAO_deleteExistingProduct_NotNullObject() {
        productdao.addProduct(product);
        assertTrue(productdao.deleteProduct(product));
    }
    
    // Deleting Non existing product
    @Test 
    public void testProductDAO_deleteNonExistingProduct_NotNullObject() {
        assertFalse(productdao.deleteProduct(product));
    }
    
    @Test 
    public void testProductDAO_deleteNonExistingProduct_ProductNonParameterisedConstructor() {
        assertFalse(productdao.deleteProduct(new Product()));
    }
    
    // Deleting Non existing product by altering its attributes
    @Test 
    public void testProductDAO_deleteNonExistingProduct_AlteringProductIdAndName() {
        product.setProductId("");
        product.setProductName("");
        assertFalse(productdao.deleteProduct(product));
    }
    
}
