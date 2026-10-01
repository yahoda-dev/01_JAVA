package lecture.section02.looping;

public class D_continue {
    public void sampleContinue() {
        for(int i = 0; i < 5; i ++)
        {
            if(i == 3) continue;
            System.out.println(i);
        }
        System.out.println("반복문 종료.");
    }
}
