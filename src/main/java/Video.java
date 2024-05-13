public class Video extends Contenido {

  @Override
  public boolean esPopular() {
    return vistas > 10000;
  }

  @Override
  public double maxRecaudacion() {
    return 10000;
  }

  @Override
  public double recaudacion(Contenido contenido) {
    return contenido.estrategia.recaudacion(contenido);
  }
}
