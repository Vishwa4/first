import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
//        HashSet
        /*HashSet hs=new HashSet();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");
        System.out.println(hs);
        HashSet chs= new HashSet<String>();
        chs = (HashSet)hs.clone();
        System.out.println(chs);*/
//        TreeSet
        TreeSet ts=new TreeSet();
        System.out.println(ts.add("Ravi"));
        ts.add("Vijay");
        ts.add("chitta");
        ts.add("sai");
        System.out.println(ts);
    }
}
