package lecture.section01.enumtype;

public enum Subjects {

    JAVA,
    MYSQL,
    JDBC,
    HTML,
    CSS,
    JAVASCRIPT;

    @Override
    public String toString() {
        return "=====" + this.name() + "=====";
    }
}