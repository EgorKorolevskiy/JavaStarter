package Conditions004;
import java.util.Scanner;

public class TestCalcul1 {
    public static void main(String[] args) {
        int operand1 = 10;
        int operand2 = 0;
        int result = 0;

        System.out.print("Вас приветствует калькулятор 3000 " + "\n" + "Калькулятор ничего не умеет, кроме как: "
                + "\n" + "Складывать, вычитать, умножать, делить (+, -, *, /)" + "\n" + "  P.S. Только два числа: "
                + operand1 + " и " + operand2 + "\n" + "Введите арифметический знак: ");

        Scanner sc = new Scanner(System.in);
        String sign = sc.next();

        switch (sign) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;

            case "*":
                result = operand1 * operand2;
                break;

            case "/":
                if (operand2 == 0)
                {
                    System.out.println("На ноль делить нельзя");
                }
                result = operand1 / operand2;
                break;
            default: {
                System.out.println("Такое калькулятор еще не умеет");
            }
        }
        System.out.println(operand1 + " " + sign + " " + operand2 + " = " + result);
    }
}
