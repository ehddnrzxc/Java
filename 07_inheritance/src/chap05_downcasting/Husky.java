package chap05_downcasting;

public class Husky extends Dog {

  @Override
  public void bark() {
    System.out.println("ㅎㅎㅎㅎㅎㅎ");
  }
  
  public void pullSnowSled() {
    System.out.println("허스키는 눈썰매를 끌 수 있습니다.");
  }
  
}
