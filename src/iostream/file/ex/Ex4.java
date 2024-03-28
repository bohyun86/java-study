package iostream.file.ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        Path srcDirectory = Paths.get("src");
        AtomicLong totalFiles = new AtomicLong();
        AtomicLong totalLines = new AtomicLong();
        AtomicLong totalExFiles = new AtomicLong();

        try (Stream<Path> files = Files.walk(srcDirectory)) {
            files.forEach(path1 -> {
                if (Files.isRegularFile(path1) && path1.toString().endsWith(".java")) {
                    totalFiles.getAndIncrement();
                    try (Stream<String> line = Files.lines(path1)) {
                        totalLines.addAndGet((int) line.count());
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    if (path1.getFileName().toString().toUpperCase().startsWith("EX")) {
                        totalExFiles.getAndIncrement();
                    }
                }
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("자바 프로젝트 코드 분석 결과");
        System.out.println("- 총 자바 파일 개수: " + totalFiles + "개");
        System.out.println("- 총 코드 라인 수: " + totalLines + "개");
        System.out.println("- 실습문제 풀이 수: " + totalExFiles + "개");
    }
}
