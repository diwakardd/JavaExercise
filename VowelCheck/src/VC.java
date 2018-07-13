import java.util.Scanner;
public class VC {

	public static void main(String[] args) {
		System.out.println("Enter the string");
	     Scanner word = new Scanner(System.in);    
	     String input = word.nextLine();
	     char[] c = input.toCharArray();
	    
	      for(int i=0;i<c.length;i++) {
	         // if (c[i]>=65 && c[i]<=90 && c[i]>=97 && c[i]<=122 ) {
	    //         System.out.println("error"); 
	    //      }
	      if(c[i]=='a'||c[i]=='A'|| c[i] =='e' ||c[i]=='E'||c[i] =='i' ||c[i]=='I'||c[i] =='o' ||c[i]=='O'||c[i] =='u' ||c[i]=='U') 
	          {
	              System.out.println(c[i]+ " is a vowel");
	          }
	          else if((c[i]>='a' && c[i]<='z') || ( c[i]>='A' && c[i]<='Z')) {
	              System.out.println(c[i]+ " is a Consonant");
	          
	             }
	          else {
	              System.out.println( " error");
	                    } 
	        

	                         }

	                                    }
	                                        }