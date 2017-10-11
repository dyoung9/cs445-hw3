//package TableLamp.LightBulb;

public class Lightbulb extends Toggle {

  public Lightbulb() {}
  
  public void on() {
    this.setState("on");
    System.out.println("Lightbulb on");
  }

  public void off() {
    this.setState("off");
    System.out.println("Lightbulb off");
  }

}
