package collection.list.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    List<Candidate> candidateList;

    public VotingSystem(ArrayList<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public void startVoting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                후보 모록:
                1. 고길동 
                2. 둘리 
                3. 마이콜 
                4. 희동이
                """);

        boolean isQuit = false;

        while (!isQuit) {
            System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력)");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1 -> candidateList.get(0).receiveVote();
                case 2 -> candidateList.get(1).receiveVote();
                case 3 -> candidateList.get(2).receiveVote();
                case 4 -> candidateList.get(3).receiveVote();
                case 0 -> isQuit = true;
            }
        }
    }

    public void printResults() {
        Iterator<Candidate> candidateIterator = candidateList.iterator();
        while (candidateIterator.hasNext()) {
            Candidate person = candidateIterator.next();
            System.out.println(person.toString());
        }
    }
}
