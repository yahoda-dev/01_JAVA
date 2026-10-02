package lecture.section01.array;

public class Application3 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8}; // new int[] {1, 4, 6, 7, 8};의 축약형

        // `fori` 입력 후 tab 누르면 for문 자동생성
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i + ": " + arr[i]);
        }
    }
}
