package collection.ex;

import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        Stack<String> urlList = new Stack<>();
        urlList.push("www.example.com");
        urlList.push("www.example.com/about");
        urlList.push("www.example.com/contact");

        System.out.println("현재 페이지: " + urlList.peek());
        System.out.println("이전 페이지로 돌아갑니다: " + urlList.pop());
    }
}
