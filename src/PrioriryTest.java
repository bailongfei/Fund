public class PrioriryTest {
    public static void main(String[] args) {
        PriorityDemo1 demo1=new PriorityDemo1();
        PriorityDemo1 demo2=new PriorityDemo1();
        /*new Thread(demo1).start();
        new Thread(demo2).start();*/
        Thread t1=new Thread(demo1);
        Thread t2=new Thread(demo1);
        Thread t3=new Thread(demo1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
