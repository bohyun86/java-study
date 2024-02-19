package class1.ex;

public class Ex4 {
    /*
    1. Board 클래스의 생성자가 다음과 같이 오버로딩 되어 있습니다.
      생성자마다 중복 코딩 된 부분이 있습니다.
      this()를 활용해서 중복 코드를 제거해보세요 .
    2. main 메서드에서 Board 객체를 생성하는 네 가지 방법을 모두 사용해보세요.
     */
    public static void main(String[] args) {
        Board board1 = new Board("책 팝니다.","한번도 안 펼쳤어요.");
        Board board2 = new Board("챕 삽니다.","반 값으로 책 삽니다.","도널드");
        Board board3 = new Board("대량구매 합니다.","안쓰는 책 다 삽니다.","도널드 형","20240102");
        Board board4 = new Board("대량판매 합니다.","새책보다 저렴하게 팝니다.","도널드 아빠","20240104",10);
    }
}


