//Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Studente.

public class Main {
    public static void main(String[] args) {
        // Creo un oggetto di tipo Student
        Studente stud = new Studente("Marc Josef", "Conanan", 1234);

        System.out.println(stud);
        System.out.println("Name: " + stud.getName());
        System.out.println("Surname: " + stud.getSurname());
        System.out.println("ID: " + stud.getId());

        stud.setName("Luca");
        stud.setSurname("Savini");
        stud.setId(56789);
    }
}