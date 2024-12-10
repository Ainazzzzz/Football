package football.model;

public class Trener {
    private String name;
    private int age;
    private Nationality nationality;
    private int experience;

    public Trener(String name, int age, Nationality nationality, int experience) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
