package Arrays009;

public class UserArray {

    public static void main(String[] args) {
        int[] arr;

        arr = UserArray.incArr(new int[5], 2);
        for (int anArray: arr) {
            System.out.println(anArray);
        }
    }

    public static int[] incArr(int[] array, int value) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            arr[i] = value;
            continue;
        }
        return arr;
    }
}
