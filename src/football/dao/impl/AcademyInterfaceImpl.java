package football.dao.impl;

import football.dao.AcademyInterface;
import football.model.Academy;
import football.model.Database;

public class AcademyInterfaceImpl implements AcademyInterface {
    private Database database;
    public AcademyInterfaceImpl(Database database) {
        this.database = database;
    }
    @Override
    public void addAcademy(Academy academy) {

    }

    @Override
    public void updateAcademy(Academy academy) {

    }

    @Override
    public void deleteAcademy(Academy academy) {

    }

    @Override
    public Academy[] getAllAcademys() {
        return new Academy[0];
    }

    @Override
    public Academy getAcademyById(String name) {
        return null;
    }
}
