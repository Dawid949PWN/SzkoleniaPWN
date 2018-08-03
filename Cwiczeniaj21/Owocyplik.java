package cwiczeniaj21;
import java.util.ArrayList;

public class Owocy {
    public static void main(String[] args) {

        String[] simpleArray = new  String[3];
        simpleArray[0] = "winogrono";
        simpleArray[1] = "cytryna";
        simpleArray[2] = "truskawka";
        int a = simpleArray.length;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);

        int b = list.size();

        System.out.println("Owocy: " + simpleArray[0] + " " + simpleArray[1] + " " + simpleArray[2]);
        System.out.println(list);
    }
}

