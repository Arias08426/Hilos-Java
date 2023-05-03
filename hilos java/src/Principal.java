public class Principal {
    public static void main(String[] args) {
    HiloEjemplo miHilo1= new HiloEjemplo("Hilo Uno");
    HiloEjemplo miHilo2= new HiloEjemplo("Hilo Dos");

    miHilo1.start();
    miHilo2.start();

        System.out.println("Fin del Proceso");
    }
}