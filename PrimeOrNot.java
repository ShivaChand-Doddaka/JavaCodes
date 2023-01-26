import java.util.Scanner;

class PrimeOrNot
{
    public static void main(String[] args) 
    {
        PrimeOrNotSubClass obj1 = new PrimeOrNotSubClass();
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Prime Number or Not: ");
        int number = obj2.nextInt(); 
        int counter = obj1.findingPrimeOrNot(number);
        if(counter == 2)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is a composite number.");
    }
}

class PrimeOrNotSubClass
{
    public int findingPrimeOrNot(int num)
    {
        int count = 2;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                count++;
        }
        return count;
    }
}
