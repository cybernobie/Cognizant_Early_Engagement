import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BookAMovie {

	List<MovieTicket> movieTicketList = new ArrayList<>();

	public List<MovieTicket> getMovieTicketList() {
		return movieTicketList;
	}

	public void setMovieTicketList(List<MovieTicket> movieTicketList) {
		this.movieTicketList = movieTicketList;
	}

	public boolean validateCircle(String circle) throws InvalidMovieTicketException {
		if (circle.equalsIgnoreCase("king") || circle.equalsIgnoreCase("queen"))
			return true;
		else
			throw new InvalidMovieTicketException("Invalid circle");
	}

	public boolean addMovieTicket(int ticketId, String movieName, int screenNumber, int numberOfSeats, String circle,
			LocalDate showDate) throws InvalidMovieTicketException {
		if (validateCircle(circle)) {
			movieTicketList.add(new MovieTicket(ticketId, movieName, screenNumber, numberOfSeats, circle, showDate));
			return true;
		} else
			throw new InvalidMovieTicketException("Invalid circle");
	}

	public MovieTicket viewMovieTicketById(int ticketId) throws InvalidMovieTicketException {
		for (MovieTicket ticketObj : movieTicketList) {
			if (ticketObj.getTicketId() == ticketId)
				return ticketObj;
		}
		throw new InvalidMovieTicketException("Invalid movie ticket id");
	}

	public List<MovieTicket> viewMovieTicketByScreen(int screenNumber) {
		List<MovieTicket> temp = new ArrayList<MovieTicket>();

		for (MovieTicket ticketObj : movieTicketList) {
			if (ticketObj.getScreenNumber() == screenNumber)
				temp.add(ticketObj);
		}
		return temp;
	}

	public Map<String, List<MovieTicket>> viewTicketsMovieWise() {

		Map<String, List<MovieTicket>> temp = new LinkedHashMap<String, List<MovieTicket>>();

		for (MovieTicket ticketObj : movieTicketList) {
			String movieName = ticketObj.getMovieName();
			if (!temp.containsKey(movieName))
				temp.put(movieName, new ArrayList<>());
			temp.get(movieName).add(ticketObj);
		}
		return temp;

	}

	public Map<Integer, Integer> viewScreenWiseTotalSeatsBooked(LocalDate fromDate, LocalDate toDate) {

		Map<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();

		for (MovieTicket ticketObj : movieTicketList) {

			if (ticketObj.getShowDate().compareTo(fromDate) >= 0 && ticketObj.getShowDate().compareTo(toDate) <= 0) {
				int screenNumber = ticketObj.getScreenNumber();
				if (!temp.containsKey(screenNumber))
					temp.put(screenNumber, 0);
				temp.put(screenNumber, temp.get(screenNumber) + ticketObj.getNumberOfSeats());
			}

		}
		return temp;

	}

}
