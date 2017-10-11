//package TableLamp;
import java.io.Console;

public class Main {

  public static void main(String args[]) {
    TableLamp t = new TableLamp();

    String input = new String();
    Console console = System.console();

    while (true) {

      input = console.readLine("Enter command: ");
      //System.out.println("\'" + input + "\'");

      if (input.equals("quit") || input.equals("q")) {
        return;
      } else if (input.equals("on")) {
        t.on();
      } else if (input.equals("off")) {
        t.off();
      }

    }
  }

}
