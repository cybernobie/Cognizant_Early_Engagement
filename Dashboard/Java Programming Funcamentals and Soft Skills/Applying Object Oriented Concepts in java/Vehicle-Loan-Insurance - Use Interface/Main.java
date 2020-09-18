public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("WB3535", "Hero Spender Plus", "2 wheeler", 80000);
        System.out.println(vehicle.issueLoan());
        System.out.println(vehicle.takeInsurance());
    }
}
