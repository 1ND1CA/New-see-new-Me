import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

  // Variables (instance & static)
private String[] OtherImages;
  // Constuctor
  public ThisYear() {
OtherImages = new String[] {
  "CI9A8258.jpg",
  "CI9A8170.jpg",
  "CI9A8147.jpg",
  "CI9A8117.jpg",
  //other images
};
  }
  public ThisYear(String[] OtherImages) {
    this.OtherImages = OtherImages;
    
  }

  /**
   * Top level drawScene method
   */
  public void drawScene() {
    pause(1);
    clear("white");
    drawOtherImages();
    
  }

  // other methods
public void drawOtherImages() {
   for (int i = 0; i < OtherImages.length; i++){
      drawImage(OtherImages[i], 0,0, 400, 400, 0);
      pause(1);
    }
}
}