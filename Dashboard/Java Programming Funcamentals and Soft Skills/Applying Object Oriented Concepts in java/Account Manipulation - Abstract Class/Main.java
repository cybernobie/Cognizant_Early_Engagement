public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Ritam", "ritam@email.com");
        SavingsAccount savingsAccount = new SavingsAccount(1001, customer, 10000, 500);

        if (savingsAccount.withdraw(9000)) {
            System.out.println(savingsAccount.getBalance());
        }
    }
}
