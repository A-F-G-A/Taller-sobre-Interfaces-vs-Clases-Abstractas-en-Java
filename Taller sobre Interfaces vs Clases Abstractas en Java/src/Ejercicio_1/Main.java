package Ejercicio_1;

public class Main {
    public static void main(String[] args) {

        Figura rectangulo = new Rectangulo(10, 5);
        Figura triangulo = new Triangulo(8, 4);

        System.out.println("Area del Rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del Triangulo: " + triangulo.calcularArea());
    }
}
