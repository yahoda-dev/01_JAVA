package lecture.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    /* 필드 */
    private String cpu; // cpu 종류
    private int hdd;    // hdd 용량
    private int ram;    // ram 용량
    private String os;  // os 종류

    /* 생성자 */
    Computer() {
        System.out.println("Computer 클래스 기본 생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String os) {
        System.out.println("Computer 클래스 필드 초기화 생성자 호출");
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String os) {
        super(code, brand, name, price, manufacturingDate);
        System.out.println("Computer 클래스 및 Product 클래스 필드 초기화 생성자 호출");
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
    }

    /* 프로퍼티 */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                '}';
    }
}