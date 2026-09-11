package day07.threadex;

public class ThreadEx4 {
    public static void main(String[] args) {
        Thread mainThread =Thread.currentThread();
        System.out.println(mainThread.getName()+"실행");

        for(int i=0; i<3;i++){
            Thread threadA = new Thread(){
                @Override
                public void run() {
                    System.out.println(getName()+"실행");
                }
            };
            threadA.start();
        }

        Thread chatThread = new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+"실행");
            }
        };
        chatThread.setName("채팅쓰래드");
        chatThread.start();
    }

}