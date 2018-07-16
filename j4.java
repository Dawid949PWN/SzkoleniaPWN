public class j4 {
    public static void main(String[] args) {

        String aText = "tekst zmienna a";
        String bText = "tekst zmienna b";

        String sumAAndB = aText + " " + bText;

        String dText = sumAAndB + "tekst zmienna d";

        System.out.println(sumAAndB.toUpperCase());
        System.out.println(sumAAndB.toLowerCase());

        System.out.println(dText.length());

        System.out.println("5 index " + sumAAndB.charAt(5));
        System.out.println("2 index " + sumAAndB.charAt(2));

        System.out.println(dText.charAt(dText.length() - 3));

        System.out.println(dText.substring(0, sumAAndB.length()));
        System.out.println(dText.substring(sumAAndB.length(), dText.length()));

        StringBuffer text = new StringBuffer();
        text.append(aText);
        text.append(bText);
        System.out.println(text);
    }
}
