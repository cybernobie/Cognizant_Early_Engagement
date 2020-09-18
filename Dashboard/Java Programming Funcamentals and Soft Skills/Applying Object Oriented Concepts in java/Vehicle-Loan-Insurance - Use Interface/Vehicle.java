public class Vehicle implements Loan, Insurance {
    private String vehicleNumber;
    private String modelName;
    private String vehicleType;
    private double price;

    public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
        this.vehicleNumber = vehicleNumber;
        this.modelName = modelName;
        this.vehicleType = vehicleType;
        this.price = price;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double takeInsurance() {
        if (price <= 150000) {
            return 3500;
        } else if (price > 150000 && price <= 300000) {
            return 4000;
        } else if (price > 300000) {
            return 5000;
        }

        return 0;
    }

    @Override
    public double issueLoan() {
        if (vehicleType.startsWith("4")) {
            return price * 80.0 / 100.0;
        } else if (vehicleType.startsWith("3")) {
            return price * 75.0 / 100.0;
        } else if (vehicleType.startsWith("2")) {
            return price * 50.0 / 100.0;
        }

        return 0;
    }
}
