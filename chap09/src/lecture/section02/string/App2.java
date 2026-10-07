package lecture.section02.string;

public class App2 {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");

        System.out.println("동등성(값) 비교: " + s1.equals(s2));
        System.out.println("동등성(값) 비교: " + s1.equals(s3));
        System.out.println("동일성(주소) 비교: " + (s1 == s2)); // = 같은 주소를 참조한다는 것을 의미
        System.out.println("동일성(주소) 비교: " + (s1 == s3));


    }
}
