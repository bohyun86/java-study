package quiz.quiz4.q2;

public class Main {
    public static void main(String[] args) {
        String example = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";
        String[] userInfos = example.split(";");

        System.out.println("전체 사용자 수: " + userInfos.length);
        System.out.println("사용자 정보: ");
        for (String user : userInfos) {
            String[] userinfo = user.split(",");
            System.out.printf("- 이름: %s, 나이: %s, 이메일: %s\n", userinfo[0], userinfo[1], userinfo[2]);
        }

        System.out.println("\"gmail.com\"도메인 사용자:");
        for (String user : userInfos) {
            String[] userinfo = user.split(",");
            if (userinfo[2].contains("gmail.com")) {
                System.out.println(userinfo[0]);
            }
        }

        System.out.println("가장 나이가 많은 사용자:");
        int maxAge = 0;
        String ordestName = "";
        for (int i = 0; i < userInfos.length; i++) {
            String[] userinfo = userInfos[i].split(",");
            if (Integer.parseInt(userinfo[1]) > maxAge) {
                maxAge = Integer.parseInt(userinfo[1]);
                ordestName = userinfo[0];
            }
        }
        System.out.printf("- 이름: %s, 나이: %s\n", ordestName, maxAge);


        int count = 0;
        for (String user : userInfos) {
            String[] userinfo = user.split(",");
            if (userinfo[0].contains("김")) {
                count++;
            }
        }
        System.out.printf("이름에 \"김\"이 포함된 사용자 수: %d\n",count);
    }
}
