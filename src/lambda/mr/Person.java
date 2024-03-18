package lambda.mr;

import java.util.function.BinaryOperator;

public class Person {
    public void action(BinaryOperator<Double> binaryOperator) {
        Double result = binaryOperator.apply(10.0, 4.0);
        System.out.println("result = " + result);
    }
}
