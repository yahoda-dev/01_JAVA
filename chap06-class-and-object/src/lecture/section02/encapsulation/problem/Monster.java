package lecture.section02.encapsulation.problem;

public class Monster {

    /// monster's name
    private String name;
    /// monster's health per
    private int hp;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

   // setter
   // Monster 만든 인스턴스의 필드를 수정할 땐 setHp라는 메서드로만 변경을 허용한다.
    public void setHp(int hp) {
        if(hp > 0) {
            System.out.println("양수 값이 입력되어 몬스터의 체력을 변경합니다.");
            this.hp = hp;
        } else {
            System.out.println("음수 값이 입력되어 체력을 0으로 저장합니다.");
            this.hp = 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
