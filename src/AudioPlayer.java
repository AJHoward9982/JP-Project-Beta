/**
 * Andrew Howard
 *
 * Implements Multimedia Control , subclass of Product
 *
 * For Audio Devices
 */
public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  /**
   * Formatted toString() method to display Audio Spec and Media Type
   *
   * @return Audio Spec and Media Type
   */
  public String toString() {
    return super.toString() + "\nAudio Spec: " + audioSpecification + "\nMedia Type: " + mediaType;
  }

  /**
   * Prints Playing
   */
  @Override
  public void play() {
    System.out.println("Playing");
  }

  /**
   * Prints Stopped
   */
  @Override
  public void stop() {
    System.out.println("Stopped");
  }

  /**
   * Prints Previous
   */
  @Override
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Prints Next
   */
  @Override
  public void next() {
    System.out.println("Next");
  }

  /**
   * Constructor that takes in newName and audioSpecification
   * Sets mediaType to AUDIO
   *
   * @param newName
   * @param audioSpecification
   */
  public AudioPlayer(String newName, String audioSpecification) {
    super(newName);

    this.audioSpecification = audioSpecification;

    mediaType = ItemType.Audio;
  }


  /* Test Driver */
  /*public static void main(String[] args) {
    // Test default constructor and print instance attributes.
    System.out.println("------------------------------------------------------------");

    AudioPlayer thing = new AudioPlayer("AudioPlayerNameTest",
        "AudioSpecTest");
    System.out.println(thing);

    System.out.println("------------------------------------------------------------");

  }*/

}