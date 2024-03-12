package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 주소록 관리
public class AddressBook {
    // Composition : 필드로 데이터(친구 클래스 리스트)를 가짐
    private List<Friend> friendList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // 삽입
    public void addFriend() {
        System.out.print("친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("친구 이메일을 입력하세요 : ");
        String email = scanner.nextLine();
        System.out.print("친구 전화번호를 입력하세요 : ");
        String phoneNumber = scanner.nextLine();

        friendList.add(new Friend(name, email, phoneNumber));
        System.out.println("주소록에 추가되었습니다.");
    }
    // 삭제
    public void deleteFriend() {
        System.out.print("삭제할 친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        Iterator<Friend> friendsIterator = friendList.iterator();
        while (friendsIterator.hasNext()) {
            Friend friend = friendsIterator.next();
            if (friend.getName().equals(name)) {
                friendsIterator.remove();
                System.out.println(name + "(이)가 삭제되었습니다.");
            }
        }
        System.out.println(name + "는(은) 존재하지 않습니다.");
    }
    // 조회
    public void searchFriend() {
        System.out.print("찾을 친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        Iterator<Friend> friendsIterator = friendList.iterator();
        while (friendsIterator.hasNext()) {
            Friend friend = friendsIterator.next();
            if (friend.getName().equals(name)) {
                System.out.println(friend.toString());
            }
        }
    }
    // 출력
    public void printAllFriends() {

        Iterator<Friend> friendsIterator = friendList.iterator();
        while (friendsIterator.hasNext()) {
            Friend friend = friendsIterator.next();
            System.out.println(friend.toString());
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        while(true) {
            // """ """ String Template 텍스트를 보이는 그대로 출력
            System.out.print("""
                    1. 친구 추가
                    2. 친구 삭제
                    3. 친구 검색
                    4. 주소록 출력
                    5. 종료
                    선택> 
                    """);
            int select = scanner.nextInt();
            scanner.nextLine();

            // 향상된 switch-case문
            switch (select) {
                case 1 -> addressBook.addFriend();
                case 2 -> addressBook.deleteFriend();
                case 3 -> addressBook.searchFriend();
                case 4 -> addressBook.printAllFriends();
                case 5 -> {
                    System.out.println("종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
