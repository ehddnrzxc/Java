package chap04_openapi.b_naver_captcha;

public class ApiResopnse {

  private boolean result;
  private String responseTime;
  
  public boolean isResult() {
    return result;
  }
  public void setResult(boolean result) {
    this.result = result;
  }
  public String getResponseTime() {
    return responseTime;
  }
  public void setResopnseTime(String resopnseTime) {
    this.responseTime = resopnseTime;
  }
  
}
