package cwiczeniaj19;

import com.sun.javafx.print.PrintHelper;
import scratchbook.printHelper;

public class Tablicawycieczka {
    public static void main(String[] args) {

        Harmonogramwycieczki Gdansk = new Harmonogramwycieczki();

        Harmonogramwycieczki Warszawa = new Harmonogramwycieczki("Warszawa", 516, "ul. Czerniakowska 43/5b");
        Harmonogramwycieczki Wrocław = new Harmonogramwycieczki("Wrocław", 420, "ul Bonifacego 85/7a");
        Harmonogramwycieczki Zakopane = new Harmonogramwycieczki("Zakopane", 378, "ul Andersa 87.");
        Harmonogramwycieczki Krakowa = new Harmonogramwycieczki("Krakowa", 316, "ul Wołowska 32/8.");


        printHelper.printMsg((String) Gdansk.getMiejscowosc());

        System.out.println(Warszawa);
        printHelper.printMsg(Warszawa.toString());
        System.out.println("\t");

        System.out.println(Wrocław);
        printHelper.printMsg(Wrocław.toString());
        System.out.println("\t");

        System.out.println(Zakopane);
        printHelper.printMsg(Zakopane.toString());
        System.out.println("\t");

        System.out.println(Krakowa);
        printHelper.printMsg(Krakowa.toString());
        System.out.println("\n");

    }
}

