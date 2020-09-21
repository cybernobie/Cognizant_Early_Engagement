import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FlightManagementSystem {
    public boolean addFlight(Flight flight) {
        try {
            Connection connection = DB.getConnection();
            String query = "insert into flight (flightId, source, destination, noofseats, flightfare) values (?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, flight.getFlightId());
            preparedStatement.setString(2, flight.getSource());
            preparedStatement.setString(3, flight.getDestination());
            preparedStatement.setInt(4, flight.getNoOfSeats());
            preparedStatement.setDouble(5, flight.getFlightFare());

            preparedStatement.execute();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
