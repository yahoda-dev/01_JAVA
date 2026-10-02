package lecture.section01.user_type;

import java.util.Arrays;

public class Member {
    // id, pwd, name, age, gender, hobby

    // 필드(= 인스턴스 변수 = 속성)
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
