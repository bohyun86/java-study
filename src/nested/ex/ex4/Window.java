package nested.ex.ex4;

public class Window {
    CheckBox box1 = new CheckBox();
    CheckBox box2 = new CheckBox();

    Window() {
        box1.setOnSelectListener(new CheckBox.OnSelectListener() {
            @Override
            public void onSelect() {
                System.out.println("배경을 변경합니다.");
            }
        });

        box2.setOnSelectListener(new CheckBox.OnSelectListener() {
            @Override
            public void onSelect() {
                System.out.println("배경을 삭제합니다.");
            }
        });



    }
}
