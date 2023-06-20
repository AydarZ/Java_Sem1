package HomeWork_1;


// 2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
// если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
// элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

public class task_2 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int rows = 0; rows < 5; rows++) {
            for (int coloms = 0; coloms < 5; coloms++) {
                if (rows==coloms){
                    array[rows][coloms] = 1;
                }
                System.out.print(array[rows][coloms]);
            }
            System.out.println();
        }
    }
}