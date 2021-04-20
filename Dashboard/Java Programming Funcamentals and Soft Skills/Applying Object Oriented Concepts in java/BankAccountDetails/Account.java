public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    
    // public Account(int accountId,String accountType,int balance){
    //     this.accountId=accountId;
    //     this.accountType=accountType;
    //     this.balance=balance;
    // }
    public void setAccountId(int accountId){
        this.accountId=accountId;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getAccountId(){
        return this.accountId;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public int getBalance(){
        return this.balance;
    }
    public boolean withdraw(int bal){
        if(bal<=this.balance){
        this.balance-=bal;
       System.out.println("Balance amount after withdraw: "+this.balance);
        return true;
        }
        else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
}