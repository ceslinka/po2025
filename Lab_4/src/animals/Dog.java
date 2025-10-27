package animals;

public class Dog extends Animal {
    public Dog(String name, int legs) {
        this.name = name;
        this.legs = 4;
    }

    public Dog() {}

    @Override
    public String getDescription() {
        return "";
    }
}
