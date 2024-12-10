package football.model;

public class Club {
    private String clubName;
    private int tropheys;
    private Team[] teams;
    private String countryName;

    public Club(String clubName, int tropheys, Team[] teams, String countryName) {
        this.clubName = clubName;
        this.tropheys = tropheys;
        this.teams = teams;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getTropheys() {
        return tropheys;
    }

    public void setTropheys(int tropheys) {
        this.tropheys = tropheys;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }
}
