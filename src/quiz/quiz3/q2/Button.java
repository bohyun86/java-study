package quiz.quiz3.q2;


public class Button {
    OnClickListener onClickListener;

    public Button(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void click() {
        onClickListener.onClick();
    }
}
