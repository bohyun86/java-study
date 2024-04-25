package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex3 {
    // 데이터베이스 연결 정보
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("업데이트할 사용자 ID를 입력하세요: ");
        String userId = scanner.nextLine();

        System.out.print("새 사용자 이름을 입력하세요: ");
        String userName = scanner.nextLine();

        System.out.print("새 비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        System.out.print("새 나이를 입력하세요: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("새 이메일 주소를 입력하세요: ");
        String email = scanner.nextLine();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 데이터베이스 연결
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            // SQL 쿼리 (userId에 따라 업데이트)
            String sql = "UPDATE users SET userName = ?, password = ?, age = ?, email = ? WHERE userId = ?";
            pstmt = conn.prepareStatement(sql);

            // 값 설정
            pstmt.setString(1, userName);
            pstmt.setString(2, password);
            pstmt.setInt(3, age);
            pstmt.setString(4, email);
            pstmt.setString(5, userId);

            // 데이터 업데이트
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("데이터가 성공적으로 업데이트되었습니다.");
            } else {
                System.out.println("업데이트할 사용자 ID가 존재하지 않습니다.");
            }

        } catch (SQLException e) {
            System.err.println("오류가 발생했습니다: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.err.println("리소스 해제 오류: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

