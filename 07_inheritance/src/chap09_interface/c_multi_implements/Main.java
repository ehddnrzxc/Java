package chap09_interface.c_multi_implements;

public class Main {

  public static void main(String[] args) {
    
    // Camera 타입: Camera 인터페이스의 메소드만 보입니다. Phone 인터페이스의 기능은 캐스팅해서 호출
    Camera smartphone = new SmartPhone();
    smartphone.picture();
    ((Phone)smartphone).call();

    System.out.println();
    
    // Phone 타입: Phone 인터페이스의 메소드만 보입니다. Camera 인터페이스의 기능은 캐스팅해서 호출
    Phone smartphone2 = new SmartPhone();
    smartphone2.call();
    ((Camera)smartphone2).picture();
    
    System.out.println();
    
    // SmartPhone 타입: SmartPhone 클래스의 메소드가 모두 보입니다.
    SmartPhone smartphone3 = new SmartPhone();
    smartphone3.picture();
    smartphone3.call();
    
  }

}
