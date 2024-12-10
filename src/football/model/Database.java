package football.model;

public class Database {
    private Academy[] academys;
    private Team[] teams;
    private Player[] players;
    private Trener[] treners;

    public Database(Academy[] academys, Team[] teams, Player[] players, Trener[] treners) {
        this.academys = academys;
        this.teams = teams;
        this.players = players;
        this.treners = treners;
    }

    public Academy[] getAcademys() {
        return academys;
    }

    public void setAcademys(Academy[] academys) {
        this.academys = academys;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
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
