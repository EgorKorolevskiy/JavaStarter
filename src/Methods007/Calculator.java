package Methods007;

import java.util.Scanner;

public class Calculator {
    static int calculate (int var1, int var2, int var3) {
        return (var1 + var2 + var3) / 3;
    }


    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);

        System.out.println("Введите с клавы три числа: ");

        int var1 = cns.nextInt();
        int var2 = cns.nextInt();
        int var3 = cns.nextInt();

        System.out.print("Вы ввели: " + var1 + " " + var2 + " " + var3);
        System.out.println();
        int sum = calculate (var1, var2, var3);
        System.out.println("(" + var1 + "+" + var2 + "+" + var3 + "/3)" + "=" + sum);

    }
}
