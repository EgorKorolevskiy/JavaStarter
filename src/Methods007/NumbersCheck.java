package Methods007;

import java.util.Scanner;

public class NumbersCheck {

    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = cns.nextInt();

        NumbersCheck.checkAm(num);
        NumbersCheck.checkEasy(num);
        NumbersCheck.checkDiv(num);
    }
    public static void checkAm(int num) { // проверка на отрицательное число
        if (num > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static void checkEasy (int num) { // проверка на простое число
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Число не простое");
                return;
            }
        }
        System.out.println("Число простое");
    }
    public static void checkDiv(int num) {
        if ((num % 2 == 0) && (num % 5 == 0) && (num % 3 == 0) && (num % 6 == 0) && (num % 9 == 0)) {
            System.out.println("Число делится нацело");
        } else {
            System.out.println("Число не делится нацело");
        }
    }


}
