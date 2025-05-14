import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numFiguras = 0;
        Gestor gestor = new Gestor();
        Scanner sc = new Scanner(System.in);
        String pause;
        int menu = -1;
        while (menu != 10) {
            System.out.println("=== GESTION DE LAS FIGURAS ===");
            System.out.println("1) Añadir figura");
            System.out.println("2) Eliminar figura");
            System.out.println("3) Calcular area total");
            System.out.println("4) Calcular perimetro total");
            System.out.println("5) Figura con mayor área");
            System.out.println("6) Figura con mayor perimetro");
            System.out.println("7) Listar figuras");
            System.out.println("8) Listar figuras tipo");
            System.out.println("9) Mover figura");
            System.out.println("10) Salir");
            System.out.println("================================");
            System.out.print("Elije una opción: ");

            menu = sc.nextInt();
            sc.nextLine();

            System.out.flush();

            switch (menu) {

                case 1:
                    System.out.println("=== Añadir figura ===");

                    System.out.println("Que tipo de figura quieres añadir? (cuadrado, triangulo, circulo, rectangulo)");
                    String tipo = sc.nextLine();

                    String nombre = tipo + numFiguras;
                    numFiguras++;

                    System.out.println("Color: ");
                    String color = sc.nextLine();

                    System.out.println("Posicion eje X: ");
                    double posx = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Posicion eje Y: ");
                    double posy = sc.nextDouble();
                    sc.nextLine();

                    if (tipo.equals("cuadrado")) {

                        System.out.println("Longitud de un lado: ");
                        double ladoLongitud = sc.nextDouble();
                        sc.nextLine();

                        gestor.registrarCuadrado(nombre, color, posx, posy, ladoLongitud);

                    } else if (tipo.equals("rectangulo")) {

                        System.out.println("Longitud de un lado: ");
                        double ladoLongitud = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Longitud de la base: ");
                        double baseLongitud = sc.nextDouble();
                        sc.nextLine();

                        gestor.registrarRectangulo(nombre, color, posx, posy, ladoLongitud, baseLongitud);

                    } else if (tipo.equals("circulo")) {

                        System.out.println("Longitud del radio: ");
                        double radio = sc.nextDouble();
                        sc.nextLine();

                        gestor.registrarCirculo(nombre, color, posx, posy, radio);

                    } else if (tipo.equals("triangulo")) {

                        System.out.println("Longitud de la base: ");
                        double base = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Longitud del lado izquierdo: ");
                        double izq = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Longitud del lado derecho: ");
                        double der = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Longitud de la altura: ");
                        double altura = sc.nextDouble();
                        sc.nextLine();

                        gestor.registrarTriangulo(nombre, color, posx, posy, base, izq, der, altura);

                    }

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
                    break;

                case 2:
                    System.out.println("=== Eliminar figura ===");

                    System.out.println("Nombre de la figura que quieras eliminar: ");
                    String nombreEliminar = sc.nextLine();

                    gestor.eliminarFigura(nombreEliminar);

                    System.out.println("Pulse Enter para continuar...");
                    sc.nextLine();
                    pause = sc.nextLine();
                    break;

                case 3:
                    System.out.println("=== Calcular area total ===");

                    gestor.calcularAreaTotal();

                    System.out.println("Pulse Enter para continuar...");
                    sc.nextLine();
                    pause = sc.nextLine();
                    break;

                case 4:
                    System.out.println("=== Calcular perimetro total ===");

                    gestor.calcularPerimetroTotal();

                    System.out.println("Pulse Enter para continuar...");
                    sc.nextLine();
                    pause = sc.nextLine();
                    break;

                case 5:
                    System.out.println("=== Figura con mayor area ===");

                    gestor.figuraMayorArea();

                    System.out.println("Pulse Enter para continuar...");
                    sc.nextLine();
                    pause = sc.nextLine();
                    break;

                case 6:
                    System.out.println("=== Figura con mayor perimetro ===");

                    gestor.figuraMayorPerimetro();

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
                    break;

                case 7:
                    System.out.println("=== Listar figuras ===");

                    gestor.listarFiguras();

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
                    break;


                case 8:
                    System.out.println("=== Listar figuras tipo ===");

                    gestor.listarFigurasTipo();

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
                    break;

                case 9:
                    System.out.println("=== Mover Figura ===");

                    System.out.println("Pulse Enter para continuar...");
                    String nombreMov = sc.nextLine();
                    
                    gestor.moverFigura(nombreMov);
                    
                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
                    break;

                case 10:
                    System.out.println("=== SALIR ===");

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
                    break;    

                default:
                    System.out.println("Error: Opción no válida, intentalo de nuevo.");

                    System.out.println("Pulse Enter para continuar...");
                    pause = sc.nextLine();
            }
        }
    }
}