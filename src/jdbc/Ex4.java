package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex4 {
    // 데이터베이스 연결 정보
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("삭제할 사용자 ID를 입력하세요: ");
        String userId = scanner.nextLine();

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // 데이터베이스 연결
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            // SQL 쿼리 (userId에 따라 사용자 삭제)
            String sql = "DELETE FROM users WHERE userId = ?";
            pstmt = conn.prepareStatement(sql);

            // 값 설정
            pstmt.setString(1, userId);

            // 데이터 삭제
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("사용자가 성공적으로 삭제되었습니다.");
            } else {
                System.out.println("삭제할 사용자 ID가 존재하지 않습니다.");
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
