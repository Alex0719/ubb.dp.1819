package ro.ubb.dp1819.lab3.behavioral.mediator.colleague;

public class Mobile extends Device {
  public Mobile(Mediator m) {
    super(m);
  }

  public void receive(String message) {
    System.out.println("Mobile Received: " + message);
  }
}
