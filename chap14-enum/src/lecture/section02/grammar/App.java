package lecture.section02.grammar;

public class App {
    public static void main(String[] args) {

        UserRole1 ur1 = UserRole1.ADMIN;

        System.out.println("[01]: " + ur1) ;
        System.out.println("[02]: " + ur1.name()) ;
        System.out.println("[03]: " + ur1.getNameToLowerCase());

        UserRole2 ur2 = UserRole2.ADMIN;
        System.out.println(ur2);
        System.out.println(ur2.getDescription());
    }
}