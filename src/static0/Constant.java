package static0;

public class Constant {
    // 상수 : 변하지 않고, 항상 일정한 값을 갖는 수
    // Java에서는 static final 키워드를 사용해서 클래스 레벨으 ㅣ상수를 선언
    // 대문자 표기하는 것이 일바적이고, 밑줄로 _ 단어를 구분

    public static final double PI = 3.14159;
    public static final double E = 2.71828;
    public static final double HOURS_A_DYA = 24;
    public static final double MINTUES_A_HOUR = 60;
    public static final double SECONDS_A_HOUR = 60;

    // 프로그램에서 설정하는 상수
    public static final long MAX_USER = 10000;

    // 프로그램 전반에서 사용하기 때문에 public 접근제어자를 주로 사용한다. -> 전역적으로 접근 가능
    // 값을 한 군데에서 모아서 관리할 수 있는 장점이 있음.
    // 프로그램 실행 중에는 상수를 변경할 수 없음



}
