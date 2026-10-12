package practice.q2;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<? extends Number> dataList = new ArrayList<>();

    public void addData(Number n) {
        dataList.add();
    }

    public void processData() {
        System.out.println(
                "데이터 처리 결과: " + dataList
        );
    }
}