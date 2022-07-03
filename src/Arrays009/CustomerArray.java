package Arrays009;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);
        System.out.println("������� ����� �� -10 �� 20. ����� ����� �������� ���-�� ��������� �������. �������� ������� ����� ��������");
        int countArr = cns.nextInt();
        process(countArr);
    }
    public static void process (int countArr) {

        // ������� ������, �������� ��������� �� �����
        int[] arr = new int[countArr];

        // �������� �� -10 �� 20
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 20) - 10);
        }

        // ������� �������
        System.out.print("����� ����� �������: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // ����� ����� ���������
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        System.out.print("���� ����� ��������� �������: " + sumArr);
        System.out.println();

        // ����� ����������� �������� �������
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("���������� ������� �������: " + max);

        // ����� ����������� �������� �������
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("���������� ������� �������: " + min);

//         ������� ������������� ���� ��������� �������
        //������ �����
        int arg = 0;
        for (int i = 0; i < arr.length; i++) {
            arg += arr[i];
        }
        arg /= arr.length;
        System.out.println("������� ��������������1: " + arg);
        // ������ �����. ������ ����� �� �����, �.�. �� ��������� � ���������� max
        max /= arr.length;
        System.out.println("������� ��������������2: " + max);

        // ��� �������� �������� �������
        System.out.print("��� �������� �������� �������: ");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
