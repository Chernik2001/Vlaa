package Ex;

public class Main {
    public static void main(String[] args) {
        Starter starter=new Starter();
        Car crOne=new CarInfo("Vlad ",120,550);
        Car carTwo=new CarInfo();
        carTwo.setCarBrand("BMW ");
        carTwo.setCarSpeed(142);
        carTwo.setCarPrice(210);
        crOne.carInfo();
        carTwo.carInfo();
        try{
            starter.checkStart(crOne);
            starter.checkStart(carTwo);
        }catch(CarException e){
            System.out.println(e.getMessage());
            System.out.println(e.getNumber());
        }
    }

}
