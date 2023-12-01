public class Car {
    private double engine;
    private String plate;
    private String model;
    private String brand;
    private double fuelEfficiency;
    public Car(double engine, String plate, String model, String brand) {
        this.engine = engine;
        this.plate = plate;
        this.model = model;
        this.brand = brand;
    }
    public String getModel() {return model;}
    public void setEngine(double engine) {this.engine = engine;}
    public String getPlate() {return plate;}
    public void setPlate(String plate) {this.plate = plate;}
    public Double getEngine() {return engine;}
    public void setModel(String model) {this.model = model;}
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public void calculateFuelEfficiency(double distanceTraveled, double fuelConsumed) {
        // Ho aggiunto una nuova funzione che calcola lefficenza del consumo della machina
        this.fuelEfficiency = distanceTraveled / fuelConsumed;
    }
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", plate='" + plate + '\'' +
                ", model='" + model + '\'' +
                ", brand= " + brand +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}

