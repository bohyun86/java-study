package nested.anonymous_interface;

public class Window {
    // 필드
    Button button1 = new Button();
    Button button2 = new Button();

    // 생성자에서 클릭리스너를 초기화
    Window() {
        button1.setOnclickListener(new Button.OnclickListener() {
            @Override
            public void onClick() {
                System.out.println("통화를 연결합니다.");
            }
        });

        button2.setOnclickListener(new Button.OnclickListener() {
            @Override
            public void onClick() {
                System.out.println("문자를 전송합니다.");
            }
        });
    }
}
