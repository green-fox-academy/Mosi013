package aircraftcarrier;

public class F35 extends Aircraft {
  public F35() {
    super(12, 50);
  }

  @Override
  public boolean isPriority() {
    return true;
  }
}