import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MovieTicket {

	private int ticketId;
	private String movieName;
	private int screenNumber;
	private int numberOfSeats;
	private String circle;
	private LocalDate showDate;

	public MovieTicket() {

	}

	public MovieTicket(int ticketId, String movieName, int screenNumber, int numberOfSeats, String circle,
			LocalDate showDate) {
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.screenNumber = screenNumber;
		this.numberOfSeats = numberOfSeats;
		this.circle = circle;
		this.showDate = showDate;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getScreenNumber() {
		return screenNumber;
	}

	public void setScreenNumber(int screenNumber) {
		this.screenNumber = screenNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public LocalDate getShowDate() {
		return showDate;
	}

	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}

	public boolean equals(Object o) {
		MovieTicket m = (MovieTicket) o;
		if (this.ticketId == m.ticketId && this.movieName.equals(m.movieName))
			return true;
		else
			return false;
	}
	
	public String toString(){
		
		String date = showDate.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
		return "Ticket ID "+ticketId+" Movie Name "+movieName+" Screen "+screenNumber+
				" No.of seats "+numberOfSeats+" Circle "+circle+" Show Date "+date;
	}

}
