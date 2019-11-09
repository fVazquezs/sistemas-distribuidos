package c;

public class MyThread extends Thread {
    int numero;
    int start;

    public MyThread(int numero, int start){
        this.numero = numero;
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i < 101; i+=numero) {
            System.out.println("Reponsavel "+start+" : "+i);
        }
    }
}
