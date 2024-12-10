package football.model;

public class Team {
    private String name;
    private int score;
    private int points;
    private Player[] players;
    private Trener trener;

    public Team(String name, int score, int points, Player[] players, Trener trener) {
        this.name = name;
        this.score = score;
        this.points = points;
        this.players = players;
        this.trener = trener;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }
}
