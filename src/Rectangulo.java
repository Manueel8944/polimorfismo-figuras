public class Rectangulo extends Figura {
    public double ladoLongitud;
    public double baseLongitud;

    public Rectangulo(String nombre, String color, double posx, double posy, double ladoLongitud, double baseLongitud) {
        super(nombre, color, posx, posy);
        this.ladoLongitud = ladoLongitud;
        this.baseLongitud = baseLongitud;
    }

    public double getLadoLongitud() {
        return ladoLongitud;
    }

    public void setLadoLongitud(double ladoLongitud) {
        this.ladoLongitud = ladoLongitud;
    }

    public double getBaseLongitud() {
        return baseLongitud;
    }

    public void setBaseLongitud(double baseLongitud) {
        this.baseLongitud = baseLongitud;
    }

    @Override
    public double calcularArea() {
        double area = baseLongitud * ladoLongitud;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * (baseLongitud + ladoLongitud);
        return perimetro;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                        " | Color: " + color +
                        " | PosX: " + posx +
                        " | PosY: " + posy +
                        " | Lado Longitud: " + ladoLongitud +
                        " | Base Longitud: " + baseLongitud;
    }
}
