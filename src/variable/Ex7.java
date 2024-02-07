package variable;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. 이름: ");
        String name = scanner.nextLine(); // 이름 입력 받기®

        System.out.print("2. 주민번호앞자리: ");
        String residentNumber = scanner.nextLine(); // 주민번호 앞자리 입력 받기

        System.out.print("3. 전화번호: ");
        String phoneNumber = scanner.nextLine(); // 전화번호 입력 받기

        System.out.println("이름: " + name);
        System.out.println("주민번호앞자리: " + residentNumber);
        System.out.println("전화번호: " + phoneNumber);
    }
}
