package quiz.quiz2.q1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Loard of the Rings","J.R.R",1954);
        book.displayInfo();

        ReferenceBook referenceBook = new ReferenceBook("Math Handbook","John Doe", 1999,"Mathematics");
        referenceBook.displayInfo();

    }
}
