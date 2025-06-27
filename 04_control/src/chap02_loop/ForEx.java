package chap02_loop;

public class ForEx {

  public static void main(String[] args) {
    
    // 1~100 누적하기
    int total = 0;
    for (int x = 1; x <= 100; x++) {
      total += x;
    }
    System.out.println(total);
   
    // 1~100 홀수의 평균(합계 / 개수)
    int oddTotal = 0;
    int oddCount = 0;
    double oddAverage;
    for(int x = 1; x <= 100; x++ ) {       // int x = 1; x <= 100; x++이다 만약 x % 2 == 1일때 oddTotal += x; oddCount++;를 해라
      if (x % 2 == 1) {
        oddTotal += x;
        oddCount++;
      }
    }
    // 타입을 강제로 바꾸는 작업 자체를 casting이라 함 
    // promotion(자바가 편의상 타입을 안전하게 변경해주는 것)과 정반대 개념이 아닌 자바에게 명령을 내리는 행위
    oddAverage = (double)oddTotal / oddCount;   // oddTotal을 double로 casting하면, oddCount는 double로 promotion(자동변환)됩니다.
    System.out.println(oddAverage);
  }

}
