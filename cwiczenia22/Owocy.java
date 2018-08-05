package cwiczeniaj22;

public class Owocy {

String owocynazwa;
String pochodzyniaowoców;
int cena;
int waga;

    public Owocy(String owocynazwa, String pochodzyniaowoców, int cena, int waga) {
        this.owocynazwa = owocynazwa;
        this.pochodzyniaowoców = pochodzyniaowoców;
        this.cena = cena;
        this.waga = waga;
    }

    public Owocy() {
    }

    @Override
    public String toString() {
        return "Owocy{" +
                "owocynazwa='" + owocynazwa + '\'' +
                ", pochodzyniaowoców='" + pochodzyniaowoców + '\'' +
                ", cena=" + cena +
                ", waga=" + waga + "kg" +
                '}';
    }
}
