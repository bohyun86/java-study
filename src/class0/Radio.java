package class0;

public class Radio {
    // 라디오와 관련된 데이터를 별도로 지정
    int volume;
    boolean isOn;

    // 라디오 켜기 메소드
    void turnOn() {
        isOn = true;
        System.out.println("라디오 전원을 켰습니다.");
    }


    // 음량 높이기 메서드
    void volumeUp() {
        volume++;       // volume + 1;
        System.out.println("라디오 음량 : " + volume);
    }

    // 음량 줄이기 메서드
    void volumDwon() {
        volume--;
        System.out.println("라디오 음량 : " + volume);
    }

    // 라디오 상태 확인 메서드
    void showstatus() {
        System.out.println("라디오 상태 확인");
        if (isOn == true) {
            System.out.println("라디오 전원 켜짐, 음량 : " + volume);
        } else {
            System.out.println("라디오 전원 꺼짐");
        }
    }


    // 라디오 끄기 메서드
    void turnOff() {
        isOn = false;
        System.out.println("라디오를 종료합니다.");
    }

}
