package Methods007.Methods007_2;

public class Delivery {

    public static void main(String[] args) {
        System.out.println("�������� �������� - " + process(5));
    }

    // �������� ���������� � ���, ��� �� �� ����� ����� �������� �� �������� ����������
    // ����� ����� �� ������ � int. ����� ������������ ������
    public static int process(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else if (num < 0) {
            return 0;
        } else {
            // ��������
            return num * process(num - 1);
        }
    }
}
