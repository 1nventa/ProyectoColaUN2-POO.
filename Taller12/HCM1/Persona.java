package Taller12.HCM1;

public class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("La persona está hablando.");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona está trabajando.");
    }
}