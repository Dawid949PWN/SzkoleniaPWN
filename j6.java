import java.util.Random;

public class j6 {
        public static void main(String[] args) {

            Random random = new Random();

            int x = random.nextInt();
            int y = random.nextInt();

            System.out.println(x > y ? true : false);
            System.out.println( (x * 2) > y ? true : false);

            System.out.println((y < (x + 3)) && (y > (x - 2) ? true : false));

            System.out.println((x*y) % 2 == 0 ? true : false);
    }
}
