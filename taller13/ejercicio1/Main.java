package taller3;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura triangulo = new Triangulo(4, 8);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        rectangulo.mostrarFigura();

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        triangulo.mostrarFigura();
    }
}