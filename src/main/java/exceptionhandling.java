/*
public class exceptionhandling {
//        public int division(int a, int b) throws ArithmeticException{
//            int t = a/b;
//            return t;
//        }
//        public static void main(String args[]){
//            exceptionhandling obj = new exceptionhandling();
//            try{
//                System.out.println(obj.division(15,0));
//            }
//            catch(ArithmeticException e){
//                System.out.println("You shouldn't divide number by zero");
//            }
//        }
    public void checkAge(int age){
        if(age<18)
            throw new ArithmeticException("Not Eligible for voting");
        else
            System.out.println("Eligible for voting");
    }
    public static void main(String args[]){
        exceptionhandling obj = new exceptionhandling();
        try {
            obj.checkAge(20);
        }
        catch (Exception e){
        System.out.println(e);}
        finally {
            System.out.println("in finally method");
        }
    }
}
*/
