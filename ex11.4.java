import java.util.Scanner;

class CommandLineCalculator {
    public static void main(String [] args) {
        int characters = args.length;

        if (characters < 3) 
            System.out.println("You did not type in a calculation!");
        else if (characters % 2 == 0)
            System.out.println("Invalid number of command line parameters.");
        else {
            Calculator counter = new Calculator();
            counter.count(args);
        }
    }
}

class Calculator{
	void count(String [] args) {
		//int[] result={};
		//int number = 0;;
	//	for(i=0;i<args.length;i++)
	//	 	number = Integer.parseInt(args[i]);
	//		result[i] = num
		int sum = 0;
		int number;
		int i;
		System.out.print("Result of the calculation ");
		for(i=0;i<args.length;i++)
			System.out.print(args[i] +" ");
		
		sum = Integer.parseInt(args[0]);
		for(i=1;2*i<args.length;i++){
			number = Integer.parseInt(args[2*i]);
			if((args[(2*i-1)]).equals( "+"))
				sum = sum + number;
			if((args[(2*i-1)]).equals("-"))
				sum = sum - number;
			
		}
		
		System.out.println("is " + sum);
		
	}
}



