package library.util.ex;


import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {

        Random random = new Random();
        int player1 = random.nextInt(1, 7);
        int player2 = random.nextInt(1, 7);
        System.out.println("플레이어 1: " + player1);
        System.out.println("플레이어 2: " + player2);
        if (player1 > player2) {
            System.out.println("플레이어 1이 이겼습니다!");
        } else {
            System.out.println("플레이어 2가 이겼습니다!");
        }


    }
}
