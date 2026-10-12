package lecture.section03.reference;

import java.util.function.Function;

public class App2 {
    public static void main(String[] args) {
        Account account = new Account("Owner");

        Function<String, Account> func =
                (str) -> new Account(str);

        Function<String, Account> func2 = Account::new;

        Account account1 = func.apply("KIM");
        Account account2 = func2.apply("HONG");

        System.out.println(account1);
        System.out.println(account2);
    }
}
