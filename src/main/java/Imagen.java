public class Imagen extends Contenido {
  @Override
  public boolean esPopular() {
    return etiquetas
        .stream().allMatch(TagsDelDia::esTagPopular);
  }

  @Override
  public double maxRecaudacion() {
    return 4000;
  }

  @Override
  public double recaudacion(Contenido contenido) {
    return contenido.estrategia.recaudacion(contenido);
  }
}
