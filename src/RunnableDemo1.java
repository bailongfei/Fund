public class RunnableDemo1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("运行"+i+Thread.currentThread());
        }
    }
}
