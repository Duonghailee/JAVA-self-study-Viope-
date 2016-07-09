import java.util.Scanner;
public class ReverseNumbers{
public static void main( String[] args){
	//variables
	int size;
	double[] numArray;
	Scanner reader = new Scanner(System.in);
	//program starts
	System.out.print("How many floating point numbers do you want to type: ");
	size = reader.nextInt();
	numArray = new double[size];
	for(int i=0; i<size; i++){
		System.out.print("Type in " + (i+1) +". number: ");
		numArray[i] = reader.nextDouble();
	}
	System.out.println();
	System.out.println("Given numbers in reverse order: ");
	for(int i=(size-1); i >= 0; i--)
		System.out.println(numArray[i]);
}
	
}
