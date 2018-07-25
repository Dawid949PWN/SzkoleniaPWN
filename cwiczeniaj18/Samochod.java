package cwiczeniaj18;

public class Samochod {
    public static void main(String[] args) {

        Samochod2 auto = new Samochod2();

        auto.setMarka("VOLVO");
        auto.setRocznik(2015);
        auto.setTyppaliwy("Benzyna");
        auto.setPaliwo(9);

        System.out.println("Dane techniczne samochod: ");
        System.out.println("-------------------------\n");

        if (auto.getMarka() + auto.getRocznik() + auto.getTyppaliwy() + auto.getPaliwo() == null){
            System.out.println("brak samochodu dane");
        } else {
            System.out.println("Marka samochodu: " + auto.getMarka() + "\n" + "Rocznik samochodu: " + auto.getRocznik());
            System.out.println("Typ paliwa: " + auto.getTyppaliwy() + "\n" + "Paliwo auta: " + auto.getPaliwo() + "l");
        }
    }
}