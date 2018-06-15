import java.util.ArrayList;

public class Agenda {

    private ArrayList<Person> agenda = new ArrayList<Person>();

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
        for (Person p : agenda){
            if (p.getNume()!=null && p.getNume().contains(search)){
                agenda.remove(agenda.indexOf(p));
            }
        }
    }

    public void modifica(){
        String search = SkeletonJava.readStringConsole("Introduceti numele persoanei pe care doriti sa o modificati : ");
        for (Person p : agenda){
            if (p.getNume()!= null && p.getNume().contains(search)){

                int verifica = SkeletonJava.readIntConsole("Varsta: ");
                if (verifica>17 && verifica<60){
                    p = new Student(verifica, "nume", "telefon", 1);
                    p.setNume(SkeletonJava.readStringConsole("Nume : "));

                    p.setTelefon(SkeletonJava.readStringConsole("Telefon : "));

                    ((Student) p).setAnDeStudiu(SkeletonJava.readIntConsole("An de studiu : "));


                }
                else if (verifica>59 && verifica<121){
                    p = new Pensionar(verifica,"nume","telefon",1);

                    p.setNume(SkeletonJava.readStringConsole("Nume: "));

                    p.setTelefon(SkeletonJava.readStringConsole("Telefon: "));

                    ((Pensionar)p).setPensie(SkeletonJava.readIntConsole("Pensie: "));
                }
                else if (verifica<18 ||verifica>120)
                {
                    System.out.println("Varsta prea mica sau exagerat de mare");
                }

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
