package collection.ex;

import java.util.LinkedList;
import java.util.Queue;

public class Ex4 {
    public static void main(String[] args) {
        Queue<String> waitingLines = new LinkedList<>();
        waitingLines.offer("과제.hwp");
        waitingLines.offer("보고서.docx");
        waitingLines.offer("자료.pdf");

        System.out.println(waitingLines);

        System.out.println(waitingLines.poll() + "인쇄 중...");
        System.out.println(waitingLines.poll() + "인쇄 중...");
        System.out.println(waitingLines.poll() + "인쇄 중...");
    }
}
