

interface Caminante {
    default void Movimiento() {
        System.out.println("Caminando");
    }
}

interface Volador {
    default void Movimiento() {
        System.out.println("Volando");
    }
}

public class Walker implements Caminante, Volador{
    @Override
    public void Movimiento() {
        Caminante.super.Movimiento();
        Volador.super.Movimiento();
        System.out.println("Zombie mutante está caminando y volando");
    }

    public static void main(String[] args) {
        Walker z = new Walker();
        z.Movimiento();
    }

}