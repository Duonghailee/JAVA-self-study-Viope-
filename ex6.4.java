import java.util.Scanner;
public class Calculation {
	public static void main (String [] args ){
		Scanner reader = new Scanner(System.in);
		
		//variables
		int choice, num1,num2;
		double division;
		
		//program starts
		System.out.println("Choose from the following calculations: ");
		System.out.println("1: subtraction\n2: addition\n3: multiplication\n4: division\n5: remainder\n");
		
		System.out.println("Make your choice: ");
		choice = reader.nextInt();
		switch(choice){
			case 1:
				System.out.print("Type in the first number: ");
				num1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				num2 = reader.nextInt();
				System.out.println(num1 +" - "+ num2 + " = " + (num1-num2));
				break;
			case 2:
				System.out.print("Type in the first number: ");
				num1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				num2 = reader.nextInt();
				System.out.println(num1 +" + "+ num2 + " = " + (num1+num2));
				break;
			case 3:
				System.out.print("Type in the first number: ");
				num1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				num2 = reader.nextInt();
				System.out.println(num1 +" * "+ num2 + " = " + (num1*num2));
				break;
			case 4:
				System.out.print("Type in the first number: ");
				num1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				num2 = reader.nextInt();
				division = 1.0*num1/num2;
				System.out.println(num1 +" / "+ num2 + " = " + division);
				break;
			case 5:
				System.out.print("Type in the first number: ");
				num1 = reader.nextInt();
				System.out.print("Type in the second number: ");
				num2 = reader.nextInt();
				System.out.println(num1 +" % "+ num2 + " = " + (num1%num2));
				break;
			default:
				System.out.println("Invalid choice.");
		}
	}
}
		
