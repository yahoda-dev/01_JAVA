package lecture.section01.generic;




public class GenericTest<T> {
    private T value;

    public GenericTest(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
