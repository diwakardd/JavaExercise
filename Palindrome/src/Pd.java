import java.util.Scanner;

public class Pd
{
    public static void main(String args[])
    {
        int num, rem, orig, rev=0;
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter a Number : ");
        num = scan.nextInt();
		
        orig = num;
		
        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        
        
        int sum=0,eve,rem1;
        eve=orig;
        while (eve!=0) {
        	 rem = eve%10;
             if(rem%2==0) {
            	 sum=sum+rem;
             }
             eve = eve/10;
        	 	}
        
        if(rev==orig && sum>25)
        {
            System.out.println(orig + " is a Palindrome Number and sum is greater that 25");
        }
        else if(rev==orig && sum<25)
        {
            System.out.println(orig + " is a Palindrome number and sum is less that 25");
        }
        else
        {
            System.out.println(orig + " is not a Palindrome number");
        }
    
    }
}

