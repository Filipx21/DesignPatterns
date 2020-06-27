package factory.factory_exercise_zoo;

import lombok.Getter;

public class Elephant extends Animal {

    @Getter private AnimalType type;
    @Getter private String name;

    Elephant(int age, double size, String from, String name) {
        super(age, size, from);
        this.name = name;
        this.type = AnimalType.ELEPHANT;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", " + super.toString();
    }

}
