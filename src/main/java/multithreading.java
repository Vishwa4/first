public class multithreading {
    public static void main(String[] args){
//        multithreading m1=new multithreading();
        multi1 m2=new multi1();
        Thread t1 = new Thread(m2);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();

    }
}
class multi1 extends Thread {
    public void run() {
        for(int i=0;i<5;i++)
            System.out.println(i);
    }
}