package file.io;

class MyThread implements Runnable{
    private String[] src = {"A", "B", "C"};
    int count = 0; //n1
    public  void run(){ //n2
        while(count < src.length){
            synchronized(this) {
                  System.out.println(src[count]);
                  count++;
           }
        }
    }
}
public class Test{
    
    public static void main(String[] args)  {
        MyThread myt = new MyThread();
        Thread t = new Thread(myt);
        Thread t1 = new Thread(myt);
        t.start();
        t1.start();
        }
     
}
