package Arrays009;

public class ReversedArray {

    public static void main(String[] args) {
        int[] arr;
        int[] arr2;

        arr = ReversedArray.myReverse(new int[10]);
        arr2 = ReversedArray.subArray(new int[10], 2, 10);
        for (int anArr : arr) {
            System.out.println(anArr);
        }

        System.out.println();

        for (int anArr2 : arr2) {
            System.out.println(anArr2);
        }
    }
    // �������� � ����� myReverse �������� ���������� arr (������� ������ ������ �� 10 ��������)
    public static int[] myReverse(int[] array) {
        int[] arr = new int[array.length]; // � ���������� arr ����� ��������� �������� �������
        for (int i = 0; i < array.length; i++) { // ������� ������� � ��������� ������
            array[i] = i + 1;
        }

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { // ������ �������� � ������ ����� �������� � ���������� arr
            arr[j] = array[i];
        }
        return arr;
    }
    public static int[] subArray(int[] array, int index, int count) {
        int[] arr2 = new int[array.length]; // ���������� �������
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        boolean full = false;
        for (int i = index, j = 0; i < count; i++, j++) {
            if (i <= ((array.length - index) + 1) && !full) {
                arr2[j] = array[i];
            } else {
                if (!full) {
                    full = true;
                    i -= index;
                }
                arr2[j] = 1;
            }
        }
        return arr2;
    }
}
