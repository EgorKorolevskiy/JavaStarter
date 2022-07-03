package Arrays009;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) { // заполняем массив
            array[i] = i + 1;
        }

        for (int i = array.length - 1; i >= 0; i--) { // выводим значения
            System.out.println(array[i]);
        }
    }
}
