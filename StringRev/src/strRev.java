import java.util.Scanner;

public class strRev {

	public static void main(String[] args) {
		String a;
		Scanner scan = new Scanner(System.in);

	    System.out.print ("Enter a String:");
	    a = scan.next();
	    System.out.print("Reversed String is ");
        for(int i = a.length() - 1; i >= 0; --i)
		 {
		     System.out.print(a.charAt(i)); 
		 }
	}

}
