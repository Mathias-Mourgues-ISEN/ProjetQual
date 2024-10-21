package isen.library;

public class Person {
    private String name;
    private int years;

    public Person(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public Person() {
        this.name = "unknown";
        this.years = 22;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
