public class ThreadImPar extends Thread {
    int start;
    String valor;

    public ThreadImPar(int start, String valor){
        this.start = start;
        this.valor = valor;
    }
    @Override
    public void run() {
        for(int i=start; i<100; i+=2){
            System.out.println(valor + " : " + i);
        }
    }
}
