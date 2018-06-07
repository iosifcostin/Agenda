import java.util.ArrayList;
import java.util.List;

public class Meniu {

   private static Agenda agenda = new Agenda();
   private static Person person = new Person();
   static final int EXIT = 6;


    public static void main(String[] args)
    {
//        meniu();
//        int optiune = SkeletonJava.readIntConsole("Alege o optiune ");
//
//        while(optiune!=EXIT)
//        {
//            if(optiune>EXIT)
//                System.out.println("Optiune inexistenta");
//            System.out.println("Ati ales:"+optiune);
//
//            switch (optiune){
//                case 1: afisare(); break;
//                case 3: adaugare(); break;
//            }
//
//
//            }
//
//
//            optiune = SkeletonJava.readIntConsole("optiunea dvs:");



    }





    static void afisare(){
        agenda.print();

    }

    static void adaugare()
    {

        int verifica = SkeletonJava.readIntConsole("Varsta: ");

            if (verifica>17 && verifica<60)
            {
              person = new Student(verifica, "nume", "telefon", 1);

              person.setNume(SkeletonJava.readStringConsole("Nume: "));

              person.setTelefon(SkeletonJava.readStringConsole("Telefon: "));

              ((Student) person).setAnDeStudiu(SkeletonJava.readIntConsole("An de studiu: "));

               agenda.adaugaInAgenda(person);

            }
            else if (verifica>59 && verifica<121)
            {
                person = new Pensionar(verifica,"nume","telefon",1);

                person.setNume(SkeletonJava.readStringConsole("Nume: "));

                person.setTelefon(SkeletonJava.readStringConsole("Telefon: "));

                ((Pensionar)person).setPensie(SkeletonJava.readIntConsole("Pensie: "));

                agenda.adaugaInAgenda(person);

            }
            else if (verifica<18 ||verifica>120)
            {
            System.out.println("Varsta prea mica sau exagerat de mare");
            }

    }



    static void meniu() {
        System.out.println("1. Afiseaza");
        System.out.println("2. Cauta");
        System.out.println("3. Adauga");
        System.out.println("4. Modifica");
        System.out.println("5. Sterge");
        System.out.println("6. Exit");

    }
}

