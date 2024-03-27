package iostream.serial;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serial2 {
    public static void main(String[] args) {
        String filePath = "src/iostream/serial/person.ser";

        // 역직렬화
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)))) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
