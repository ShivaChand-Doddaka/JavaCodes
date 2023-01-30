import java.util.Scanner;

class StringReverseClass
{
    String revstr = "";
    public String stringRevereseMethod(String orgstr)
    {
        for(int i=orgstr.length()-1; i>=0; i--)
        {
            revstr = revstr + orgstr.charAt(i);
        }
        return revstr;

    }
}
class StringReverse
{
    public static void main(String[] args) 
    {
        StringReverseClass obj1 = new StringReverseClass();
        Scanner obj2 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = obj2.nextLine();
        System.out.println(obj1.stringRevereseMethod(x));      
    }
}
