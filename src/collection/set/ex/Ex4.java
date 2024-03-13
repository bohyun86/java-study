package collection.set.ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Ex4 {
    public static void main(String[] args) {
        Set<String> userAFriends = new HashSet<>(Arrays.asList("B", "C", "D", "E"));
        Set<String> userBFriends = new HashSet<>(Arrays.asList("A", "C", "D", "F", "G"));


        userBFriends.removeAll(userAFriends);
        userBFriends.remove("A");
        System.out.println("A에게 추천하는 친구: " + userBFriends.
                toString().replace("[","").replace("]","").trim());

    }
}
