package collection.ex;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        // 문제 1
        int[] numbers = {4, 3, 5, 1, 2};

        System.out.println(Arrays.toString(numbers));

        // 문제 2
        int[] sortedNumbers = {1, 2, 3, 4, 5};
        int target = Arrays.binarySearch(sortedNumbers, 3);
        System.out.println("int target = " + target);

        // 문제 3
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        boolean a = Arrays.equals(array1, array2);
        System.out.println(a);

        // 문제 4

        int[] original = {1, 2, 3, 4, 5};
        int start = 1;
        int end = 3;

        int[] ints = Arrays.copyOfRange(original, 1, 3);
        System.out.println(Arrays.toString(ints));

        // 문제 5
        String[] fruits = {"Apple", "Banana", "Cherry"};

        List<String> objects = Arrays.asList(fruits);
        System.out.println(objects);

    }
}
