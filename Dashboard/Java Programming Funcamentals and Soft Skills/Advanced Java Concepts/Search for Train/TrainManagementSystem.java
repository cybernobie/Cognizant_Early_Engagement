
import java.util.ArrayList;
import java.sql.*;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		ArrayList<Train> ltrain=new ArrayList<>(); 
		Connection conn=null;
		try{
		    conn=DB.getConnection();
		    PreparedStatement ps=conn.prepareStatement("select * from train where source=? and destination=? and " +coachType+">0 order by train_number");
		    ps.setString(1,source);
		    ps.setString(2,destination);
		  //  ps.setString(3,coachType);
		    ResultSet rs=ps.executeQuery();
		       
		    while(rs.next()){
		        int tno=rs.getInt("train_number");
		        String tname=rs.getString("train_name");
		        String src=rs.getString("source");
		        String dest=rs.getString("destination");
		        int ac1=rs.getInt("ac1");
		        int ac2=rs.getInt("ac2");
		        int ac3=rs.getInt("ac3");
		        int ac4=rs.getInt("sleeper");
		        int ac5=rs.getInt("seater");
		       // if(coachType.equals("AC1") || coachType.equals("AC2") || coachType.equals("AC3") || coachType.equals("Sleeper") || coachType.equals("Seater")){
		            ltrain.add(new Train(tno,tname,src,dest,ac1,ac2,ac3,ac4,ac5));
		        
		        
		  //  }
		}
		}
		catch(Exception exz){
		    exz.printStackTrace();
		}
		finally{
		    try{
		        conn.close();
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
		}
		return ltrain;
		
	}

}
