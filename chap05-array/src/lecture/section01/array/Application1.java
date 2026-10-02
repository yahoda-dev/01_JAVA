package lecture.section01.array;

public class Application1 {
    /*
    배열
    - 동일한 자료형의 묶음
    */
    public static void main(String[] args) {
        int[] arr = new int[5];
        // 📌 new: heap 영역에 공간을 만들 때 사용하는 키워드

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("arr: " + arr); // 메모리 주소가 출력됨. (단, 실제 메모리 주소는 아니고 읽기 좋게 바뀐 주소)
        for(int i = 0; i < 5; i++) {
            System.out.println("arr["+i+"] = " + arr[i]);
        }
    }
}