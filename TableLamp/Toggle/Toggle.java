package TableLamp.Toggle;


public class Toggle {

  private String state;

  public Toggle() {
    this.state = new String();
    this.setState("off");
  }

  public void setState(String s) {
    this.state = s;
  }

  public String getState() {
    return this.state;
  }

}
