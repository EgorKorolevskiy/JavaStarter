package Arrays009;

public class C06_TwoDimentionalArrayFill {
    // Массивы (двумерный массив).

    public static void main(String[] args) {
        int sizeI = 3;
        int sizeJ = 3;
        int[][] array = new int[sizeI][sizeJ];

        // Заполнение массива
        for (int i = 0; i < sizeI; i++) { // ппо строкам (i = 0, 1, 2)
            for (int j = 0; j < sizeJ; j++) { // по столбцам (j = 0, 1, 2)
                array[i][j] = i * j + 1;
            }
        }


        for (int i = 0; i < sizeI; i++) { // пробегает по строкам цикл
            for (int j = 0; j < sizeJ; j++) { // пробегает по столбцам
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
