package lambda.function;

public class Button {
    // 필드
    private String text;
    private Runnable onClickListener;   // 람다식 함수

    public Button(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void onClick() {
        onClickListener.run();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOnClickListener(Runnable onClickListener) {
        this.onClickListener = onClickListener;
    }
}
