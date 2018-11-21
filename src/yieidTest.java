public class yieidTest {
    public static void main(String[] args) {
        RunnableTestyieid yieis=new RunnableTestyieid();
        Thread t1=new Thread(yieis);
        Thread t2=new Thread(yieis);
        t1.start();
        t2.start();
    }
}
