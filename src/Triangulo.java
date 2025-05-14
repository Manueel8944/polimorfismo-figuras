public class Triangulo extends Figura{
    public double baseLongitud;
    public double ladoIzqLongitud;
    public double ladoDerLongitud;
    public double alturaLongitud;

    public Triangulo(String nombre, String color, double posx, double posy, double baseLongitud, double ladoIzqLongitud, double ladoDerLongitud, double alturaLongitud) {
        super(nombre, color, posx, posy);
        this.baseLongitud = baseLongitud;
        this.ladoIzqLongitud = ladoIzqLongitud;
        this.ladoDerLongitud = ladoDerLongitud;
        this.alturaLongitud = alturaLongitud;
    }

    public double getBaseLongitud() {
        return baseLongitud;
    }

    public void setBaseLongitud(double baseLongitud) {
        this.baseLongitud = baseLongitud;
    }

    public double getLadoIzqLongitud() {
        return ladoIzqLongitud;
    }

    public void setLadoIzqLongitud(double ladoIzqLongitud) {
        this.ladoIzqLongitud = ladoIzqLongitud;
    }

    public double getLadoDerLongitud() {
        return ladoDerLongitud;
    }

    public void setLadoDerLongitud(double ladoDerLongitud) {
        this.ladoDerLongitud = ladoDerLongitud;
    }

    public double getAlturaLongitud() {
        return alturaLongitud;
    }

    public void setAlturaLongitud(double alturaLongitud) {
        this.alturaLongitud = alturaLongitud;
    }

    @Override
    public double calcularArea() {
        double area = (baseLongitud*alturaLongitud)/2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = ladoDerLongitud + ladoIzqLongitud + baseLongitud;
        return perimetro;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                        " | Color: " + color +
                        " | PosX: " + posx +
                        " | PosY: " + posy +
                        " | Base Longitud: " + baseLongitud +
                        " | Lado Izquierdo: " + ladoIzqLongitud +
                        " | Lado Derecho: " + ladoDerLongitud +
                        " | Altura: " + alturaLongitud;
    }
}
