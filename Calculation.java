import java.util.Scanner;

class Calculation
{
    public static void main(String[] args) 
    {
        PerformingCalculation obj1 = new PerformingCalculation();
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int number1 = obj2.nextInt();
        System.out.print("Enter the 2nd number: ");
        int number2 = obj2.nextInt();
        System.out.print("Enter the operator(+, -, *, /, %): ");
        String opr1 = obj2.next();
        /*"String opr1 = obj2.nextLine();" may not be executed because the method 
        "nextInt()" of the Scanner class does not consume the newline character 
        generated when the user presses the enter key after entering the integer. 
        As a result, when the nextLine() method is called, it immediately returns 
        the newline character that is still in the input buffer.*/
        obj1.calculate(number1, number2, opr1);
    }
}
class PerformingCalculation
{
    void calculate(int a, int b, String opr)
    {
        switch(opr)
        {
            case "+" : System.out.println(a+" "+opr+" "+b+" = "+(a+b));
                       break;
            case "-" : System.out.println(a+" "+opr+" "+b+" = "+(a-b));
                       break;         
            case "*" : System.out.println(a+" "+opr+" "+b+" = "+(a*b));
                       break;
            case "/" : System.out.println(a+" "+opr+" "+b+" = "+(a/b));
                       break;
            case "%" : System.out.println(a+" "+opr+" "+b+" = "+(a%b));
                       break;
            default  : System.out.println("Invalid operation");                       
        }
    }
}