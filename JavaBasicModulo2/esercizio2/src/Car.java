public class Car {

    private double engine;
    private String plate;
    private String brand;
    public Car(double engine, String plate, String brand){
        this.engine = engine;
        this.plate = plate;
        this.brand = brand;
    }
    // Getter
    public double getEngine() {
        return engine;
    }
    // Setter
    public void setEngine(double engine) {
        this.engine = engine;
    }
    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return  "Car{" +
                "engine='" + engine + '\'' +
                ", plate='" + plate + '\'' +
                ", brand= " + brand +
                '}';
    }
}