package nested.ex.ex4;

public class CheckBox {
    OnSelectListener listener;

    void setOnSelectListener(OnSelectListener listener) {
        this.listener = listener;
    }

    void select() {
        listener.onSelect();
    }

    static interface OnSelectListener {
        void onSelect();
    }

    public static void main(String[] args) {
        CheckBox box = new CheckBox();
        box.setOnSelectListener(new OnSelectListener() {
            @Override
            public void onSelect() {
                System.out.println("배경을 변경합니다.");
            }
        });

        box.select();
    }
}
