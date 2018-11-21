public class ThreadDemo1 extends Thread{
  /*private String name;
  public ThreadDemo1(){
      this.name=name;
  }*/
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println("运行"+Thread.currentThread().getName()+i);
        }

    }
}
