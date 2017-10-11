//package TableLamp;

public class TableLamp {

  private Button b;
  //Lightbulb l;

  public TableLamp () {

    this.b = new Button();
    //this.l = new Lightbulb();

  }

  public void on () {

    this.b.switchOn();

  }

  public void off () {

    this.b.switchOff();

  }

}
