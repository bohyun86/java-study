package nested.ex.ex2.anonymousButton;

public class Button {

    static interface OnClickListener {
        void onClick();
    }

    // 필드
    OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    void touch() {
        onClickListener.onClick();
    }
}
