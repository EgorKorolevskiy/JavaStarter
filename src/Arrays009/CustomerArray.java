package Arrays009;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);
        System.out.println("Введите число от -10 до 20. Число будет являться кол-ом элементов массива. Элементы массива будут случайны");
        int countArr = cns.nextInt();
        process(countArr);
    }
    public static void process (int countArr) {

        // создаем массив, передаем знаечение от юзера
        int[] arr = new int[countArr];

        // рандомим от -10 до 20
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 20) - 10);
        }

        // выводим массива
        System.out.print("Общая длина массива: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // общая сумма элементов
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        System.out.print("Обща сумма элементов массива: " + sumArr);
        System.out.println();

        // поиск наибольшего элемента массива
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Наибольший элемент массива: " + max);

        // поиск наименьшего элемента массива
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Наименьший элемент массива: " + min);

//         Среднее арифмтическое всех элементов массива
        //первый варик
        int arg = 0;
        for (int i = 0; i < arr.length; i++) {
            arg += arr[i];
        }
        arg /= arr.length;
        System.out.println("Среднее арифметическое1: " + arg);
        // второй варик. Второй лучше не юзать, т.к. мы привязаны к переменной max
        max /= arr.length;
        System.out.println("Среднее арифметическое2: " + max);

        // все нечетные значения массива
        System.out.print("Все нечетные значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
