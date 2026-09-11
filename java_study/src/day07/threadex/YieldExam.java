package day07.threadex;

public class YieldExam {
    public static void main(String[] args) {
        ThreadEx6 workThreadA = new ThreadEx6("쓰래드A");
        ThreadEx6 workThreadB = new ThreadEx6("쓰래드B");

        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        workThreadA.work=false;
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        workThreadB.work=true;
    }
}
