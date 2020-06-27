package factory.factory_exercise_zoo;

import lombok.Getter;

public class Tiger extends Animal {

    @Getter private AnimalType type;
    @Getter private String name;

    Tiger(int age, double size, String from, String name) {
        super(age, size, from);
        this.type = AnimalType.TIGER;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", " + super.toString();
    }

}
