import java.util.Scanner;
public class OddOrEven {
	public static void main (String [] args ){
		Scanner reader = new Scanner(System.in);
		
		//variables
		int num;
		System.out.print("Type in an integer: ");
		num = reader.nextInt();
		if(num<0 || num == 0)
			System.out.println("input is invalid");
		else{
			if(num%2==0)
				System.out.println("Number " + num + " is even.");
			else
				System.out.println("Number " + num + " is odd.");
		}
	}
}
