public class Car {
    private int productionYear;
    private String model, mark;
    private Engine engine;

    public Car(int productionYear, String model, String mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine = new Engine(engine.getHorsePower(), engine.getWeight(), engine.getMileage());
    }

    public Engine getEngine() {
        return engine;
    }
}
