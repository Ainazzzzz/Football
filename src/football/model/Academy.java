package football.model;

public class Academy {
    private String name;
    private int experience;
    private Player[] players;
    private Trener[] treners;

    public Academy(String name, int experience, Player[] players, Trener[] treners) {
        this.name = name;
        this.experience = experience;
        this.players = players;
        this.treners = treners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Trener[] getTreners() {
        return treners;
    }

    public void setTreners(Trener[] treners) {
        this.treners = treners;
    }
}
