import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

    public class j13 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            input.useLocale(Locale.US);

            System.out.println("Podaj liczbe: ");
            int UserInt = input.nextInt();

        Random random = new Random();
            final int MAX = 5;
            final int MIN = 1;
        int numer1 = random.nextInt((MAX-MIN)+1)+MIN;

if (numer1 > UserInt) {
    System.out.println("Twoja liczba jest mniejsza od numer1: " + numer1);
    } else {
        if (numer1 < UserInt){
            System.out.println("Twoja liczba jest wieksza od numer1: " + numer1);
            } else {
                System.out.println("Twoja liczba Równa od numer1: " + numer1);
            }
        }
    }
}
