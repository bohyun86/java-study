package collection.list.ex;

import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args) {
        // 후보 생성
        Candidate candidate1 = new Candidate("고길동");
        Candidate candidate2 = new Candidate("둘리");
        Candidate candidate3 = new Candidate("마이콜");
        Candidate candidate4 = new Candidate("희동이");

        // 후보 리스트에 넣기
        ArrayList<Candidate> arrayList = new ArrayList<>();
        arrayList.add(candidate1);
        arrayList.add(candidate2);
        arrayList.add(candidate3);
        arrayList.add(candidate4);

        // 투표 및 결과
        VotingSystem votingSystem = new VotingSystem(arrayList);
        votingSystem.startVoting();
        votingSystem.printResults();
    }
}
