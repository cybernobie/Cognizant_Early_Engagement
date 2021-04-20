
public class Player {

	private int playerId;
	private String playerName;
	private double height;
	private double weight;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Player(int playerId, String playerName, double height, double weight) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.height = height;
		this.weight = weight;
	}
	
	
}
