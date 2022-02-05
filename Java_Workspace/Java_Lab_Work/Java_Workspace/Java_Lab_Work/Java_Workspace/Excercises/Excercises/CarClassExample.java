package Excercises;

public class CarClassExample {

    public static void main(String[] args) {
        
        Car myCar = new Car("Citroen", "DS3", 2022);

        System.out.println(myCar.manufacturer);
        System.out.println(myCar.model);
        System.out.println(myCar.year);

        myCar.start();
        myCar.accelarate();
        myCar.move();
        myCar.stop();
    }
    
}
