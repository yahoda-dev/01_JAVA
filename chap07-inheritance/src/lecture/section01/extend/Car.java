package lecture.section01.extend;

// Parent Class
public class Car {
    /// 주행 여부에 대한 상태값
    private boolean runningStatus;

    Car() {
        System.out.println("called default constructor of Car.");
    }

    public void soundHorn() {
        if (runningStatus) {
            System.out.println("빵빵!");
        } else {
            System.out.println("주행 중이 아닐 경우에는 경적을 울릴 수 없습니다.");
        }
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 출발합니다.");
    }

    protected boolean isRunningStatus() {
        return runningStatus;
    }


}
