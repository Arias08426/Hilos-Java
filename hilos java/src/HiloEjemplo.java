public class HiloEjemplo extends Thread {

    public HiloEjemplo(String nombre) {
        super(nombre);
    }

    public void run() {

        for (int i = 0; i < 10; i++) {

            if (getName().equalsIgnoreCase("Hilo Uno")) {
                System.out.println(i + " " + getName() + "<---");
            } else {
                System.out.println(i + " " + getName() + "--->");
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

            System.out.println("Finalizar el Hilo" + getName());

    }
}
