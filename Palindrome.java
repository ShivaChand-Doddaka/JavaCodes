import java.util.*;

class Palindrome
{
        public void checkingPalindrome(String orgstr)
    {
        String revstr = "";
        int n = orgstr.length()-1;
        for(int i=n; i>=0; i--)
        {
            revstr = revstr + orgstr.charAt(i);
        }
        System.out.println(revstr);
        if(orgstr.equalsIgnoreCase(revstr))
            System.out.println("Given String "+orgstr+" is a palindrome.");
        else
            System.out.println("Given String "+orgstr+" is not a palindrome.");
    }

    public static void main(String[] args) 
    {
        Palindrome obj1 = new Palindrome();
        Scanner obj2 = new Scanner(System.in); 
        System.out.print("Enter a String to check if palindrome or not: ");
        obj1.checkingPalindrome(obj2.nextLine());
    }
}