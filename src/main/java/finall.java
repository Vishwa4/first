public class finall {
    public void finalize() throws Throwable{
        System.out.println("Object garbage collected.");
    }
    public static void main(String[] args) {

        finall t = new finall();
        t = null;
        System.gc();
    }
}
