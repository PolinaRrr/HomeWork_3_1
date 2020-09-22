package Point1;

import java.util.*;

public class MyArray {

    public static void main(String[] args) {
        String[] myArr = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        swap(myArr, 2, 3);
        System.out.println(Arrays.toString(myArr));
    }

    //метод меняет 2 элемента массива местами
    private static void swap(String[] arr, int i, int j) {
        String newAr = arr[i];
        arr[i] = arr[j];
        arr[j] = newAr;
    }
}
