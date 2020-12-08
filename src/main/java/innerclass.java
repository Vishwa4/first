public class innerclass {
    public static  void main(String[] args){
        outer o = new outer();
        outer.inner1 i1 = new outer.inner1();
        outer.inner2 i2 = o.new inner2();
        System.out.println("accessing outer class: "+o.o);
        o.run();
        System.out.println("accessing inner private class: "+o.z);
        System.out.println("accessing inner static class: "+i1.s);
        i1.run();
        System.out.println("accessin inner class: "+i2.x2);
        i2.run();
    }

}
class outer{
    private class inner{
        int x=5;
        int run(){
            System.out.println("I AM IN INNER PRIVATE");
            return x+5;
        }
    }
    static class inner1{
        int s=15;
        void run(){
            System.out.println("I AM IN INNER_1");
        }
    }
    class inner2{
        int x2=20;
        void run(){
            System.out.println("I AM IN INNER_2");
        }

    }
    int o=50;
    void run(){
        System.out.println("I AM IN OUTER");
    }
    inner p=new inner();
    int z= p.run();

}
