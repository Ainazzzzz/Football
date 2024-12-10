package football.dao;

import football.model.Nationality;
import football.model.Player;

public interface PlayerInterface {
    void play();
    void getAllPlayers();
    void savePlayer(Player player);
    void deletePlayer(String name);
    void getPlayerByName(String name);
    void getPLayersByNationality(Nationality nationality);
}
