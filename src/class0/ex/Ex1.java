package class0.ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("리뷰를 작성할 영화 수를 입력 : ");
        int movieNumbers = scanner.nextInt();
        scanner.nextLine();
        MovieReview[] movies = new MovieReview[movieNumbers];

        for (int i = 0; i < movies.length; i++) {
            movies[i] = new MovieReview();
            System.out.print(i + 1 + "번째 영화 제목 : ");
            movies[i].title = scanner.nextLine();
            System.out.print(i + 1 + "번째 영화 리뷰 : ");
            movies[i].review = scanner.nextLine();
        }

        for (int j = 0; j < movies.length;j++) {
            System.out.println(j + 1 + "번째 영화");
            System.out.println("제목 : " + movies[j].title);
            System.out.println("리뷰 : " + movies[j].review);
            System.out.println("");
        }
    }
}
