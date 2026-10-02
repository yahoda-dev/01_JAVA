package lecture.section02.encapsulation.problem2;

public class Application2 {
    public static void main(String[] args) {
        Monster mob = new Monster();

        mob.name = "뚜치";
        mob.hp = 1;

        Monster mob2 = new Monster();

        mob2.name = "뚜치";
        mob2.hp = 1;

        Monster mob3 = new Monster();

        mob3.name = "뚜치";
        mob3.hp = 1;
        // 여러 객체를 만들었는데 `name` 필드를 `kind`로 변경되어야 하는 상황이 생기면??
        // `Monster` class만 수정하는 것이 아니라 `Application` class까지 수정해야 하는 사고가 발생함
        // 이때 getter, setter로 구현을 해뒀으면 메서드 이름과 인자 정도만 변경해줘도 됨. (수정을 최소화함)
    }
}
