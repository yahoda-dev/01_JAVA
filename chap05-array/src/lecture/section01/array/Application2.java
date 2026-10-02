package lecture.section01.array;

public class Application2 {
    public static void main(String[] args) {
        // 배열의 선언
        int iArr[];
        char cArr[];

        iArr = new int[10];
        cArr = new char[5];

        System.out.println(iArr.hashCode());
        System.out.println(iArr.length);
        // 📌 hashCode() 메서드와 length 변수 역시 heap 영역에 저장된다.
        System.out.println(cArr.hashCode());




    }
}
