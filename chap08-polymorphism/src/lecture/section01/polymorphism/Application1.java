package lecture.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();

        animal.cry();
        tiger.cry();
        rabbit.cry();

        System.out.println("==============================");

        Animal[] animals = new Animal[2];

        animals[0] = new Rabbit();
        animals[1] = new Tiger();

        animals[0].cry();
        animals[1].cry();
        System.out.println("==============================");
        ((Tiger)animals[1]).bite();
        ((Rabbit)animals[0]).jump();
        System.out.println("========instanceof========");
        System.out.println("Animals[1]이 Tiger Type인지 확인: " + (animals[1] instanceof  Tiger));
        System.out.println("Animals[1]이 Tiger Type인지 확인: " + (animals[1] instanceof  Rabbit));
        System.out.println("Animals[1]이 Tiger Type인지 확인: " + (animals[1] instanceof  Animal));
        System.out.println("Animals[1]이 Tiger Type인지 확인: " + (animals[1] instanceof  Object));
    }
}
