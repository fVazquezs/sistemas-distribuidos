package b;

public class MyThread extends Thread {

    boolean up;

    public MyThread(boolean up){
        this.up = up;
    }
    @Override
    public void run() {
        if(up) {
            for (int i = 1; i < 501; i++) {
                System.out.println("UP : " + i);
            }
        } else {
            for (int i = 500; i >= 0; i--) {
                System.out.println("DOWN : " + i);
            }
        }
    }
}
