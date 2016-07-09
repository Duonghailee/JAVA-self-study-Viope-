import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		
		//variables
		int count;
		double num, sum;
		double average;
		boolean isPos = true;
		
		
		//program starts
		System.out.println("Program calculates the average of inputted grades.");
		System.out.println("Finish with a negative integer.");
		count = 0; sum = 0;
		
		while(isPos){
			System.out.println("Input a grade (4-10): ");
			num = reader.nextDouble();
			if(num>=4&&num<=10){
				sum += num;
				count ++;
			}
			
			if(num<0){
				isPos = false;
				if(sum>0&&count>0){
					System.out.println(count + " grades inputted.");
					System.out.println("Average of the grades : " + (1.0*sum/count));
				}
				else
					System.out.println("You did not input any grades.");
			}
			
			if ((num<4||num>10)&&num>=0){
				System.out.println("Invalid grade!");
			}
			
		}
	}
}
				
