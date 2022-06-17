package Loops006;

public class Rectangle {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        while (a < 10){
            a++;
            while (b < 15){
                b++;
                System.out.print("*");
            }
            b = 0;
            System.out.println();
        }

        System.out.println();

        int c = 0;
        int d = 0;
        do {
            c++;
            do {
                d++;
                System.out.print("#");
            } while (d < 15);
            d = 0;
            System.out.println();
        } while (c < 10);

        System.out.println();

        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 15; l++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
