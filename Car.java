public final class Car {
    private int productionYear;
    private String model, mark;
    private final Engine engine;

    public Car(int productionYear, String model, String mark, Engine engine) {
        this.productionYear = productionYear;
        this.model = model;
        this.mark = mark;
        this.engine = engine.copyOfInstance();
    }

    public Engine getEngine() {
        return engine;
    }
}
