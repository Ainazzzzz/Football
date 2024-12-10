package football.dao;

import football.model.Trener;

public interface TrenerInterface {
    void train();
    void getAllTreners();
    void deleteTrener(String name);
    void save(Trener trener);
    void getTrenerByName(String name);

}
