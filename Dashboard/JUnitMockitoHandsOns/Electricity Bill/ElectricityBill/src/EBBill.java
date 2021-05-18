
import java.util.Scanner;

public class EBBill {
	private int units;
	
	public EBBill(int units) {
		this.units = units;
	}
	
	public double calculateBillAmount() {
		double amount=0.0;
		
		if (units > 0) {
    		if (units <= 50)
    	        amount = units * 2.60;
    	  	else if (units <= 100)
    	  		amount = 130 + ((units - 50) * 3.25);
    	  	else if (units <= 200)
    	  		amount = 130 + 162.50 + ((units - 100 ) * 5.26);
    	  	else if (units <= 1000)
    		   	amount = 130 + 162.50 + 526 + ((units - 200 ) * 7.75); 
    	  	else if (units <= 5000) 
	  	      amount = 130 + 162.50 + 526 + 6200 + ((units - 1000) * 10);
    	  	else 
    	  	    amount = 0.0;
		}
		return amount;
	}
}
