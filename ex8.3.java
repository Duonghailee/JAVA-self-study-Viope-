import java.util.Scanner;
public class Hours{
public static void main( String[] args){
	Scanner reader = new Scanner(System.in);
	//variables
	int i,amount;
	double sum, average;
	sum = 0;
	//program starts
	System.out.print("Amount of days: ");
	amount = reader.nextInt();
	double[] works = new double[amount];
	for(i=0; i<amount;i++){
		System.out.print("Type in work hours of day " + (i+1) + ": ");
		works[i] = reader.nextDouble();
		sum += works[i];
	}
	//print result
	System.out.println("Total of work hours: " + sum);
	System.out.println("average work day length: " + (sum/amount));
	System.out.print("Inputted work hours: ");
	for(i=0;i<(works.length);i++)
		System.out.print(works[i] + " ");
	}
 }

					 
		
