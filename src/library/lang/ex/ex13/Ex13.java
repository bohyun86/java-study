package library.lang.ex.ex13;

public class Ex13 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        int[] price = {1000, 500, 2000};

        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("%-6s: %,5d\n", fruits[i], price[i]);
        }
    }
}
