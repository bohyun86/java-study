package quiz.quiz5.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Candidate> candidateList = new ArrayList<>();
        candidateList.add(new Candidate("고길동",0));
        candidateList.add(new Candidate("둘리",0));
        candidateList.add(new Candidate("마이콜",0));
        candidateList.add(new Candidate("희동이",0));


        System.out.println("후보목록: ");
        for (int i = 0; i < candidateList.size(); i++) {
            System.out.printf("%d. %s\n",i+1,candidateList.get(i).getName());
        }

        boolean isEnd = false;
        while (!isEnd) {
            System.out.print("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): ");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> candidateList.get(0).vow();
                case 2 -> candidateList.get(1).vow();
                case 3 -> candidateList.get(2).vow();
                case 4 -> candidateList.get(3).vow();
                case 0 -> isEnd = true;
            }
        }

        System.out.println("투표 결과:");
        candidateList.forEach(
                n-> System.out.printf("%s: %d\n",n.getName(),n.getCount())
        );


    }
}
