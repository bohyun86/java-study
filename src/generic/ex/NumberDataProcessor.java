package generic.ex;

public class NumberDataProcessor implements DataProcessor<Integer> {


    @Override
    public Integer processData(Integer num) {
        return num * 2;
    }
}
