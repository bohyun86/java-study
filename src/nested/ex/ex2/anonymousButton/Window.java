package nested.ex.ex2.anonymousButton;

public class Window {
    Button button1 = new Button();

    Window() {
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼을 클릭합니다.");
            }
        });
    }
}
