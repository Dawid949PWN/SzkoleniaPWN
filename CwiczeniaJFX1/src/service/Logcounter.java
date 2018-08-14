package service;

public class Logcounter {
    public static  int count = 3;

    public static void Logcount() {
        count --;
        if (count == 0) {
            System.exit(0);
        }
    }
}
