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

    public void modifica(int pozitie, Person person){
        agenda.set(pozitie,person);
        System.out.println("Contactul " + (pozitie+1) + "a fost modificat");
    }

    public void sterge(int pozitie){

        Person person = agenda.get(pozitie);
        agenda.remove(pozitie);
    }

    public Person gaseste(Person person){
        boolean exista = agenda.contains(person);
        int pozitie = agenda.indexOf(person);
        if (pozitie >= 0){
            return agenda.get(pozitie);
        }
        return null;

    }
}
