import java.util.Scanner;

public class j10 {
    public static void main(String[] args) {

        System.out.println("Podaj text: ");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Ile litery zawiera: " + text.length());

        int bezbialych = text.replaceAll("\\s+", " ").length();
        System.out.print("Znaki białe: ");
        System.out.println(text.length() - bezbialych);

    }
}
