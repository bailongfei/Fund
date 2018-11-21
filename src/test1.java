public class test1{
    public static void main(String[] args) {
        ThreadDemo1 demo1=new ThreadDemo1();

        ThreadDemo1 demo2=new ThreadDemo1();

        demo1.start();
        demo2.start();
    }

}
