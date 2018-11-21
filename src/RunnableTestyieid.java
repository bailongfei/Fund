public class RunnableTestyieid  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println(Thread.currentThread().getName()+"运行"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==3){
                System.out.println("线程礼让");
                Thread.currentThread().yield();
            }
        }
    }
}
