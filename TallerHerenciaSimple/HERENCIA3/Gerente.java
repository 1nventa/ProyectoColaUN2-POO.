package TallerHerenciaSimple.HERENCIA3;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llama al constructor de la clase base
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase base
        System.out.println("Departamento: " + departamento);
    }
}
