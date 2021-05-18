import java.util.ArrayList;

public class ProductDAO {
	ArrayList<Product> productlist = new ArrayList<Product>(); 
	
	public boolean addProduct(Product obj) {
	    boolean flag = false;
	    if(obj != null)
	         flag = productlist.add(obj);
	         
	    return flag;
	}
	
	public boolean deleteProduct(Product obj) {
	    boolean flag = false;
	    if(obj != null)
		    flag = productlist.remove(obj);
	
	    return flag;
	}
}
