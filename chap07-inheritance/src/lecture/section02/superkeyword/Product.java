package lecture.section02.superkeyword;

import java.util.Date;

public class Product {
    /* 필드 */
    /// 상품 코드
    private String code;
    /// 브랜드
    private String brand;
    /// 상품명
    private String name;
    /// 가격
    private int price;
    /// 제조일자
    private Date manufacturingDate;

    /* 생성자 */
    public Product() {
        System.out.println("Product 클래스 기본 생성자 호출");
    }

    public Product(String code, String brand, String name, int price, Date manufacturingDate) {
        System.out.println("Product 클래스 필드 초기화 생성자 호출");
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
    }

    /* 프로퍼티 */

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override // Object 클래스의 `toString` 메서드를 오버라이딩한 것
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}