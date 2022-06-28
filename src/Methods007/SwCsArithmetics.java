package Methods007;

import java.util.Scanner;

public class SwCsArithmetics {



    public static void main(String[] args) {

        Scanner cns = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        int op1 = cns.nextInt();
        System.out.print("Введи вторео число: ");
        int op2 = cns.nextInt();
        System.out.print("Выбери знак: ");
        String sym = cns.next();

        switch (sym) {
            case "+":
                add (op1, op2);
                break;
            case "-":
                sub (op1, op2);
                break;
            case "*":
                mul (op1, op2);
                break;
            case "/":
                div (op1, op2);
                break;
            default:
                System.out.println("Неизвестная команда!");
        }
    }

    public static void add(int op1, int op2) {
        System.out.println(op1 + "+" + op2 + "=" + (op1 + op2));
    }
    public static void sub(int op1, int op2) {
        System.out.println(op1 + "-" + op2 + "=" + (op1 - op2));
    }
    public static void mul(int op1, int op2) {
        System.out.println(op1 + "*" + op2 + "=" + (op1 * op2));
    }
    public static void div(int op1, int op2) {
        if (op2 == 0) {
            System.out.println("На ноль делить нельзя!");
            return;
        }
        System.out.println(op1 + "/" + op2 + "=" + (op1 / op2));
    }
}
