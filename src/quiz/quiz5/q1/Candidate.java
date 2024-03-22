package quiz.quiz5.q1;

public class Candidate {
    private String name;
    private int count;

    public Candidate(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void vow() {
        count++;
    }
}
