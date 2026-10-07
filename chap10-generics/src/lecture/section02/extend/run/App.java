package lecture.section02.extend.run;

import lecture.section02.extend.Animal;
import lecture.section02.extend.RabbitFarm;

public class App {
    public static void main(String[] args) {

        RabbitFarm<Animal> farm = new RabbitFarm<Animal>();
        // extends 키워드로 Generic을 제한하였기에 String type은 못 넘김
        // RabbitFarm<String> farm2 = new RabbitFarm<String>();

    }
}
