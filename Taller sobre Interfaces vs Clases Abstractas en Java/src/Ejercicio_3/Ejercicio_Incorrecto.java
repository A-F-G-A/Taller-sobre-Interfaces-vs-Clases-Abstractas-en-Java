package Ejercicio_3;

class ClaseA {
    void metodo() {
        System.out.println("Método de ClaseA");
    }
}
class ClaseB {
    void metodo() {
        System.out.println("Método de ClaseB");
    }
}
public class Ejercicio_Incorrecto extends ClaseA /*, ClaseB*/ {
    // La herencia múltiple de clases no es permitida en Java

    public static void main(String[] args) {
        Ejercicio_Incorrecto obj = new Ejercicio_Incorrecto();
        obj.metodo(); // Llama al método de ClaseA
    }
}