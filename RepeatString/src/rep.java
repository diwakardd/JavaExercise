import java.util.Scanner;

public class rep {
	public static void main(String[] args) {
		String a;
		 int num;
		Scanner scan = new Scanner(System.in);

	    System.out.print ("Enter a String:");
	    a = scan.next();
	
			System.out.println("Enter a Number : ");
	        num = scan.nextInt();
				
		System.out.print(a);
		for(int i=0;i<num;i++) {
			for(int j=a.length()-num;j<a.length();j++)
					System.out.print(a.charAt(j));
		}
		

	        
	}
	}
	    