package factory.factory_exercise_zoo;

import lombok.Getter;

public abstract class Animal {

    @Getter private int age;
    @Getter private double size;
    @Getter private String from;

    protected Animal(int age, double size, String from) {
        this.age = age;
        this.size = size;
        this.from = from;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", size=" + size +
                ", from='" + from + '\'' +
                '}';
    }

}
