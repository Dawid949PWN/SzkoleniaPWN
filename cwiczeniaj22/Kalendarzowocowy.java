package cwiczeniaj22;

import cwiczeniaj22.Owocy;
import java.util.ArrayList;
import java.util.List;

public class Kalendarzowocowy {

    List<Owocy> owocyList = new ArrayList();

    public void addOwocy(Owocy owocy) {
        owocyList.add(owocy);
    }
    public void sumaowocy() {
        for (Owocy owocy : owocyList) {
            System.out.println(owocy);
        }
    }

    public void addCenyowoców(int cena, Owocy owocy) {
        owocy.cena += cena;
    }

    public Owocy getOwocy(Owocy owocy) {
        Owocy wybieranyOwocy = null;
        for (Owocy owocy6 : owocyList) {
            if(owocy6 == owocy) {
                wybieranyOwocy = owocy6;
            }
        }
        return wybieranyOwocy;
    }

    public Owocy getAndRemoveOwocy(Owocy podaneOwocy) {
        int index = owocyList.indexOf(podaneOwocy);
        return owocyList.remove(index);
    }
}
