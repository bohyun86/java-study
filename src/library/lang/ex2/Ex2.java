package library.lang.ex2;

import java.util.Objects;

public class Ex2 {
    // Click 클래스는 x좌표, y좌표, 시간(timestamp: int타입)을 저장하는 클래스
    // 실제 Click 인스턴스가 x좌표, y좌표가 같으면 동등하다고 인정되게끔
    // equals메서드를 Overriding 해서 메인메서드로 확인해보세요.
    public static void main(String[] args) {
        Click click1 = new Click(50,60,1000);
        Click click2 = new Click(50,60,1000);
        Click click3 = null;
        Click click4 = new Click(40,60,1000);

        System.out.println(click1.equals(click2));
        System.out.println(click1.equals(click3));
        System.out.println(click1.equals(click4));

    }
}

class Click {
    int pointX;
    int pointY;
    int timestamp;

    public Click(int pointX, int pointY, int timestamp) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Click click = (Click) object;
        return pointX == click.pointX && pointY == click.pointY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }
}