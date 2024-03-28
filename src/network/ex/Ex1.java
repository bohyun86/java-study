package network.ex;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com:8080/path/to/resource?name=John&age=30#section");

            System.out.println("프로토콜: " + url.getProtocol());
            System.out.println("호스트: " + url.getHost());
            System.out.println("포트: " + url.getPort());
            System.out.println("경로: " + url.getPath());


            String query = url.getQuery();
            if (query != null) {
                System.out.println("쿼리: ");
                String[] queryParams = query.split("&");
                for (String param : queryParams) {
                    System.out.println("  - " + param);
                }
            }

            String reference = url.getRef();
            if (reference != null) {
                System.out.println("참조: " + reference);
            } else {
                System.out.println("참조 없음");
            }

        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL 형식입니다.");
        }
    }
}
