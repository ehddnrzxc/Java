package chap01_string.b_stringbuilder_instance_array;

import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {

    // Product 진열하기
    Map<String, Object> product1 = Map.of("name", "양파1.5kg", "price", 3000);
    Map<String, Object> product2 = Map.of("name", "고등어1손", "price", 5000);
    Map<String, Object> product3 = Map.of("name", "한돈앞다리1kg", "price", 15000);
    Map<String, Object> product4 = Map.of("name", "블랙앵거스살치살500g","price", 20000);
    Map<String, Object> product5 = Map.of("name", "꼬마돈까스","price", 9000);

    // Cart 진열하기
    Cart cart1 = new Cart();
    Cart cart2 = new Cart();
    
    // Customer 입장
    Customer customer = new Customer(50000);
    
    // Customer가 Cart 취득
    customer.setCart(cart1);
    
    // 쇼핑
    customer.addToCart(product2); product2 = null;
    customer.addToCart(product3); product3 = null;
    customer.addToCart(product4); product4 = null;
    
    customer.removeFromCart(1);    // 제거
    
    // 구매
    String receipt = customer.purchase();
    
    // 구매내역 확인
    if (receipt != null) {
      JOptionPane.showMessageDialog(null, receipt);  // 구매 Product 목록 + 총 구매금액
      JOptionPane.showMessageDialog(null, "남은 돈: " + customer.getMoney());      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    // "1" -> 1
//    int x = Integer.parseInt("1");  
//    System.out.println(x + 1);
//    
//    // "1.5" -> 1.5
//    double y = Double.parseDouble("1.5");
//    System.out.println(y + 1);
//    
//    // 입력 대화상자
//    // showInputDialog()는 항상 String을 반환하므로 적절한 변환 과정이 필요할 수 있습니다.
//    String name = JOptionPane.showInputDialog("이름을 입력하세요.");
//    System.out.println(name);
//    
//    int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
//    System.out.println(age);

    
  }

}
