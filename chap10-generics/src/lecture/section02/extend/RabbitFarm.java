package lecture.section02.extend;

public class RabbitFarm <T extends Rabbit> {
    private T animal;

    public RabbitFarm() {
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }
}
