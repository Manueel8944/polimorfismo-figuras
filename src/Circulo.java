public class Circulo extends Figura {
    public double radioLongitud;

    public Circulo(String nombre, String color, double posx, double posy, double radioLongitud) {
        super(nombre, color, posx, posy);
        this.radioLongitud = radioLongitud;
    }

    public double getRadioLongitud() {
        return radioLongitud;
    }

    public void setRadioLongitud(double radioLongitud) {
        this.radioLongitud = radioLongitud;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * (radioLongitud * radioLongitud);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * radioLongitud;
        return perimetro;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre +
                        " | Color: " + color +
                        " | PosX: " + posx +
                        " | PosY: " + posy +
                        " | Radio Longitud: " + radioLongitud;
    }
}