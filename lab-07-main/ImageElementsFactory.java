import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

  private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

  public ImageElement getFlyweight(String n) {
    // return a flyweight if it already exists, otherwise, put it in the map.
    ImageElement img = (ImageElement) flyweights.get(n);

        if(img == null){
            img = new ImageElement(n);
            flyweights.put(n, img);
            
        }
        return img;
  }

  public int numberOfFlyweights() {
    // return the size of the HashMap
    return flyweights.size();
  }

}
