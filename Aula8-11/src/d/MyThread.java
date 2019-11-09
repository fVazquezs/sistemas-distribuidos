package d;

public class MyThread extends Thread {

    int[] numbers;
    int start, finish, number;

    public MyThread(int[] numbers, int start, int finish, int number){
        this.numbers = numbers;
        this.start = start;
        this.finish = finish;
        this.number = number;
    }

    @Override
    public void run() {
        boolean found = false;
        for (int i = start; i < finish; i++) {
            if(numbers[i] == number){
                found = true;
                System.out.println(start + " - " + finish + ": " + numbers[i]);
                i = finish;
            }
        }
        if(!found){
            System.out.println(start + " - " + finish + ": -1");
        }
    }
}
