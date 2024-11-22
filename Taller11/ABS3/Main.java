package Taller11.ABS3;
public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.mostrarTipo(); 
        perro.hacerSonido(); 

        Animal gato = new Gato();
        gato.mostrarTipo(); 
        gato.hacerSonido(); 
        ((Gato) gato).mostrarCaracteristica(); 
    }
}
