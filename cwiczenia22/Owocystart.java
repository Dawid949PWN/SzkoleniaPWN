package cwiczeniaj22;

import cwiczeniaj22.Owocy;
import cwiczeniaj22.Kalendarzowocowy;

import static jdk.nashorn.internal.objects.Global.println;

public class Owocystart {
    public static void main(String[] args) {

        Owocy Pomarańcza = new Owocy("pomarańcza", "Kolumbia", 41,17);
        Owocy Kokos = new Owocy("Kokos", "Ecuador", 28, 14);
        Owocy Banan  = new Owocy("Banan", "Venezuela", 19, 26);
        Owocy Cytryna = new Owocy("Cytryna", "Argentina", 27,20);
        Owocy Kiwi= new Owocy("Kiwi", "Senegal", 28, 14);
        Owocy Marakuja  = new Owocy("Marakuja", "Brazylia", 19, 26);
		
		
        Kalendarzowocowy kalendarzowocowy = new Kalendarzowocowy();

        kalendarzowocowy.addOwocy(Pomarańcza);
        kalendarzowocowy.addOwocy(Kokos);
        kalendarzowocowy.addOwocy(Banan);
        kalendarzowocowy.addOwocy(Cytryna);
        kalendarzowocowy.addOwocy(Kiwi);
        kalendarzowocowy.addOwocy(Marakuja);
        kalendarzowocowy.sumaowocy();

        kalendarzowocowy.getOwocy(Pomarańcza);

        System.out.println(kalendarzowocowy.getOwocy(Pomarańcza));
        System.out.println(Kokos = kalendarzowocowy.getOwocy(Kokos));
        System.out.println(Banan = kalendarzowocowy.getOwocy(Banan));
        System.out.println(Kiwi = kalendarzowocowy.getOwocy(Cytryna));

        kalendarzowocowy.addCenyowoców(414, Pomarańcza);
        System.out.println(Pomarańcza);
        kalendarzowocowy.getAndRemoveOwocy(Pomarańcza);
        kalendarzowocowy.sumaowocy();
		

        System.out.println("-----------------------\n");
		
    }
}
