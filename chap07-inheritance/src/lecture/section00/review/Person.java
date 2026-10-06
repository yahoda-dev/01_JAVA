package lecture.section00.review;


/*
☑️ tip: 자바에서는 파일명과 클래스명이 일치해야 한다(복습)
*/
public class Person {
    // Field
    // tip: 필드는 기본적으로 `private` 접근제어자로 지정한다
    private String name;
    private int age;


    // 같은 이름의 메서드를 매개변수만 다르게 작성하는 것을 오버로딩이라고 한다
    Person(){}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 %s이고 %d살 입니다.".formatted(this.name, this.age));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}