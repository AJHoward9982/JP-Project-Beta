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

  public String toString() {
    return super.toString() + "\nAudio Spec: " + audioSpecification + "\nMedia Type: " + mediaType;
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