public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(210,1000, 120000);
        Car car = new Car(2015, "Camry","Toyota", engine);
        System.out.println(car.getEngine().getHorsePower());
        engine.setHorsePower(12);
        System.out.println(car.getEngine().getHorsePower()); // Must not be changed as car object is immutable
    }
}
