package lecture.section01.user_type;

public class Application1 {
    public static void main(String[] args) {
        Member member = new Member(); // = Heap 영역에 공간을 할당하고, 그 주소값을 반환한다. 반환된 주소 값은 스택 영역에 member라는 변수에 저장된다.


        // `soutv` 입력 후 탭 누르면 자동으로 member 객체가 잡힘
//        System.out.println("member.id = " + member.id);
//        System.out.println("member.name = " + member.name);
//        System.out.println("member.age = " + member.age);
        // 참조 자료형 `Member`의 필드에 접근하기 위해 참조 연산자 `.`을 작성

        member.id = "USER01";
        member.pwd = "pass01";
        member.name = "길동 홍";
        member.age = 22;
        member.gender = '남';
        member.hobby = new String[] {"축구", "야구"};

//        System.out.println("member.id = " + member.id);
//        System.out.println("member.name = " + member.name);
//        System.out.println("member.age = " + member.age);
//        System.out.println("member.pwd = " + member.pwd);
//        System.out.println("member.gender = " + member.gender);
//        System.out.println("member.hobby = " + member.hobby[1]);

        System.out.println(member);

        Member member2 = new Member();

        member2.id = "USER02";
        member2.pwd = "pass02";
        member2.name = "둘리";
        member2.age = 23;
        member2.gender = '남';
        member2.hobby = new String[] {"축구", "야구"};
        System.out.println(member2);
    }
}
