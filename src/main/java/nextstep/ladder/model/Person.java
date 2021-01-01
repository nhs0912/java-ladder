package nextstep.ladder.model;

public class Person {
    private String name;
    private int position;

    public Person(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

}