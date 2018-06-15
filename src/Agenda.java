import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {

    private List<Person> agenda = new ArrayList<Person>();

    private static Person person = new Person();


    public void print() {
        System.out.println("Aveti " + agenda.size() + " persone in agenda.");
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println("-----> " + (i + 1) + " <-----" + "\n" + agenda.get(i));
        }
    }
    public void cauta (){
        String search = SkeletonJava.readStringConsole("Introduceti numele persoanei pe care o cautati : ");
        for ( Person p : agenda ){
            if (p.getNume()!= null && p.getNume().contains(search)){
                System.out.println(p);
            }
        }
    }

    public void sterge (){
        String search = SkeletonJava.readStringConsole("Introduceti numele persoanei pe care doriti sa o stergeti : ");
        for (Iterator<Person> iterator = agenda.iterator(); iterator.hasNext(); ){
            person = iterator.next();
            if (person.getNume().contains(search)){
                iterator.remove();
                System.out.println("Persoana " + person.getNume() + " a fost stearsa");
            }

        }
        }


    public void modifica(){
        String search = SkeletonJava.readStringConsole("Introduceti numele persoanei pe care doriti sa o modificati : ");
        for (Iterator<Person> iterator = agenda.iterator(); iterator.hasNext();){
            person = iterator.next();
            if (person.getNume().contains(search)){
                iterator.remove();
                adaugare();
            }
        }
    }

    public void adaugare()
    {

        int verifica = SkeletonJava.readIntConsole("Varsta: ");

        if (verifica>17 && verifica<60)
        {
            person = new Student(verifica, "nume", "telefon", 1);

            person.setNume(SkeletonJava.readStringConsole("Nume: "));

            person.setTelefon(SkeletonJava.readStringConsole("Telefon: "));

            ((Student) person).setAnDeStudiu(SkeletonJava.readIntConsole("An de studiu: "));

            agenda.add(person);

        }
        else if (verifica>59 && verifica<121)
        {
            person = new Pensionar(verifica,"nume","telefon",1);

            person.setNume(SkeletonJava.readStringConsole("Nume: "));

            person.setTelefon(SkeletonJava.readStringConsole("Telefon: "));

            ((Pensionar)person).setPensie(SkeletonJava.readIntConsole("Pensie: "));

            agenda.add(person);


        }
        else if (verifica<18 ||verifica>120)
        {
            System.out.println("Varsta prea mica sau exagerat de mare");
        }

    }
}
