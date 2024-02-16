package reference;

public class Null3 {
    public static void main(String[] args) {
        DataWrapper dataWrapper = new DataWrapper();
        dataWrapper.data = new Data();  // 인스턴스 내부의 참조필드를 초기화 생성

        System.out.println(dataWrapper.count);  // int : 0
        System.out.println(dataWrapper.data);   // 참조타입(Data) : null

        // 컴파일러에서 작동하지 않지만, 런타임 단계에서 NPE 가 발생
        System.out.println(dataWrapper.data.value2);
        // System.out.println(null.value1);
    }
}
