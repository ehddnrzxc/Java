package chap09_interface.e_marker_interface;

public class Main {

  public static void main(String[] args) {
    
    Person person = new Person();
    
    Hamburger hamburger = new Hamburger();
    
    Sashimi sashimi = new Sashimi();
    
    BloodCakeSoup bloodcakesoup = new BloodCakeSoup();
    
    // 매개변수가 Food인 경우 모든 Food 구현체를 넣을 수 있습니다. # Person Class 확인
    person.eat(hamburger);
    person.eat(sashimi);
    person.eat(bloodcakesoup);  // 컴파일 오류를 내고 싶다. (실행을 막고 싶다.)

    System.out.println();
    
    // 매개변수가 FavoriteFood인 경우 FavoriteFood 구현체만 넣을 수 있습니다. # Person Class 확인
    person.favoriteEat(hamburger);
    person.favoriteEat(sashimi);

  }

}
