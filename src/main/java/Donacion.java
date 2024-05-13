public class Donacion {
  protected String donador;
  protected double valorDonacion;

  public double getValorDonacion() {
    return valorDonacion;
  }

  public Donacion(String donador, double valorDonacion) {
    this.donador = donador;
    this.valorDonacion = valorDonacion;
  }
}
