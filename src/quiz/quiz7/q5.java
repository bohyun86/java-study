package quiz.quiz7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicLong;

public class q5 {
    public static void main(String[] args) {
        String path = "src";

        AtomicLong amount = new AtomicLong();
        try {
            Files.walk(Paths.get(path)).filter(Files::isRegularFile)
                    .forEach(files-> {
                        try {
                            amount.addAndGet(Files.size(files));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(amount.get() + "Byte");
    }
}
