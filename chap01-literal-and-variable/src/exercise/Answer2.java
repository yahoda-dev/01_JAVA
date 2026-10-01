package exercise;

/*
 * 문제 2. 자기소개 정보 저장
 *
 * 다음 정보를 저장할 수 있는 적절한 자료형의 변수를 선언하고 값을 대입한다.
 * - 이름: 홍길동
 * - 나이: 20
 * - 키: 175.5
 * - 학점: A
 * - 재학 여부: true
 *
 * 실행 결과
 * 이름 : 홍길동
 * 나이 : 20세
 * 키 : 175.5cm
 * 학점 : A
 * 재학 여부 : true
 */

public class Answer2 {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        char grade;
        boolean isStudent;

        name = "홍길동";
        age = 20;
        height = 175.5;
        grade = 'A';
        isStudent = true;

        StringBuilder builder = new StringBuilder();
        builder.append("이름 : " + name + "\n")
                .append("나이 : " + age + "세\n")
                .append("키 : " + height + "cm\n")
                .append("학점 : " + grade +"\n")
                .append("재학 여부 : " + isStudent + "\n");
        System.out.println(builder);
    }
}
