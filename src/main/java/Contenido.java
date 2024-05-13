import java.util.ArrayList;
import java.util.List;

public abstract class Contenido {
  protected String titulo;
  protected int vistas;
  protected boolean ofensivo;
  List<String> etiquetas = new ArrayList<>();
  Estrategia estrategia;

  public int getVistas() {
    return vistas;
  }

  abstract public boolean esPopular();
  abstract public double maxRecaudacion();
  abstract public double recaudacion(Contenido contenido);
  public double recaudacionPopular() {
    return esPopular() ? 2000 : 0;
  }

}
