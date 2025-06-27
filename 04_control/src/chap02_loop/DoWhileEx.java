package chap02_loop;

public class DoWhileEx {

  public static void main(String[] args) {
    
    // do while문은 while문과 다르게 문법상 이상해도 반드시 한번은 실행   
    // 1~100 누적하기 
    
    int total = 0;
    int x = 1;
    
    do {
      total += x++;
    } while (x <= 100);
    
    System.out.println(total);
    
  }

}
