
public class Person {


    private int varsta;
    private String nume;
    private String telefon;

    public Person(){}

    public Person(int varsta, String nume, String telefon) {
        this.varsta = varsta;
        this.nume = nume;
        this.telefon = telefon;
    }


    @Override
    public String toString() {
        return "Nume: " + this.getNume() + "\n" + "Varsta: " + this.getVarsta() +"\n" + "Telefon: " + getTelefon();
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        if (varsta>0 && varsta<121){
        this.varsta = varsta;
        }
        else{
            System.out.println("Nu se poate");
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}







