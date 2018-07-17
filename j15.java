import java.util.Locale;
import java.util.Scanner;

    public class j15 {
            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            input.useLocale(Locale.US);

                System.out.println("------------ ");

                System.out.println("Wpisz tekst: ");
                String userVar1 = input.nextLine();

                System.out.println("------------ \n");
                System.out.println("Wpisz następny tekst");

                String userVar2 = input.nextLine();
                System.out.println("------------ \n");

            int lengUserVar2 = userVar2.length();
            String letter = "";

            for (int  i = lengUserVar2; i > 0 ; i--) {
                if (i == (lengUserVar2 - 3)) {
                    letter = userVar2.valueOf(userVar2.charAt(i));
                    }
                }
            for (String word:userVar1.split(letter)) {
                System.out.println(word);
            }
        }
    }
