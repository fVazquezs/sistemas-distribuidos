package c;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Numero de threads: ");
        int numero = new Scanner(System.in).nextInt();

        for (int i = 1; i <= numero; i++) {
            new MyThread(numero, i).start();
        }
    }
}
