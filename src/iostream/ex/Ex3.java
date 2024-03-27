package iostream.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/iostream/ex/chat.log"));
             FileWriter writer = new FileWriter("src/iostream/ex/chatSummary.txt")) {

            String line;
            Map<String, Integer> numChat = new HashMap<>();

            while ((line = bufferedReader.readLine()) != null) {
                String username = line.substring(line.indexOf(']') + 2, line.lastIndexOf(':')).trim();
                numChat.put(username, numChat.getOrDefault(username, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : numChat.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                writer.write(key + ": " + value + "\n");
            }

        } catch (IOException e) {
            System.out.println("오류 발생" + e.getMessage());
        }
    }
}
