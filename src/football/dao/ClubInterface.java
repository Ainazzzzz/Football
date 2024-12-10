package football.dao;

import football.model.Club;

public interface ClubInterface {
    void addClub(Club club);
    void updateClub(Club club);
    void deleteClub(Club club);
    Club getClub(int clubId);
    Club[] getClubs();
}
