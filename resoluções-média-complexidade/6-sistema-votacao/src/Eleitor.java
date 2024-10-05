public class Eleitor {
    private String id;
    private boolean hasVoted;

    public Eleitor(String id) {
        this.id = id;
        this.hasVoted = false;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }
}
