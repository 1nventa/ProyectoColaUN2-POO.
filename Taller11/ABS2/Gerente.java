package Taller11.ABS2;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return 3000 + bono; // Salario base + bono
    }
}