package Methods007.Methods007_2;

import java.util.Scanner;

public class Bank {

    static void payment (int sum) {
        int debt = 100;
        int counter = 0;
        if (sum == debt) {
            System.out.println("���� �������� �������");
        } else if (sum > debt) {
            System.out.println("��������� ���������� " + (sum - debt));
        } else
        System.out.println("���� ���������� " + (debt - sum));
    }

    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);
        System.out.println("������� ����� ������� �� �������: ");
        int sum = cns.nextInt();
        payment(sum);

    }
}
