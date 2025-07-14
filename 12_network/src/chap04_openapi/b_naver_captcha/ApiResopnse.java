package chap04_openapi.b_naver_captcha;

public class ApiResopnse {

  private boolean result;
  private String resopnseTime;
  
  public boolean isResult() {
    return result;
  }
  public void setResult(boolean result) {
    this.result = result;
  }
  public String getResopnseTime() {
    return resopnseTime;
  }
  public void setResopnseTime(String resopnseTime) {
    this.resopnseTime = resopnseTime;
  }
  
}
