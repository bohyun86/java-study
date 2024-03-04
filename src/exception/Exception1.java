package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Exception1 {
    public static void main(String[] args) {
        // 모든 발생할 수 있는 문제 클래스의 조상
        Throwable throwable;

        // 2가지 종류의 문제 클래스가 있다.
        // 1. 에러
        Error error;
        // 2. 예외
        Exception exception;

        // 예외는 2가지 종류로 나뉜다.
        // 1. Checked Exception
        IOException ioException;    // 입출력 작업시 발생할 수 있는 예외
        FileNotFoundException fileNotFoundException;    //  파일을 못찾았을 때 발생
        SQLException sqlException;  // 데이타베이스 접근 문제 발생할 수 있는 예외
        ClassNotFoundException classNotFoundException;  // 클래스를 찾을 수 없을 때 발생

        // 2. Unchecked Exception
        RuntimeException runtimeException;  // 실행 시 발생하는 예외를 총괄
        NullPointerException nullPointerException;  // null에 참조 접근시 발생
        IndexOutOfBoundsException indexOutOfBoundsException;    // 유효하지 않은 인덱스에 접근하려고 할 때 발생
        ArithmeticException arithmeticException;    // 수학적 계산 불가능할 때
        IllegalArgumentException illegalArgumentException;  //  부적합한 인자를 전달했을 때
        ClassCastException classCastException;  // 잘못된 타입 캐스팅 할 때


    }
}
