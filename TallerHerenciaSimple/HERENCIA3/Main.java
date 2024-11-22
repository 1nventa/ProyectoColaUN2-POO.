package TallerHerenciaSimple.HERENCIA3;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ana Gómez", 3000);
        Gerente gerente = new Gerente("Carlos Ruiz", 5000, "Ventas");

        System.out.println("Detalles del Empleado:");
        empleado.mostrarDetalles();

        System.out.println("\nDetalles del Gerente:");
        gerente.mostrarDetalles();
    }
}
