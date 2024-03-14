package collection.map.ex;

import java.util.HashMap;

public class Ex1 {
    static HashMap<String, Integer> scoreBoard = new HashMap<>();
    public static void main(String[] args) {

    putScores("Alice",85);
    putScores("Bob",92);
    putScores("Charlie",88);

    searchScore("Alice");

    printList();
    }

    private static void searchScore(String name) {
        System.out.println(scoreBoard.get(name));
    }

    private static void putScores(String name, int score) {
        scoreBoard.put(name, score);
    }

    private static void printList() {
        scoreBoard.forEach((key, value) ->
                System.out.printf("학생 \"%s\"의 점수는 %d점입니다.\n", key, value));
    }

}
