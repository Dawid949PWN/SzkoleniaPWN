import java.util.Locale;
import java.util.Scanner;

public class j16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
            System.out.println("------------");
            System.out.println("Podaj tekst: ");
            System.out.println("------------");
            String userVar = input.nextLine();

            System.out.println("\n");

            System.out.println("------------");
            System.out.println("Wpisz liczbe, ile krokow: ");
            System.out.println("------------");
        int krok = input.nextInt();

        for (int i = 0; i < userVar.toCharArray().length; i++) {
            if (i % krok == 0) {

            System.out.println(userVar.toCharArray()[i]);
            System.out.println("--");
            }
        }
    }
}
