package football.dao;

import football.model.Team;

public interface TeamInterface {
    void save(Team team);
    void update(Team team);
    void delete(Team team);
    void getAllTeams();
}
