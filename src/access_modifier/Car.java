package access_modifier;

public class Car {
    // 필드 : 데이터
    private int speed;      // 속도
    private boolean isStop = true; //

    // 생성자


    // 메서드
    // Getter method: 필드에 접근하여 데이터를 자겨온다.

    public void turnOn() {
        if (isStop) {
            isStop = false;
            System.out.println("시동을 겁니다.");
        } else {
            System.out.println("이미 시동이 걸려 있습니다.");
        }
    }

    public void tuneOff() {
        if (!isStop) {
            isStop = true;
            speed = 0;
            System.out.println("차량을 멈춥니다.");
        }
    }

    public int getSpeed() {
        if (isStop == false) {
            return speed;
        } else {
            return 0;
        }
    }

    // Setter method: 안전하게 필드의 값을 설정할 때 사용된다.
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 120) {
            this.speed = speed;
        } else {
            System.out.println("0~120km 사이만 가능합니다");
        }
    }

    public void speedUp() {        // 제약사항 : 120이상으로 올라가지 않을 것
        if (speed >=120) {
            this.speed = 120;
            System.out.println("더 이상 속도를 올릴 수 없습니다.");
        }
        if (isStop) {
            speed++;
        }
    }

    public void speedDown() {      // 제약사항 : 0이하로 내려가지 않을 것
        if (speed <= 0) {
            this.speed = 0;
            System.out.println("속도를 낮출 수 없습니다.");
        }
        if (isStop) {
            speed--;
        }
    }
}
