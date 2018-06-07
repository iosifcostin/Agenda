import java.util.ArrayList;

public class Agenda {

    private ArrayList<Person> agenda = new ArrayList<Person>();


    public void adaugaInAgenda(Person person) {

        agenda.add(person);

    }
    public void print() {
        System.out.println("Aveti " + agenda.size() + " persone in agenda.");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println("-----> " + (i + 1) + " <-----" + "\n" + agenda.get(i));
        }
    }

}
