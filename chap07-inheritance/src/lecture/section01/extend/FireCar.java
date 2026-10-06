package lecture.section01.extend;

public class FireCar extends Car{
    FireCar() {
        System.out.println("called default constructor of FireCar.");
    }


    // Overriding
    @Override
    public void soundHorn() {
        if(isRunningStatus()){
            System.out.println("빠아아아앙!!!!");
        } else {
            System.out.println("주행 중이 아닐 경우에는 경적을 울릴 수 없습니다.");
        }
    }

    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다 =----->");
    }
}
