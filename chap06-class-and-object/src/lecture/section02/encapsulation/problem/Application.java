package lecture.section02.encapsulation.problem;

public class Application {
    // 캡슐화
    // - 선언한 필드대로 공간은 생성되었지만 직접 접근하지 못 하고 public 메서드를 통해서만 이용할 수 있도록 제한하는 것
    public static void main(String[] args) {
        Monster monster1 = new Monster();

        // 필드에 직접 접근
//        monster1.name = "두치";
//        monster1.hp = 200;

        // Property를 통한 접근
        monster1.setName("뚜치");
        monster1.setHp(-200);

        System.out.println(monster1.getName());
        System.out.println(monster1.getHp());
    }
}