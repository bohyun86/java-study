package iostream.file.ex;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 정보 저장, 2: 정보 조회");
        int num = scanner.nextInt();

        switch (num) {
            case 1 -> saveInfo();
            case 2 -> searchInfo();
        }

        System.out.println();
    }

    static void saveInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("이메일: ");
        String email = scanner.nextLine();
        System.out.print("나이: ");
        String age = scanner.nextLine();

        try (FileWriter writer = new FileWriter("src/iostream/file/ex/" + name + ".user")) {
            writer.write("이름: " + name + "\n");
            writer.write("이메일: " + email + "\n");
            writer.write("나이: " + age + "\n");
        } catch (IOException e) {
            System.out.println("오류 발생" + e.getMessage());
        }
        System.out.println("정보 저장 완료.");
    }

    static void searchInfo() {
        File dir = new File("src/iostream/file/ex");
        FilenameFilter filenameFilter = ((dir1, name) -> name.endsWith(".user"));

        String[] files = dir.list(filenameFilter);

        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("조회할 파일이 없습니다.");
        }
    }
}
