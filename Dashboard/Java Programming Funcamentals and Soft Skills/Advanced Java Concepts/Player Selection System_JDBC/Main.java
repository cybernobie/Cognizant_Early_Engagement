import java.util.*;
import java.sql.*;
public class Main {
	public static void main(String[] args) {
	 try{
	 Scanner kb=new Scanner(System.in);
	 System.out.println("Enter the minimum height");
	 double minheight=kb.nextDouble();
	    System.out.println("Enter the maximum weight");
	    double maxweight=kb.nextDouble();
	    PlayerSelectionSystem  obj=new PlayerSelectionSystem ();
	    List<String> arr=obj.playersBasedOnHeightWeight(minheight,maxweight);
	    if(arr.size()==0){
	        System.out.println("No players are with minimum height of "+minheight+" and maximum weight of "+maxweight);
	    }
	    else{
	    for(String o:arr){
	        System.out.println(o);
	    }
	    }
	    
	 }
	 catch(Exception exz){
	     exz.printStackTrace();
	 }
	    
		

		
	}
}