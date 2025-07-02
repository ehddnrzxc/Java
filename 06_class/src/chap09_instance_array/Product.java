package chap09_instance_array;

public class Product {

  // 필드
  private String name;
  private int price;
  
  // 생성자
  public Product() { }

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // 메소드
  public String getName() {   // 값 받기 (필드값이 private일때)
    return name;
  }

  public void setName(String name) {  // 값 주기 (필드값이 private일때)
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
  
  
  
  
  
}
