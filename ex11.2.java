import java.util.Scanner;


public class ObjectFunctionality {
    public static void main(String args[]) {
        Printer thing = new Printer();
        thing.Print();
    }
}


class Printer{
	//method 
	static void Print(){
		Scanner reader = new Scanner(System.in);
		System.out.print("Type in the first integer: ");
		int num1 = reader.nextInt();
		System.out.print("Type in the second integer: ");
		int num2 = reader.nextInt();
		int sum = Sum(num1, num2);
		System.out.print("Sum of the numbers: " + sum);
	}



class Calculator {
    static int Sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
}
