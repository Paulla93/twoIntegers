/*Two numbers programme
 * Paulina Ruda
 * 15.09.2021
 */

package twoIntegers;


import java.util.Scanner;

public class two {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Plese enter two integers ");

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		System.out.println(" What you want to do? Please enter '+', '-', '*' or '/'.");		
		String a = sc.next();
		

		switch (a) {
		case "+" :
			int result1 = number1 + number2;
			System.out.println("Sum of two numbers " + result1);
			
			break;
		case "-" :
			int result2 = number1-number2; 
			System.out.println("Subtraction of two numbers " + result2);
			break;
		case "*":
			 int result3 = number1*number2; 
			 System.out.println("Multiplication of two numbers " + result3);
			break;
		case "/":
			if (number1 ==0 || number2==0) {
				System.out.println("Can't divide by 0! ");
			}else {
				int result4 = number1/number2;
				System.out.println("Division of two numbers " + result4);
			}
				break;
			
		default : System.out.print("Wrong operator! Please enter '+', '-', '*' or '/'.");		
			
			}
		
	}

}


