package Logic005;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);

        System.out.print("Введите любое число. Внимание! Далее произойдет проверка начетность: ");

        int num = cns.nextInt();

        if (num % 2 == 0) {
            System.out.println("Вы ввели четное число " + num);
        } else {
            System.out.println("Вы ввели нечетное число " + num);
        }
    }
}
