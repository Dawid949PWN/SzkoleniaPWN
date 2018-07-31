package cwiczeniaj20;

public class cwiczeniazda {
        public static void main(String[] args) {

                System.out.println("Przykład zdan ćwiczenia: \n");

                String[] pierwszyslowo = {"Chciałbyś", "Chesz", "Wolisz", "Pragniesz"};
                String[] drugislowo = {"w kondycji", "w formie", "silny", "potęga"};
                String[] trzecieslowo = {"owocy", "słodyczy", "płatki"};

                int pierwszyLength = pierwszyslowo.length;
                int drugiLength = drugislowo.length;
                int trzecieLength = trzecieslowo.length;

                int random1 = (int) (Math.random() * pierwszyLength);
                int random2 = (int) (Math.random() * drugiLength);
                int random3 = (int) (Math.random() * trzecieLength);

                System.out.println(pierwszyslowo[random1] + " być " + drugislowo[random2] + " jedz " + trzecieslowo[random3]+":)");
                System.out.println("--------------------\n");
        }
}