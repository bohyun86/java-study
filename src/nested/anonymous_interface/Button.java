package nested.anonymous_interface;

public class Button {
    // 중첩 인터페이스

    static interface OnclickListener {
        void onClick();
    }

    // 필드
    OnclickListener onclickListener;

    // 필드 설정자: 매개변수로 인터페이스 구현 객체를 입력받음


    public void setOnclickListener(OnclickListener onclickListener) {
        this.onclickListener = onclickListener;
    }

    void touch() {
        onclickListener.onClick();
    }
}
