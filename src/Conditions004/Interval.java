package Conditions004;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        System.out.print("Введите число от 0 до 100: ");

        Scanner cns = new Scanner(System.in);
        int userIn = cns.nextInt();

        if (userIn >= 0 && userIn <= 14) {
            System.out.println("Вы попали в промежуток от 0 до 14");
        } else if (userIn >= 15 && userIn <= 35) {
            System.out.println("Вы попали в промежуток от 15 до 35");
        } else if (userIn >= 36 && userIn <= 50) {
            System.out.println("Вы попали в промежуток от 36 до 50");
        } else if (userIn >= 50 && userIn <= 100) {
            System.out.println("Вы попали в промежуток от 50 до 100");
        }
        else {
            System.out.println("Вы ввели знаение нарушающее диапазон");
        }
    }
}
