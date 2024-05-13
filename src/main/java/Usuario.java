import java.util.List;
import java.util.ArrayList;

public class Usuario {
  protected String nombre;
  protected String mail;
  protected boolean verificado = false;
  List<Contenido> publicaciones = new ArrayList<>();

  public void publicar(Contenido publicacion) {
    publicaciones.add(publicacion);
  }

  public double recaudacionUnitaria(Contenido publicacion) {
    return 0;
  }

  public double recaudacionTotal() {
    return 0;
  }
}
