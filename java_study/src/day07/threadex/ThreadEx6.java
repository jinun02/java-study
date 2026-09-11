package day07.threadex;
/*
반복문 같은 루프문을 쓰래드가 처리시, 무의미하게 반복되는 작업을 하는 경우가 있음
이떄는 다른 쓰레드에게 실행을 양보(yield) 하고, 자신을 실행대기 상태로 가는것이 프로그램 성능에 도움이 됨
이런 제어를 하기 위해서 yield()가 제공됨
위 메서드를 호출한 쓰래드는 실행 대기상태로 돌아가고 다른 쓰래드가 실행됨
 */

public class ThreadEx6 extends Thread{
    public boolean work = true;

    public ThreadEx6(String name){
        setName(name);
    }

    @Override
    public void run() {
        while(true){
            if(work){
                System.out.println(getName()+"직업처리");
            }else {
                Thread.yield();
            }
        }
    }
}