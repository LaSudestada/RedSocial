import java.util.ArrayList;
import java.util.List;

public class TagsDelDia {
  static List<String> tags = new ArrayList<String>();

  public List<String> getTags() {
    return tags;
  }

  public void setTag(String tag) {
    tags.add(tag);
  }

  public static boolean esTagPopular(String tag) {
    return tags.contains(tag);
  }

  public TagsDelDia() {
    tags.add("Animales");
    tags.add("Espacio");
    tags.add("Moda");
    tags.add("Deportes");
  }
}
