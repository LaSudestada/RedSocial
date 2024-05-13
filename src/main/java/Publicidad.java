public class Publicidad implements Estrategia {
  @Override
  public double recaudacion(Contenido contenido) {
    return Math.min(contenido.getVistas() * 0.05 + contenido.recaudacionPopular(), contenido.maxRecaudacion());
  }
}
