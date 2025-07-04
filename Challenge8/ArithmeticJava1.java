package Challenge8;

public class ArithmeticJava1 {
    public static void main(String [] args){
        int num1=100;
        int num2=0;

        try {
            int answer =num1/num2;
            System.out.println("Answer: "+answer);
        }
        catch (ArithmeticException e){
            System.out.println("Error!Division by zero is not allowed!");
        }
        finally {
            System.out.println("Program continues after handling the exception");
        }
    }
}
