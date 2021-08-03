package ladder.domain;

import ladder.enums.Direction;

import java.util.Objects;

public class User {

    private Name name;
    private int position;

    public User(String name, int position) {
        this(new Name(name));
        this.position = position;
    }

    public User(String name) {
        this(new Name(name));
    }

    public User(Name name) {
        this.name = name;
    }

    public String name() {
        return this.name.name();
    }

    public int gameResult() {
        return this.position;
    }

    public void move(String direction){
        this.position += Direction.valueOf(direction).number();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name.name(), user.name());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.name());
    }
}
