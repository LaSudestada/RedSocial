public class Venta implements Estrategia {
  protected double valor;

  @Override
  public double recaudacion(Contenido contenido) {
    return getValor();
  }

  public double valorMinimo() {
    return 5;
  }

  public double getValor() {
    return valor;
  }

  public Venta(double valor) {
    this.valor = Math.max(valor, valorMinimo());
  }
}
