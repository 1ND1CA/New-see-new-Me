import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  // Variables (instance & static)
 private String[] CarImages;
  public static final int SAMPLE_RATE = 44100;
  // Constuctor
  public LastYear() {
    CarImages = FileReader.toStringArray("CarImages.txt");
    
  }
  public LastYear(String[] CarImages) {
    this.CarImages = CarImages;
    
  }

  /**
   * Top level drawScene method
   */
  public void drawScene() {
    PlayMusic();
    drawCarImage();
    setTextColor("white");
    setTextHeight(22);
    setTextStyle(Font.SERIF,FontStyle.ITALIC);
    drawText("My 2025 year", 50,50);
  }
  /**
   * draws each image in order
   */
  public void drawCarImage() {
    for (int i = 0; i < CarImages.length; i++){
      drawImage(CarImages[i], 0,0, 400, 400, 0);
      pause(1);
    }
  }

  public void PlayMusic() {
    double[] audio = SoundLoader.read("iron.wav");
   double[] clip = createClip(audio, 0, 10);
  playSound(clip);
  }

  // other methods
public static double[] createClip(double[] sound, int start, int end) {
    int startIndex = start * SAMPLE_RATE;
    int endIndex = end * SAMPLE_RATE;
    
    double[] newSound = new double[endIndex - startIndex];

    int index = 0;
    
    while (startIndex < endIndex) {
      newSound[index] = sound[startIndex];
      startIndex++;
      index++;
    }

    return newSound;
  }
}