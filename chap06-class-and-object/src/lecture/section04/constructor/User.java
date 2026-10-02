package lecture.section04.constructor;

public class User {
    private String _id;
    private String _pwd;
    private String _name;


    User() {
        System.out.println("User의 기본 생성자 호출함.");
    }

    User(
            String id, String pwd, String name
    ) {
        _id = id;
        _pwd = pwd;
        _name = name;
    }

    public String get_id() {
        return _id;
    }

    public String get_pwd() {
        return _pwd;
    }

    public String get_name() {
        return _name;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", _pwd='" + _pwd + '\'' +
                ", _name='" + _name + '\'' +
                '}';
    }
}