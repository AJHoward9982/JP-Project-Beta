/**
 * Andrew Howard
 *
 * Implements Multimedia Control , subclass of Product
 *
 * For Movie Devices
 */
public class MoviePlayer extends Product implements MultimediaControl {

  private Screen screen;
  private MonitorType monitorType;

  /**
   * Constructor for the Movie Player
   *
   * Takes in:
   *
   * @param newName Name of the device
   * @param screen Details of the screen (Resolution,RefreshRate,Latency)
   * @param monitorType (LED,LCD)
   */
  public MoviePlayer(String newName, Screen screen, MonitorType monitorType) {
    super(newName);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  /**
   * Formatted toString() method
   *
   * @return Screen details and Monitor Type
   */
  public String toString() {
    return super.toString() + "\n---Screen Details---" + screen + "\nMonitor Type: " + monitorType;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopped");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }

  //Test Driver
  /*public static void main(String[] args) {
    Screen screen = new Screen("3840 × 2160", 60, 1);
    MonitorType monitorType = MonitorType.LED;
    MoviePlayer moviePlayerTest = new MoviePlayer("Test Name", screen, monitorType);
    System.out.println(moviePlayerTest);
  }*/
}
