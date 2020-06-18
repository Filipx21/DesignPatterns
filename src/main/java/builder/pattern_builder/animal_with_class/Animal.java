package builder.pattern_builder.animal_with_class;

public class Animal {
    private String type;
    private int age;
    private String continent;
    private String located;
    private String color;
    private double height;

    private Animal(AnimalBuilder animalBuilder){
        this.type = animalBuilder.type;
        this.age = animalBuilder.age;
        this.continent = animalBuilder.continent;
        this.located = animalBuilder.located;
        this.color = animalBuilder.color;
        this.height = animalBuilder.height;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getContinent() {
        return continent;
    }

    public String getLocated() {
        return located;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", continent='" + continent + '\'' +
                ", located='" + located + '\'' +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }

    public static class AnimalBuilder {
        private String type;
        private int age;
        private String continent;
        private String located;
        private String color;
        private double height;

        public AnimalBuilder buildType(String type) {
            this.type = type;
            return this;
        }

        public AnimalBuilder buildAge(int age) {
            this.age = age;
            return this;
        }
        public AnimalBuilder buildContinent(String continent) {
            this.continent = continent;
            return this;
        }
        public AnimalBuilder buildLocated(String located) {
            this.located = located;
            return this;
        }
        public AnimalBuilder buildColor(String color) {
            this.color = color;
            return this;
        }
        public AnimalBuilder buildHeight(double height) {
            this.height = height;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }

}
