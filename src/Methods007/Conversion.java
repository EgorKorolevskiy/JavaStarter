package Methods007;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);
        System.out.println("��� ������������ ��������� �����!");
        System.out.println("�������� ������ ��� �����������" + "\n" + "USD" + "\n" + "EUR" + "\n" + "GBP");
        String val = cns.nextLine();
        System.out.println("������� ���-�� ���. ������");
        double count = cns.nextDouble();
        System.out.println("������� ������� ����");
        double cur = cns.nextDouble();

        switch (val) {
            case "USD":
                usd (count, cur);
                break;
            case "EUR":
                eur (count, cur);
                break;
            case "GBP":
                gbp (count, cur);
                break;
            default:
                System.out.println("����������� ������!");
                break;
        }
    }

    public static void usd(double count, double cur) {
        System.out.println("���� �������: " + (count / cur));
    }
    public static void eur(double count, double cur) {
        System.out.println("���� ����: " + (count / cur));
    }
    public static void gbp(double count, double cur) {
        System.out.println("���� ����� ����������: " + (count / cur));
    }
}
