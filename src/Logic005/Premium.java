package Logic005;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);

        System.out.print("Здарова, это бухгалтерия. Пиши сколько работаешь, а я те премию расчитаю ок да: ");

        int userVisluga = cns.nextInt(); // сколько лет работает

        System.out.print("Ну и зпху свою тоже напиши, бомжара: ");

        int userZP = cns.nextInt(); // какая зп сейчас

        if (userVisluga >= 0 && userVisluga <= 4) {
            System.out.println("Братан, ток 10% накинем, чисто на проезд. Итого: " + (userZP/100) * 10 + " к зп.");
        } else if (userVisluga >= 5 && userVisluga <= 9) {
            System.out.println("Нормуль поднялся. Скок работал, сток получай - 15% прибавку. Итого: " + (userZP/100) * 15 + " к зп.");
        } else if (userVisluga >= 10 && userVisluga <= 14) {
            System.out.println("Кошерно брат, тебе 25% к зп. Итого: " + (userZP/100) * 25 + " к зп.");
        } else if (userVisluga >= 15 && userVisluga <= 19) {
            System.out.println("Даже я столько не работал, смотри не рипнись. Тебе + 35%. Итого: " + (userZP/100) * 35 + " к зп.");
        } else if (userVisluga >= 20 && userVisluga <= 24) {
            System.out.println("Тебе пора на пенсию, бро, подумай о внуках. Вот тебе + 45%. Итого: " + (userZP/100) * 45 + " к зп.");
        } else if (userVisluga >= 25) {
            System.out.println("Это ГГ бро. 50% тебе. Итого: " + (userZP/100) * 50 + " к зп.");
        }
        cns.close();
    }
}
