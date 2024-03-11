package generic.ex;

public class Ex2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"hello", "world", "generic", "method"};

        int intIndex = findIndex(intArray, 3);
        System.out.println("intArray에서 3의 인덱스: " + intIndex);

        int stringIndex = findIndex(stringArray, "generic");
        System.out.println("stringArray에서 generic의 인덱스: " + stringIndex);
    }

    static <T, K> int findIndex(T[] array, K value) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }
}
