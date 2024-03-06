package library.lang.ex10;

public class Ex10 {
    public static void main(String[] args) {
        String str = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";
        String[] totalUser = str.split(";");


        System.out.println("전체 사용자 수: " + totalUser.length);

        System.out.println("사용자 정보:");
        for (String str2 : totalUser) {
            String[] userInfo = str2.split(",");
            System.out.printf("- 이름: %s, 나이: %s, 이메일: %s\n", userInfo[0], userInfo[1], userInfo[2]);
        }

        System.out.println("\"gmail.com\" 도메인 사용자:");
        for (String str2 : totalUser) {
            if (str2.contains("gmail.com")) {
                String[] userInfo = str2.split(",");
                System.out.printf("- %s\n", userInfo[0]);
            }
        }

        System.out.println("가장 나이가 많은 사용자:");
        int maxAge = 0;
        String maxAgeName = "";
        for (int k = 0; k < totalUser.length; k++) {
            String[] userInfo = totalUser[k].split(",");
            if (Integer.parseInt(userInfo[1]) > maxAge) {
                maxAge = Integer.parseInt(userInfo[1]);
                maxAgeName = userInfo[0];

            }
        }
        System.out.printf("- 이름: %s, 나이: %d\n", maxAgeName, maxAge);

        int nameCount = 0;
        for (String str2 : totalUser) {
            String[] userInfo = str2.split(",");
            if (userInfo[0].contains("김")) {
                nameCount++;
            }
        }
        System.out.printf("이름에 \"김\"이 포함된 수: " + nameCount);

    }
}

