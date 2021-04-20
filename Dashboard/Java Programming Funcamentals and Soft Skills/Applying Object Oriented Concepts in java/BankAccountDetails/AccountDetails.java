import java.util.*;
public class AccountDetails {
     static Scanner kb;
     public  Account getAccountDetails() {
         kb=new Scanner(System.in);
         System.out.println("Enter account id:");
        int id=kb.nextInt();
        System.out.println("Enter account type:");
        String type=kb.next();
        int bal;
        do{
            System.out.println("Enter balance:");
            bal=kb.nextInt();
            if(bal>0){
                break;
            }
            else{
                System.out.println("Balance should be positive");
            }
        }while(true);
        Account at=new Account();
        at.setAccountId(id);
        at.setAccountType(type);
        at.setBalance(bal);
        return at;
    }
    public int getWithdrawAmount() {
        int wbal;
        // Scanner kb=new Scanner(System.in);
        kb=new Scanner(System.in);
        do{
            System.out.println("Enter amount to be withdrawn:");
            wbal=kb.nextInt();
            if(wbal>0){
                break;
            }
            else{
                System.out.println("Amount should be positive");
            }
        }while(true);
        return wbal;
    }
    public static void main (String[] args) {
        AccountDetails at1=new AccountDetails();
        Account obj=at1.getAccountDetails();
        int c=at1.getWithdrawAmount();
        obj.withdraw(c);
        
    }
   
}