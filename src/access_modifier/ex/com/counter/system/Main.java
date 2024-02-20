package access_modifier.ex.com.counter.system;

public class Main {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(2);
        counter.increment();
        counter.increment();
        counter.increment();
    }
}
