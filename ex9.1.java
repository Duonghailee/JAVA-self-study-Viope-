import java.util.*;

public class RevisionExercise {
    public static void main(String[] args) {
      
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);
       
        int[] realArray = new int[amountOfNumbers];
        copyInfo(realArray, tempArray);
      
        setArray(realArray);
        
        printArray(realArray);
    }

    //ask info 
	public static int askInfo(int[] tempArray ) {
		Scanner reader = new Scanner(System.in);
		int i = 0; int num;
		do {
			System.out.print((i+1) + ". number: " );
			num = reader.nextInt();
			if(num!=0){
				tempArray[i] = num;
				i++;
			}
		}
		while(num!=0 && i <tempArray.length);
		return i;
	}
	// copy array
	public static void copyInfo(int[] realArray, int[] tempArray){
		for(int i=0; i<realArray.length;i++)
			realArray[i] = tempArray[i];
	}
	// sorting in descending
	public static void setArray(int[] realArray){
		int temp;
		for(int i=0;i<realArray.length;i++){
			for(int j=i+1;j<realArray.length;j++){
				if(realArray[i] < realArray[j]){
					temp = realArray[i];
					realArray[i] = realArray[j];
					realArray[j] = temp;
				}
			}
		}
	}
		 

    public static void printArray(int[] realArray ) {
        System.out.println("\Ordered array: ");
        for(int i = 0; i < realArray .length; i++) {
            System.out.println(realArray [i]);
        }
    }
