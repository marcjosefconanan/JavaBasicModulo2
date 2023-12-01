//Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.

//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.

//Nel main dichiarare un oggetto di tipo Auto.

public class Main {
    public static void main(String[] args) {
        Car cars = new Car(5.812, "ab123ab", "mustang");

        cars.setEngine(6.000);
        cars.setPlate("cd456cd");
        cars.setBrand("ferrari");

        System.out.println(cars);
        System.out.println("Plate: " + cars.getPlate());
        System.out.println(cars);
    }
}