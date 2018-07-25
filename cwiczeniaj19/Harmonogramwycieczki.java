package cwiczeniaj19;

public class Harmonogramwycieczki {

    private Object Miejscowosc;
    private int Ilosckm;
    private String Adresnoclegi;

    public Harmonogramwycieczki(Object miejscowosc, int ilosckm, String adresnoclegi) {
        Miejscowosc = miejscowosc;
        Ilosckm = ilosckm;
        Adresnoclegi = adresnoclegi;
    }

    public Harmonogramwycieczki() {
    }

    public Object getMiejscowosc() {
        return Miejscowosc;
    }

    public void setMiejscowosc(Object miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    public int getIlosckm() {
        return Ilosckm;
    }

    public void setIlosckm(int ilosckm) {
        Ilosckm = ilosckm;
    }

    public String getAdresnoclegi() {
        return Adresnoclegi;
    }

    public void setAdresnoclegi(String adresnoclegi) {
        Adresnoclegi = adresnoclegi;
    }

    @Override
    public String toString() {
        return "Harmonogramwycieczki{" +
                "Nazwa Miejscowosc=" + Miejscowosc +
                ", Ilosckm=" + Ilosckm + "Km" +
                ", Adresnoclegi='" + Adresnoclegi + '\'' +
                '}';
    }
}
