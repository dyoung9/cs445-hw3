//package tablelamp.button;
//import tablelamp.toggle;

public class Button extends Toggle {

  private Lightbulb l;

  public Button () {

    this.l = new Lightbulb();

  }

  public void switchOn() {
    this.setState("on");
    System.out.println("Button on");
    this.l.on();
  }

  public void switchOff() {
    this.setState("off");
    System.out.println("Button off");
    this.l.off();
  }

}
