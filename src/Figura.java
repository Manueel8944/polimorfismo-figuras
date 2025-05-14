public abstract class Figura {
    public String nombre;
    public String color;
    public double posx;
    public double posy;

    public Figura(String nombre, String color, double posx, double posy) {
        this.nombre = nombre;
        this.color = color;
        this.posx = posx;
        this.posy = posy;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mover() {
        double aux = posx;
        setPosx(posy);
        setPosy(aux);
    }
}