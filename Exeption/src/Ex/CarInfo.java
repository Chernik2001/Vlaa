package Ex;

import java.util.Random;

public class CarInfo extends Car implements CarMethods {

    @Override
    public void carInfo() {
        System.out.println("Характеристика автомобиля "+getCarBrand()+getCarSpeed()+getCarPrice());
    }

    public CarInfo(){

    }

    public CarInfo(String carBrand, double carSpeed, double carPrice) {
        super(carBrand, carSpeed, carPrice);
    }

    @Override
    public void pushStart() throws CarException{
    Random random=new Random();
    int chek=random.nextInt(21);
    if(chek%2!=0)throw new CarException(getCarBrand()+"Вы заглохли ",chek);
        System.out.println(getCarBrand()+"Мы завелись");

    }
}
