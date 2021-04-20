
public class Train {
	
	private int trainNumber;
	private String trainName;
	private String source;
	private String destination;
	private int ac1;
	private int ac2;
	private int ac3;
	private int sl;
	private int ss;
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getAc1() {
		return ac1;
	}
	public void setAc1(int ac1) {
		this.ac1 = ac1;
	}
	public int getAc2() {
		return ac2;
	}
	public void setAc2(int ac2) {
		this.ac2 = ac2;
	}
	public int getAc3() {
		return ac3;
	}
	public void setAc3(int ac3) {
		this.ac3 = ac3;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public int getSs() {
		return ss;
	}
	public void setSs(int ss) {
		this.ss = ss;
	}
	public Train(int trainNumber, String trainName, String source, String destination, int ac1, int ac2, int ac3,
			int sl, int ss) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.ac1 = ac1;
		this.ac2 = ac2;
		this.ac3 = ac3;
		this.sl = sl;
		this.ss = ss;
	}
	
	
	
}
