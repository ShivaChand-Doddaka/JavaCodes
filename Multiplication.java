import java.util.Scanner;

class Multiplication
{
    private static Scanner obj1 = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter the number to get the multiplication table: ");
        multiplicationTable(obj1.nextInt());
    }
    static void multiplicationTable(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
