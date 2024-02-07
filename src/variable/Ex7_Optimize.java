package variable;

import java.util.Scanner;

public class Ex7_Optimize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] UserInfo = new String[3];
        String[] Prompts = {"이름", "주민등록번호", "전화번호"};

        for (int i = 0; i < 3; i++) {
            System.out.printf("%s : ", Prompts[i]);
            UserInfo[i] = scanner.nextLine();
        }

        for (int i = 0; i <3; i++) {
            System.out.println(Prompts[i] + " : " + UserInfo[i]);
        }
    }
}
