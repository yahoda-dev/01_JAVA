package practice.q1;

public class MultiBox<T1, T2> {
    private T1 firstData;
    private T2 secondData;

    public MultiBox() {
    }

    public MultiBox(T1 firstData, T2 secondData) {
        this.firstData = firstData;
        this.secondData = secondData;
    }

    public T1 getFirstData() {
        return firstData;
    }

    public T2 getSecondData() {
        return secondData;
    }

    public void setFirstData(T1 firstData) {
        this.firstData = firstData;
    }

    public void setSecondData(T2 secondData) {
        this.secondData = secondData;
    }
}
