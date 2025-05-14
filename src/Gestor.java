import java.util.ArrayList;

public class Gestor {
    public ArrayList<Figura> listaFiguras;

    public Gestor() {
        this.listaFiguras = new ArrayList<Figura>();
    }

    public void registrarCuadrado(String nombre, String color, double posx, double posy, double ladoLongitud) {
        listaFiguras.add(new Cuadrado(nombre, color, posx, posy, ladoLongitud));
    }

    public void registrarRectangulo(String nombre, String color, double posx, double posy, double ladoLongitud, double baseLongitud) {
        listaFiguras.add(new Rectangulo(nombre, color, posx, posy, ladoLongitud, baseLongitud));
    }

    public void registrarTriangulo(String nombre, String color, double posx, double posy, double baseLongitud, double ladoIzqLongitud, double ladoDerLongitud, double alturaLongitud) {
        listaFiguras.add(new Triangulo(nombre, color, posx, posy, baseLongitud, ladoIzqLongitud, ladoDerLongitud, alturaLongitud));
    }

    public void registrarCirculo(String nombre, String color, double posx, double posy, double radioLongitud) {
        listaFiguras.add(new Circulo(nombre, color, posx, posy, radioLongitud));
    }

    public void eliminarFigura(String nombre) {
        boolean encontrada = false;
        for (int i = 0; i < listaFiguras.size(); i++) {
            if (listaFiguras.get(i).getNombre().equals(nombre)) {
                System.out.println("Figura eliminada: " + listaFiguras.get(i).getNombre());
                listaFiguras.remove(i);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró ninguna figura con el nombre: " + nombre);
        }
    }

    public void calcularAreaTotal(){
        double areaTotal = 0;
        for (Figura a: listaFiguras) {
            areaTotal += a.calcularArea();
        }

        System.out.println("El area total de todas las figuras es: " + areaTotal);
    }

    public void calcularPerimetroTotal(){
        double perimetroTotal = 0;
        for (Figura a: listaFiguras) {
            perimetroTotal += a.calcularPerimetro();
        }

        System.out.println("El area total de todas las figuras es: " + perimetroTotal);
    }

    public void figuraMayorArea() {
        if (listaFiguras.isEmpty()) {
            System.out.println("No hay figuras registradas.");
            return;
        }

        else {
            Figura mayor = listaFiguras.get(0);
            for (Figura f : listaFiguras) {
                if (f.calcularArea() > mayor.calcularArea()) {
                    mayor = f;
                }
            }

            System.out.println("Figura con mayor área:");
            System.out.println(mayor);
            System.out.println("Área: " + mayor.calcularArea());
        }
    }

    public void figuraMayorPerimetro() {
        if (listaFiguras.isEmpty()) {
            System.out.println("No hay figuras registradas.");
            return;
        }

        else {
            Figura mayor = listaFiguras.get(0);
            for (Figura f : listaFiguras) {
                if (f.calcularPerimetro() > mayor.calcularPerimetro()) {
                    mayor = f;
                }
            }

            System.out.println("Figura con mayor perímetro:");
            System.out.println(mayor);
            System.out.println("Perímetro: " + mayor.calcularPerimetro());
        }
    }

    public void listarFiguras() {
        for (Figura a: listaFiguras) {
            System.out.println(a);;
        }
    }

    public void listarFigurasTipo() {
        int index = 1;
        for (Figura a: listaFiguras) {
            System.out.println( index + ") Tipo: " + a.getNombre());
            index++;
        }
    }

    public void moverFigura(String nombre){
        boolean encontrada = false;
        for (int i = 0; i < listaFiguras.size(); i++) {
            if (listaFiguras.get(i).getNombre().equals(nombre)) {
                System.out.println("Figura movida: " + listaFiguras.get(i).getNombre());
                listaFiguras.get(i).mover();
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontró ninguna figura con el nombre: " + nombre);
        }
    }
}
