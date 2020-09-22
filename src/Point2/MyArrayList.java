package Point2;

import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        String[] arr = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(convert(arr));
    }

    public static <T> List<T> convert(T[] arr){
        List<T> list = Arrays.asList(arr);
        return list;
    }
}
