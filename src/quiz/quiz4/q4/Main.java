package quiz.quiz4.q4;

public class Main {
    public static void main(String[] args) {
        DataProcessor<String> dataProcessorString = new StringDataProcessor();
        DataProcessor<Integer> dataProcessorInteger = new NumberDataProcessor();

        System.out.println(dataProcessorString.processData("HELLO GENERICS"));
        System.out.println(dataProcessorInteger.processData(200));
    }
}
