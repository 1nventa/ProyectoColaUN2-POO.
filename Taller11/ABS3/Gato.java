package Taller11.ABS3;

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }

    public void mostrarCaracteristica() {
        System.out.println("Los gatos son independientes.");
    }
}