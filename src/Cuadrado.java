public class Cuadrado extends Figura {
    public double ladoLongitud;

    public Cuadrado(String nombre, String color, double posx, double posy, double ladoLongitud) {
        super(nombre, color, posx, posy);
        this.ladoLongitud = ladoLongitud;
    }

    public double getLadoLongitud() {
        return ladoLongitud;
    }

    public void setLadoLongitud(double ladoLongitud) {
        this.ladoLongitud = ladoLongitud;
    }

    @Override
    public double calcularArea() {
        double area = ladoLongitud * ladoLongitud;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 4 * ladoLongitud;
        return perimetro;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                        " | Color: " + color +
                        " | PosX: " + posx +
                        " | PosY: " + posy +
                        " | Lado Longitud: " + ladoLongitud;
    }
}