package lecture.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        Animal[] arrs = new Animal[5];
        arrs[0] = new Rabbit();
        arrs[1] = new Tiger();
        arrs[2] = new Rabbit();
        arrs[3] = new Tiger();
        arrs[4] = new Rabbit();

        for(Animal a : arrs) {
            a.cry();
        }
    }
}
