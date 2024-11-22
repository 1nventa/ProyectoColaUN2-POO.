package taller9.ejericicio3;

public class Main {
    public static void main(String[] args) {
        // Error: No se puede usar `super` aquí porque Main no es una clase derivada de Planta
        super.tipo = "Orquídea"; // Esto generará un error de compilación
    }
}