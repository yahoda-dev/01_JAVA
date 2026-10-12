package lecture.section1.intro;

public class App {
    public static void main(String[] args) {
        Calculator cal = new CalculatorImpl();

        Calculator cal2= new Calculator() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return 0;
            }
        };

        Calculator cal3 = (x, y) -> {
          return x+y;
        };

    }
}
