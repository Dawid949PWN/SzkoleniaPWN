import java.util.Locale;
import java.util.Scanner;

    public class j11 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            input.useLocale(Locale.US);

            System.out.println("Podaj liczbe 1");
            float liczbaA = input.nextFloat();
            char operation     = input.next().charAt(0);
            System.out.println("Podaj liczbe 2");
            float liczbaB = input.nextFloat();

            switch (operation){
                case '+':
                    System.out.println(liczbaA + liczbaB);
                    break;
                case '-':
                    System.out.println(liczbaA + liczbaB);
                    break;
                case '*':
                    System.out.println(liczbaA * liczbaB);
                    break;
                case '/':
                    System.out.println(liczbaA / liczbaB);
                    break;
        }
    }
}
