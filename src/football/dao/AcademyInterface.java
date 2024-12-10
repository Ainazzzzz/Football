package football.dao;

import football.model.Academy;

public interface AcademyInterface {
    void addAcademy(Academy academy);
    void updateAcademy(Academy academy);
    void deleteAcademy(Academy academy);
    Academy[] getAllAcademys();
    Academy getAcademyById(String name);
}
