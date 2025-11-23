package Ejercicio_1;

public abstract class Figura {

    // Método abstracto que cada figura debe implementar
    public abstract double calcularArea();

    // Método común opcional
    public void mostrarFigura() {
        System.out.println("Mostrando figura...");
    }
}
