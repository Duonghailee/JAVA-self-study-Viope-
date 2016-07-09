import java.util.Scanner;
public class ForLoop {
	public static void main (String [] args ){
		Scanner reader = new Scanner(System.in);
		
		//variables
		int i,num;
		System.out.print("Type in an integer: ");
		num = reader.nextInt();
		if(num<0 || num == 0)
			System.out.println("input is not a positive integer.");
		else{
			for(i=num;i>=0;i--){
				System.out.println(" " + i + " ");
			}
		}
	}
}
