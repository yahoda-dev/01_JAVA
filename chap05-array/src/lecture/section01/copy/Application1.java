package lecture.section01.copy;

public class Application1 {
    public static void main(String[] args) {
        int age1 = 10;
        int age2 = age1;  // copy

        // 배열의 복사에는 2가지 방식이 있다
        // - 얕은 복사: stack의 주소값만 복사
        // - 깊은 복사 : heap 배열의 저장된 값을 새로운 주소값으로 복사

        int[] orgArr = {1, 2, 3, 4, 5};
        int[] copyArr = orgArr; // 얕은 복사

        System.out.println(orgArr.hashCode());
        System.out.println(copyArr.hashCode());
        // result : same

        copyArr[0] = 99;

        System.out.println(orgArr[0]);
        System.out.println(copyArr[0]);
        // result : same

        int[] copyArr2 = orgArr.clone();
        copyArr2[0] = 22;

        System.out.println(orgArr[0]);
        System.out.println(copyArr2[0]);

        int[] copyArr3 = new int[10];
        print(copyArr3);
        // param1: origin array, param2: start index, param3: destination array, param4: start index, param5: copy length
        System.arraycopy(orgArr, 0, copyArr3, 3, orgArr.length);

        print(copyArr3);
    }

    public static void print(int[] iarr) {

        System.out.println("iarr의 hashcode : " + iarr.hashCode());

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}