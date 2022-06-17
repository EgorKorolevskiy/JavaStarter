package Loops006;

import java.util.Scanner;

public class Fokus {
    public static void main(String[] args) {
        System.out.println("Кручу верчу, нулями запутать хочу. Угадай мою загадку, получишь по (E)-баллу.");
        System.out.println("У меня есть цвет, в темноте горит, на солнце не блестит. Днем заряжается, ночью появляется.");
        System.out.println("У тебя пять попыток на отгадку моей кибернетической загадки.");
        System.out.println("Для выхода из команды введи " + "- exit");

        final int popitka = 5; // кол-во попыток
        int attempt = 0; // счетчик попыток
        String color = "phosphorus"; // задуманный цвет

        Scanner cns = new Scanner(System.in);

        while (attempt < popitka) {
            attempt++;
            System.out.print("Попытка " + attempt + ":");
            String value = cns.next();

            if (attempt == popitka) {
                System.out.println("раз два три, попытки ушли, вы проиграли");
            }

            if (value.equals("exit")){
                System.out.println("Увидимся в матрице, досвидания!");
                break;
            }
            if (!value.equals(color)){
                continue;
            }
            System.out.println("Мои цифровые поздравления, вы угадали цвет с " + attempt + " попытки!");
            break;
        }
    }
}
