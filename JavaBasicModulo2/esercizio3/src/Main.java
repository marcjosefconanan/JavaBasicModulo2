    //Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
    //Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
    //Nel main dichiarare un oggetto di tipo Auto.
    //In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi

    public class Main {
        public static void main(String[] args) {
            Car car = new Car(5.812, "ab123ab", "shelby", "mustang");
            car.setEngine(6.000);
            car.setPlate("cd456cd");
            car.setModel("testa rossa");
            car.setBrand("Ferrari");

            double distanceTraveled = 100.0; //kl
            double fuelConsumed = 10.0; //l

            car.calculateFuelEfficiency(distanceTraveled, fuelConsumed);

            System.out.println(car);
            System.out.println("Model: " + car.getModel());
            System.out.println("Fuel Efficiency: " + car.getFuelEfficiency() + " km/l");
        }
    }