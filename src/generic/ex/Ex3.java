package generic.ex;

public class Ex3 {
    public static void main(String[] args) {
        DataProcessor<String> stringProcessor = new StringDataProcessor();
        System.out.println(stringProcessor.processData("hello generics"));

        DataProcessor<Integer> numberProcessor = new NumberDataProcessor();
        System.out.println(numberProcessor.processData(100));
    }
}
