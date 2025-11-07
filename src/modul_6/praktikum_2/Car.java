package modul_6.praktikum_2;

public class Car extends Vehicle {
    private int numberofDoors;

    public Car(String brand, int speed, int numberofDoors) {
        super(brand, speed); //memanggil constructor superclass
        this.numberofDoors = numberofDoors;
    }

    @Override
    public void start() {
        super.start(); // memanggil method start dari superclass
        System.out.println("Car engine is running smoothly");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); //memanggil method displayinfo dari superclass
        System.out.println("Number of doors: " + numberofDoors);
    }

    public void honk() {
        System.out.println("Beep beep!");
    }
}
