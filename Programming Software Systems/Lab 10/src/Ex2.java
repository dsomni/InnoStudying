
public class Ex2 {

    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println(a/b);
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("You should send 2 parameters!");
        }catch(java.lang.NumberFormatException e) {
            System.out.println("Both parameters should be integers!");
        }catch (java.lang.ArithmeticException e){
            System.out.println("Division by zero");
        }

    }
}

