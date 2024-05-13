import java.util.ArrayList;
import java.util.List;

public class Donaciones implements Estrategia {
  protected List<Donacion> donaciones = new ArrayList<Donacion>();

  @Override
  public double recaudacion(Contenido contenido) {
    return donaciones
        .stream()
        .map(Donacion::getValorDonacion)
        .reduce((double) 0, Double::sum);
  }
}
