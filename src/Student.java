import java.util.ArrayList;

public class Student  extends Person{

    private int anDeStudiu;

    public Student(){};

    public Student(int varsta, String nume, String telefon, int anDeStudiu) {
        super(varsta, nume, telefon);
        this.anDeStudiu = anDeStudiu;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "An de studiu: " + getAnDeStudiu();
    }

    public int getAnDeStudiu() {
        return anDeStudiu;
    }

    public void setAnDeStudiu(int anDeStudiu) {
        this.anDeStudiu = anDeStudiu;
    }
}