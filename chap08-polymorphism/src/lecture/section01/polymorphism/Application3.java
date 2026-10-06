package lecture.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        feed(new Tiger());
        feed(new Rabbit());
        getRandomAnimal().cry();
    }

    public static void feed(Animal animal) {
        animal.eat();
    }

    public static Animal getRandomAnimal(){
        int random = (int)(Math.random() * 2);
        return random == 0 ? new Rabbit() : new Tiger();
    }
}