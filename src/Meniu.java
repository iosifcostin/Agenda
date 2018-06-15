import java.util.ArrayList;
import java.util.List;

public class Meniu {

   private static Agenda agenda = new Agenda();

   static final int EXIT = 6;


    public static void main(String[] args)
    {
        meniu();
        int optiune = SkeletonJava.readIntConsole("Alege o optiune :  ");

        while(optiune!=EXIT)
        {
            if(optiune>EXIT)
                System.out.println("Optiune inexistenta");
            System.out.println("Ati ales:"+optiune);

            switch (optiune){
                case 1: afisare(); break;
                case 2 : cautare(); break;
                case 3: adaugare(); break;
                case 4: modificare(); break;
                case 5: stergere(); break;
                case 6: System.exit(0);

            }
            meniu();
            optiune = SkeletonJava.readIntConsole("optiunea dvs:");
            }




    }

    static void afisare(){
        agenda.print();
    }
    static void cautare (){
        agenda.cauta();
    }
    static void adaugare (){
        agenda.adaugare();
    }
    static void modificare (){
        agenda.modifica();
    }
    static void stergere (){
        agenda.sterge();
    }



    static void meniu() {
        System.out.println("1. Afisare");
        System.out.println("2. Cautare");
        System.out.println("3. Adaugare");
        System.out.println("4. Modificare");
        System.out.println("5. Stergere");
        System.out.println("6. Exit");

    }
}

