package collection.list.ex;

public class Candidate {
    String name;
    int votes = 0;

    public Candidate(String name) {
        this.name = name;
    }

    public void receiveVote() {
        votes++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s: %d".formatted(this.name, this.votes);
    }
}
