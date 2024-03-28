package iostream.file.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("디렉토리 경로를 입력하세요: ");
        String path = scanner.nextLine();

        Path path1 = Paths.get(path);

        try {
            long totalSize = Files.walk(path1).filter(Files::isRegularFile)
                    .mapToLong(p -> {
                        try {
                            return Files.size(p);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .sum();
            if (totalSize >= 1024) {
                System.out.println("총 크기: " + (totalSize / 1024) + "KB");
            } else {
                System.out.println("총 크기: " + totalSize + "Byte");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
