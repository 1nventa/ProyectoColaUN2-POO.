package Taller11.ABS3;

public abstract class Animal {
    // Método abstracto
    public abstract void hacerSonido();

    // Método concreto
    public void mostrarTipo() {
        System.out.println("Este es un animal.");
    }
}
