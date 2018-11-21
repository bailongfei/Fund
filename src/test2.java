public class test2 {
    public static void main(String[] args) {
        RunnableDemo1 rundemo1=new RunnableDemo1();
        RunnableDemo1 rundemo2=new RunnableDemo1();
        new Thread(rundemo1).start();
        new Thread(rundemo2).start();
    }
}
