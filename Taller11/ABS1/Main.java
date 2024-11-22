package Taller11.ABS1;
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de Circulo
        Figura circulo = new Circulo(5.0);
        circulo.mostrarArea(); // Mostrar el área del círculo

        // Crear un objeto de Rectangulo
        Figura rectangulo = new Rectangulo(4.0, 6.0);
        rectangulo.mostrarArea(); // Mostrar el área del rectángulo
    }
}