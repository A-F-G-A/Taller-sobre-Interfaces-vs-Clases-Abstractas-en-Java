package Ejercicio_1;

    
    interface Volador {
        void volar();
    }

    interface Nadador {
        void nadar();
    }

    public class Pajarito implements Volador, Nadador {
        @Override
        public void volar() {
            System.out.println("El pajarito está volando.");
        }

        @Override
        public void nadar() {
            System.out.println("El pajarito está nadando.");
        }

        public static void main(String[] args) {
            Pajarito p = new Pajarito();
            p.volar();
            p.nadar();
        }

    }

