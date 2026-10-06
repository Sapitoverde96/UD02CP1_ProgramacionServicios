void main() {
    Hilo h01 = new Hilo('A', 5);
    Hilo h02 = new Hilo('B', 5);
    Hilo h03 = new Hilo('C', 5);

    Thread hilo01 = new Thread(h01);
    Thread hilo02 = new Thread(h02);
    Thread hilo03 = new Thread(h03);

    hilo01.start();
    hilo02.start();
    hilo03.start();
}