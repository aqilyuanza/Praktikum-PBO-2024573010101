package modul_6.praktikum_2;

public class OverrideTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);

        //memanggil overriden method
        car.start();
        car.displayInfo();
        car.honk();

        //demonstrasi polymorphism
        Vehicle vehicle = new Car("Honda", 200, 2);
        vehicle.start(); //memanggil method yang di override
        vehicle.displayInfo(); //memanggil method yang di override
    }
}
