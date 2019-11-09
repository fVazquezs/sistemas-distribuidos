package b;

public class main {
    public static void main(String[] args) {
        new MyThread(true).start();
        new MyThread(false).start();
    }
}
