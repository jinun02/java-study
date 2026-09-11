package day07.threadex;
/*
Thread 클래스를 직접 상속받아 run 을 오버라이드 하는 방법
 */
class MyThread extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("*");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadEx3 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();  // run()이 아니라 start()로 실행!

        for (int i = 0; i <= 5; i++) {
            System.out.println("&");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}