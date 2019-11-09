package d;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int[] numbers = new int[200];
        for (int i = 0; i < 200; i++) {
            numbers[i] = new Random().nextInt();
        }
        System.out.print("Escolha o numero para procurar: ");
        int number = new Scanner(System.in).nextInt();

        new MyThread(numbers, 0, 50, number).start();
        new MyThread(numbers, 50, 100, number).start();
        new MyThread(numbers, 100, 150, number).start();
        new MyThread(numbers, 150, 200, number).start();
    }
}
