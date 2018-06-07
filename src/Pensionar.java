public class Pensionar extends Person {

    private int pensie;

    public Pensionar(){};

    public Pensionar(int varsta, String nume, String telefon, int pensie) {
        super(varsta, nume, telefon);
        this.pensie = pensie;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + "Pensie: " + getPensie();
    }

    public int getPensie() {
        return pensie;
    }

    public void setPensie(int pensie) {
        this.pensie = pensie;
    }
}