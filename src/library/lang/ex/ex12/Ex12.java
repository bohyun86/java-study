package library.lang.ex.ex12;

public class Ex12 {
    public static void main(String[] args) {
        String idNum1 = "991231-1234567";
        String idNum2 = "010203-4321765";

        checkNum(idNum1);
        checkNum(idNum2);
    }

    static void checkNum(String str) {
        char extNum = str.charAt(7);
        String yearPrefix = (extNum == '1' || extNum == '2') ? "19" : "20";
        String gender = (extNum == '1' || extNum == '3') ? "남성" : "여성";
        String birthDate = "%s%s년 %s월 %s일".formatted(yearPrefix, str.substring(0, 2), str.substring(2, 4), str.substring(4, 6));

        System.out.println("생년월일: " + birthDate);
        System.out.println("성별: " + gender);
    }
}




