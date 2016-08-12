import java.util.Scanner;

public class Calci {
	
		public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		float a,b,sum;
		
		System.out.println("Enter your Fist number: ");
		a = input.nextFloat();
		
		System.out.println("Enter your Second number: ");
		b = input.nextFloat();
		
		sum = a+b;
		
		System.out.println("Your result: " + sum);
		}
}