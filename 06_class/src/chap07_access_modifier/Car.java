package chap07_access_modifier;

/*
 * Access Modifier (접근 지시자)
 * 
 * 1. 클래스 내의 멤버(필드, 메소드)에 접근할 수 있는 권한을 의미합니다.
 * 2. 종류
 *    1) public    : 누구나 접근할 수 있습니다. (다른 패키지에 있어도 접근 가능)
 *    2) protected : 동일 패키지에 있거나, 상속 관계인 경우 접근할 수 있습니다.
 *    3) default   : 동일 패키지에 있으면 접근할 수 있습니다. 
 *                  (default 키워드는 존재하지 않습니다. package 권한이라고도 합니다. 
 *                    Access Modifier가 없는 경우 default 권한을 가집니다.)
 *    4) private   : 클래스 내부에서만 접근할 수 있습니다.
 * 3. 멤버의 권한
 *    1) 필드   : private (정보 은닉)
 *    2) 메소드 : public
 *    3) 생성자 : public 
 */

/*
 * 캡슐화(Encapsulation)
 * 
 * 데이터(필드)와 기능(메소드)을 하나의 클래스로 묶고,
 * 데이터를 외부에서 직접 볼 수 없게 은닉하여 보호하고
 * 필요한 기능만 외부에 공개합니다.
 */

/*
 * 필드에 간접적으로 접근하는 방법
 * 
 * 1. Getter
 *    1) 필드 값을 반환하는 메소드입니다.
 *    2) Getter의 이름은 "get + 필드" 또는 "is + 필드" 규칙을 따릅니다.
 * 2. Setter
 *    1) 인자를 받아서 필드에 저장하는 메소드입니다.
 *    2) Setter의 이름은 "set + 필드" 규칙을 따릅니다.
 */


public class Car {
  
  // 필드
  private String model;
  private int price;
  private Brand brand;
  
  // 생성자
  public Car() {
    //model = "E350";
    //price = 8000;
    this("E350", 8000, new Brand());  // 생성자-2를 호출
  }
  
  // 생성자-2   new Car("모델", 가격, new Brand("이름", "국적"))
  public Car(String model, int price, Brand brand) {
    this.model = model;
    this.price = price;
    this.brand = brand;
  }
  
  // 생성자-3   new Car("모델", 가격, "이름", "국적")
  public Car(String model, int price, String name, String nation) {
    // this.model = model;
    // this.price = price;
    // this.brand = new Brand(name, nation);
    this(model, price, new Brand(name, nation));  // 생성자-2를 호출
  }
 
  
  // 메소드
  public void printInfo() {
    brand.printinfo();     // Brand에 있는 printinfo 메소드 가져옴 
    System.out.println(model + ", " + price);
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  
}
