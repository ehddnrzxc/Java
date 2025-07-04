package chap08_abstract;

public class Main {

  public static void main(String[] args) {
    
    Animal animal;
    
    // animal = new Animal(); : 추상 클래스 객체는 생성 불가능
    
    animal = new Lion(); animal.move();
    
    animal = new Shark(); animal.move();
    
    animal = new Eagle(); animal.move();
    
    animal = new Bear(); animal.move();
    

  }

}
