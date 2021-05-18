import java.util.*;

public class Main {
 public static void main(String[] args) {

  // fill your code here

  Scanner s = new Scanner(System.in);

  System.out.println("Enter the minimum height");
  double minHeight = s.nextDouble();

  System.out.println("Enter the maximum weight");
  double maxWeight = s.nextDouble();
  s.close();

  PlayerSelectionSystem pss = new PlayerSelectionSystem();

  List<String> playerList = pss.playersBasedOnHeightWeight(minHeight, maxWeight);

  if (playerList.isEmpty()) {
   System.out.printf("No players are with minimum height of %.1f and maximum weight of %.1f", minHeight,
     maxWeight);
   return;
  }

  for (String player : playerList) {
   System.out.println(player);
  }
 }
}