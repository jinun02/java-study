package day07.threadex;


import lombok.Data;

@Data
public class ThreadEx5 extends Thread{

    private long sum;

    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            sum+=i;
        }
    }

    public static void main(String[] args) {
        ThreadEx5 thread= new ThreadEx5();
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1~100까지의 합 : "+thread.getSum());
    }
}
