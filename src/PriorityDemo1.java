public class PriorityDemo1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
           try {
               Thread.sleep(1000);
           }catch (Exception e){
               e.printStackTrace();
           }

            System.out.println("优先级"+Thread.currentThread().getName()+"::"+i);
        }

    }
}
