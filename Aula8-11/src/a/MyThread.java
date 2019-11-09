package a;

public class MyThread extends Thread {
    int start;
    String valor;

    public MyThread(int start, String valor){
        this.start = start;
        this.valor = valor;
    }
    @Override
    public void run() {
        for(int i=start; i<101; i+=2){
            System.out.println(valor + " : " + i);
        }
    }
}
