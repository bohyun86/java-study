package network.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex2 {
    public static void main(String[] args) {
        String urlString = "https://en.dict.naver.com";


        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();

            try (InputStream is = connection.getInputStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

                String line;
                boolean foundTitle = false;

                while ((line = reader.readLine()) && !foundTitle) {
                    if (line.contains("<title>")) {
                        int start = line.indexOf("<title>")
                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
