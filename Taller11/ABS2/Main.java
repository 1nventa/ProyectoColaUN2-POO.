package Taller11.ABS2;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Juan Acevedo", 500);
        gerente.mostrarDetalles(); 

        Empleado vendedor = new Vendedor("Elizabeth Moreno", 2000, 0.1);
        vendedor.mostrarDetalles();
    }
}