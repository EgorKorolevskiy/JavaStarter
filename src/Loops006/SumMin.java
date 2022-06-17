package Loops006;

public class SumMin {
    public static void main(String[] args) {
        int a = 1, b = 9, sum = 0;

        for (int i = a; i < b; i++){
            sum += i;
        }
        System.out.println("Сумма чисел расположенных между " + a + " " + b + " = " + sum);

        for (int i = a; i < b; i++){
            if (!((i % 2) == 0)){
                System.out.println(i + " ");
            }
        }
    }
}
