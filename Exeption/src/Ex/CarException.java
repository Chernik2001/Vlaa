package Ex;

public class CarException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }
    public CarException(String message,int num){
        super(message);
        number=num;
    }
}
