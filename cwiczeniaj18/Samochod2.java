package cwiczeniaj18;

public class Samochod2 {

    private String marka;
    private int rocznik;
    private String typpaliwy;
    private int paliwo;

    // Marka auta
    public void writeName() {
        System.out.println("Samochod marka " + this.marka);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public String getTyppaliwy() {
        return typpaliwy;
    }

    public void setTyppaliwy(String typpaliwy) {
        this.typpaliwy = typpaliwy;
    }

    public int getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(int paliwo) {
        this.paliwo = paliwo;
    }
}
