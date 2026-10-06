public class Hilo implements Runnable {
    private final char caracter;
    private final int repeticiones;

    public Hilo(char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        for (int repeticion = 0; repeticion < this.repeticiones; repeticion++) {
            System.out.println(this.caracter);
        }
    }
}