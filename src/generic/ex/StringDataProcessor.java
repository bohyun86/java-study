package generic.ex;

public class StringDataProcessor implements DataProcessor<String> {

    @Override
    public String processData(String str) {
        return str.toUpperCase();
    }
}
