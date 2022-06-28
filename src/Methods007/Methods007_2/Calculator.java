package Methods007.Methods007_2;

public class Calculator {

    static void calcul(int a, int b, int c) {
        a /= 5;
        b /= 5;
        c /= 5;
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
//        int a = 5, b = 10, c = 246;
        calcul(5, 10, 246);
    }
}
