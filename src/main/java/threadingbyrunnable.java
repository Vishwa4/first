public class threadingbyrunnable {
    public static void  main(String[] args){
        multi m1 = new multi();
        Thread t1 =new Thread(m1);
        Thread t2 =new Thread(m1);
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread());
        System.out.println(t1.getName());
        t1.setName("vishwa");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t2.getId());
    }

}
class multi implements Runnable {
    public void run(){
        for (int i=0;i<5;i++)
            System.out.println(i);
    }

}