import java.util.Locale;
import java.util.Scanner;

    public class j14 {
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj liczbe: ");

            int UserInt = input.nextInt();

        for (int i = 0; i <= UserInt; i++) {
            if (i % 2 == 0) {
                continue;
                }
            System.out.println(i);
        }
    }
}

