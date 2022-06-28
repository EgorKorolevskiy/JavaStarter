package Methods007;

import java.util.Scanner;

public class Arithmetics {
    static int add (int num1, int num2) {
        return num1 + num2;
    }
    static int sub (int num1, int num2) {
        return num1 - num2;
    }
    static int mul (int num1, int num2) {
        return num1 * num2;
    }
    static int div (int num1, int num2) {
        return num1 / num2;
    }


    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);
        System.out.println("Введите два числа: ");

        int num1 = cns.nextInt();
        int num2 = cns.nextInt();

        System.out.println("Вы ввели два числа: " + num1 + ", " + num2);
        System.out.println();

        int sumAdd = add (num1, num2); // Операция сложения
        int sumSub = sub (num1, num2); // Операция вычитание
        int sumMul = mul (num1, num2); // Операция умножение
        int sumDiv = div (num1, num2); // Операция деления

        System.out.println("Результат сложения " + num1 + " + " + num2 + " = " + sumAdd);
        System.out.println("Результат вычитания " + num1 + " - " + num2 + " = " + sumSub);
        System.out.println("Результат умножения " + num1 + " * " + num2 + " = " + sumMul);
        System.out.println("Результат деления " + num1 + " / " + num2 + " = " + sumDiv);
    }
}
