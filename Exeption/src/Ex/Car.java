package Ex;

public abstract class Car implements CarMethods {
    private String carBrand;
    private double carSpeed;
    private double carPrice;

    public Car() {

    }

    public Car(String carBrand, double carSpeed, double carPrice) {
        this.carBrand = carBrand;
        this.carSpeed = carSpeed;
        this.carPrice = carPrice;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public double getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(double carSpeed) {
        this.carSpeed = carSpeed;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }
    public abstract void carInfo();
}
