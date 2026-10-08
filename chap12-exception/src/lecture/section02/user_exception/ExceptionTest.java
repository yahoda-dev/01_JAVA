package lecture.section02.user_exception;

import lecture.section02.user_exception.exception.MoneyNegativeException;
import lecture.section02.user_exception.exception.NegativeException;
import lecture.section02.user_exception.exception.NotEnoughMoneyException;
import lecture.section02.user_exception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws NegativeException {
        if(price < 0) {
            throw new PriceNegativeException("Price Negative Exception 발생!!");
        }

        if(money < 0)
            throw new MoneyNegativeException("MoneyNegativeException Exception 발생!!");

        if(price > money) throw new NotEnoughMoneyException("돈이 없어요.");
    }

}