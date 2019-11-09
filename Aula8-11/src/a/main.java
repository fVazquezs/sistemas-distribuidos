package a;

public class main {
    public static void main(String[] args) {

        new MyThread(0, "Par").start();
        new MyThread(1, "Impar").start();

    }
}
