import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        for(int i=0;i<50;i++) {
        System.out.println("Enter any number between 0 and 50:");
        int number = input.nextInt();
        int num2=38;
        if(number>50 || number<0) {
            System.out.println("Enter a number in range of 0 to 50");
        }
        else if(number>num2) {
            System.out.println("a. Number guessed is more than original number ");
        }
        else if(number<num2) {
            System.out.println("b. Number guessed is less than original Number ");
        }
        else {
            System.out.println("c. Number guessed matches the original number ");
        }
    }}

}

	