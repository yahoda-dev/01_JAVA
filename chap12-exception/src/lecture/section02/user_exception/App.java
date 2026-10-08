package lecture.section02.user_exception;

import lecture.section02.user_exception.exception.MoneyNegativeException;
import lecture.section02.user_exception.exception.NegativeException;
import lecture.section02.user_exception.exception.NotEnoughMoneyException;
import lecture.section02.user_exception.exception.PriceNegativeException;

public class App {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();


        try{
            et.checkEnoughMoney(100, 90);
        } catch (PriceNegativeException e) {
            System.out.println( e.getClass() + " / " + e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println( e.getClass() + " / " + e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println( e.getClass() + " / " + e.getMessage());
        } catch (NegativeException e) {
            System.out.println( e.getClass() + " / " + e.getMessage());
        }
    }
}