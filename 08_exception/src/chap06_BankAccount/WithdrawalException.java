package chap06_BankAccount;

public class WithdrawalException extends Exception {

  private static final long serialVersionUID = -1461913454857568983L;

  public WithdrawalException(String message) {
    super(message);
  }
  
}
