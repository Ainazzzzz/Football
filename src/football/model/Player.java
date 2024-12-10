package football.model;

public class Player {
    private String name;
    private int age;
    private int number;
    private Nationality nationality;

    public Player(String name, int age, int number, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.nationality = nationality;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
}
