package jdbc.dao;

public class MemberMain {
    public static void main(String[] args) {
        // 데이터베이스 접근 객체 생성
        MemberDao memberDao = new MemberDaoImpl();

        // 데이터 접근은 DAO에게 위임.

        MemberDto hong = memberDao.getMemberById("hong");
        System.out.println(hong.getId() + " " +  hong.getName()+ " " + hong.getEmail());
    }
}
