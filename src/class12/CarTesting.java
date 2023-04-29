package class12;

public class CarTesting {
    public static void main(String[] args) {
        Car car=new Car();
        car.name="Dodge";
        car.color="Silver";
        car.tire=4;
        car.model="Demon";
        car.isElectronic=false;

        car.run();
        car.stop();
        car.reverse();
    }
}
