import java.util.*;
public class UserInterface {
    public static CommissionInfo generateCommissionObtained (){
        return (t)->{
            double rdata=0;
            {
          if(t.getClassType().equalsIgnoreCase("SL") || t.getClassType().equalsIgnoreCase("2S")){
             return 60;
          }
          else if(t.getClassType().equalsIgnoreCase("1A") || t.getClassType().equalsIgnoreCase("2A") || t.getClassType().equalsIgnoreCase("3A")){
              return 100;
          }
          else {
              return 100;
          }
          
      }
     
      
        };
    }
    
   public static void main(String args[]) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int n=kb.nextInt();
        // ArrayList<Ticket> tobj=new ArrayList<>();
         Ticket obj[]=new Ticket[n];
        double dd=0;
        for(int i=0;i<n;i++){
            System.out.println("Details of Passenger "+(i+1)+":");
            System.out.println("Enter the pnr no:");
            long pnr=kb.nextLong();
            System.out.println("Enter passenger name:");
            String name=kb.next();
            System.out.println("Enter seat no:");
            int seatno=kb.nextInt();
            System.out.println("Enter class type:");
            String ctype=kb.next();
            System.out.println("Enter ticket fare:");
            double fare=kb.nextDouble();
            obj[i]=new Ticket(pnr,name,seatno,ctype,fare);
             dd+=generateCommissionObtained().calculateCommissionAmount(obj[i]);
        }
        // DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Commission Obtained");
        System.out.println("Commission obtained per each person: Rs."+String.format("%.2f", dd));
        
    
    }
    
}