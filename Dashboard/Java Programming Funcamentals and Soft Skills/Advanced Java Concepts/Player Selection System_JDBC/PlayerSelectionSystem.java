import java.util.*;
import java.sql.*;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		Connection conn=null;
		List<String> arr=new ArrayList<>();
			try{
			    conn=DB.getConnection();
			    PreparedStatement ps=conn.prepareStatement("select playerName from player where height>=? and weight<=? order by playername");
			    ps.setDouble(1,minHeight);
			    ps.setDouble(2,maxWeight);
			    ResultSet rs=ps.executeQuery();
			        while(rs.next()){
			            arr.add(rs.getString("playerName"));
			        
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
		
		return arr;
	}
}
