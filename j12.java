import java.util.Locale;
import java.util.Scanner;

    public class j12 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj liczbe: ");

        float number = input.nextFloat();

        if (number > 0 && number < 1) {
            System.out.println("liczba Jest z przedziału <0, 1>");
        } else {
            System.out.println("liczba Nie jest z przedizału <0, 1>");
        }
    }
}
