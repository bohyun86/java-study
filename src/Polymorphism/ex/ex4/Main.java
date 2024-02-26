package Polymorphism.ex.ex4;

public class Main {
    public static void main(String[] args) {
        Gingerbread gingerbread = new Gingerbread();
        StrawberryCookie strawberryCookie = new StrawberryCookie();
        ChocoCookie chocoCookie = new ChocoCookie();

        Cookie[] cookies = {gingerbread, strawberryCookie, chocoCookie};

        for (Cookie cookie:cookies) {
            cookie.run();
            cookie.jump();
            cookie.specialSkill();

        }

    }
}
