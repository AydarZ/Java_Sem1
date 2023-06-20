package HomeWork_1;

//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,5,7,2};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max=array[i];
            if (array[i]< min) min=array[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
