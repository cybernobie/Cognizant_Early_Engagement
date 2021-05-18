import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitBasketUtility {
 private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

 public List<FruitBasket> getFruitBasketList() {
  return fruitBasketList;
 }

 public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
  this.fruitBasketList = fruitBasketList;
 }

 public void addToBasket(FruitBasket fbObj) {
  // Fill your code here
  fruitBasketList.add(fbObj);

 }

 public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
  
  int b[]=new int[1];
  // Fill your code here
  fruitBasketStream.forEach(a->
  {
   int wt=a.getWeightInKgs();
   int pr=a.getPricePerKg();
    b[0]=b[0]+pr*wt;
  });
  return b[0];


 
 }

}