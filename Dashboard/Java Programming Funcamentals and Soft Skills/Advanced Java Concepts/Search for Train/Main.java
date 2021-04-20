
import java.util.*;
import java.sql.*;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		try{
		    System.out.println("Enter the source");
		    String src=kb.next();
		    System.out.println("Enter the destination");
		    String dest=kb.next();
		    System.out.println("Enter the coach type");
		    String coachType=kb.next();
		    if(coachType.equals("AC1") || coachType.equals("AC2") || coachType.equals("AC3") || coachType.equals("Sleeper") || coachType.equals("Seater")){
		            TrainManagementSystem  obj=new TrainManagementSystem();
		               ArrayList<Train> obj1=obj.viewTrain(coachType,src,dest);
		               if(obj1.size()==0){
		                   System.out.println("No trains found");
		               }
		               else{
		               for(Train o:obj1){
		                   System.out.println(o.getTrainNumber()+" "+o.getTrainName());
		               }
		               }
		        }
		        else{
		            System.out.println("Invalid Coach Type");
		        }
		}
		catch(Exception exz){
		    exz.printStackTrace();
		}

		
	}
}