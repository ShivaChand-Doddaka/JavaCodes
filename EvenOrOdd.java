import java.util.Scanner;

class EvenOrOdd
{
    public void findingEvenOrOdd(int x)
    {
        if(x%2==0)
            System.out.println(x + " is a EVEN number." );
        else
            System.out.println(x + " is a ODD number.");
    }
    public static void main(String[] args) 
    {
        EvenOrOdd obj1 = new EvenOrOdd();
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Even or Odd: ");
        int number = obj2.nextInt();
        obj1.findingEvenOrOdd(number);
    }
}