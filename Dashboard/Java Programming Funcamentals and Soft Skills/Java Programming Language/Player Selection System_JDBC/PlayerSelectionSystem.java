import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {

 public List<String> playersBasedOnHeightWeight(double minHeight, double maxWeight) {

  // Fill your code here

  List<String> playerList = new ArrayList<String>();

  try {
   Connection con = DB.getConnection();

   String query = "SELECT * FROM player WHERE height >= " + minHeight + " AND weight <= " + maxWeight
     + " ORDER BY playerName";

   Statement st = con.createStatement();
   ResultSet rs = st.executeQuery(query);

   while (rs.next()) {
    playerList.add(rs.getString("playerName"));
   }
            
            st.close();
   con.close();

  } catch (ClassNotFoundException | SQLException e) {
   e.printStackTrace();
  }

  return playerList;
 }
}