package TableLamp.LightBulb;

public class LightBulb extends Toggle {

  public void on() {
    this.setState("on");
    System.out.println("Lightbulb on");
  }

  public void off() {
    this.setState("off");
    System.out.println("Lightbulb off");
  }

}
