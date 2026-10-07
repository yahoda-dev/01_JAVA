package lecture.section02.extend.run;

import lecture.section02.extend.*;

public class App2 {
    public static void main(String[] args) {
        WildCardFarm wFarm = new WildCardFarm();



        // anyType(RabbitFarm<?> farm)이라 다 가능
        wFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wFarm.anyType(new RabbitFarm<>(new Bunny()));
        wFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

        // extendType(RabbitFarm<? extends Bunny> farm)
        wFarm.extendType(new RabbitFarm<>(new Rabbit())); // Bunny의 부모 클래스인 Rabbit은 인자로 넘길 수 없다.
        wFarm.extendType(new RabbitFarm<>(new Bunny()));
        wFarm.extendType(new RabbitFarm<>(new DrunkenBunny()));


        // superType(RabbitFarm<? super Bunny> farm)이라 Bunny와 Bunny의 부모 클래스만 가능
        wFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        wFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
        wFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));




    }
}
