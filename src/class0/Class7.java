package class0;

public class Class7 {
    public static void main(String[] args) {
        // 라디오와 관련된 데이터를
        Radio radio = new Radio(); // 라디오 객체 생성

        // 재사용이 가능한 기능들을 메소드로 추출하기
        turnOn(radio);
        volumeUp(radio);
        volumDwon(radio);
        showstatus(radio);
        turnOff(radio);

        // 모듈화
        // 코드 중복이 제거
        // 같은 로직이 필요하면 메서드를 호출하면 됨
        // 기능이 수정될 때, 메서드 내부만 변경하면 된다.
    }

    // 라디오 켜기 메소드
    static void turnOn(Radio radio) {
        radio.isOn = true;
        System.out.println("라디오 전원을 켰습니다.");
    }


    // 음량 높이기 메서드
    static void volumeUp(Radio radio) {
        radio.volume++;       // volume + 1;
        System.out.println("라디오 음량 : " + radio.volume);
    }

    // 음량 줄이기 메서드
    static void volumDwon(Radio radio) {
        radio.volume--;
        System.out.println("라디오 음량 : " + radio.volume);
    }

    // 라디오 상태 확인 메서드
    static void showstatus(Radio radio) {
        System.out.println("라디오 상태 확인");
        if (radio.isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량 : " + radio.volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }


    // 라디오 끄기 메서드
    static void turnOff(Radio radio) {
        radio.isOn = false;
        System.out.println("라디오를 종료합니다.");
    }
}
