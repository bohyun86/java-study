package network;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Network2 {
    public static void main(String[] args) {
        // 문자열로부터 URI 객체 생성

        try {
            URI uri = new URI("https://entertain.naver.com:443/read?oid=076&aid=0004127078#news");
            // URI 메타 정보 조회하기
            String scheme = uri.getScheme();
            System.out.println("scheme = " + scheme);
            String host = uri.getHost();
            System.out.println("host = " + host);
            String path = uri.getPath();
            System.out.println("path = " + path);
            String query = uri.getQuery();
            System.out.println("query = " + query);
            String fragment = uri.getFragment();
            System.out.println("fragment = " + fragment);
            int port = uri.getPort();
            System.out.println("port = " + port);


            // URI를 문자열 또는 URL객체로 변환
            String uriString = uri.toString();
            System.out.println("uriString = " + uriString);
            try {
                URL url = uri.toURL();
                System.out.println("url = " + url);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }





    }
}
