import java.util.Scanner;

public class Cap {

	public static void main(String[] args) {
		char ch;
		Scanner reader = new Scanner(System.in);

	    System.out.print ("Enter a word:");
	    char ch1 = reader.next().charAt(0);	    
	    if (ch1>=65 && ch1<=90)
		    System.out.println("Capital Letter:");
	    
		else if (ch1>=97 && ch1<=122)
		    System.out.println("Character is a small letter");
	    
		else if (ch1>=48 && ch1<=57)
		    System.out.println("Character is a digit");
	    
		else if ((ch1>0 && ch1<=47)||(ch1>=58 && ch1<=64)||
	               (ch1>=91 && ch1<=96)||(ch1>=123 && ch1<=127))
		    System.out.println("Character is a special symbol");

	}

}
