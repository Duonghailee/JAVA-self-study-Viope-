import java.util.Scanner;
public class CharacterStrings {
    public static void main(String args[]) {
        String characterString;
        Scanner reader = new Scanner(System.in);

        Printer printerObject = new Printer();

        System.out.print("Type in a character string: ");
        characterString = reader.nextLine();

        characterString = printerObject.bigSmall(characterString);
        printerObject.reverseSpace(characterString);
    }
}

class Printer{
	String bigSmall(String characterString){
		// reader
		Scanner reader = new Scanner(System.in);
		
		// String , case lower or upper ?
		String newCharacterString;
		String lowOrUpper;
		
		// ask user choice
		System.out.println("Do you want upper case or lower case? (upper/lower): ");
		lowOrUpper = reader.nextLine();
		
		// check choice whether upper or lower desire
		boolean isUpper;
		isUpper = lowOrUpper.equals("upper");
		if(isUpper){
			newCharacterString = characterString.toUpperCase();
		}
		else{
			newCharacterString = characterString.toLowerCase();
		}
		return newCharacterString;
	}
	void reverseSpace(String characterString){
		//reader 
		Scanner reader = new Scanner(System.in);
		
		// String and string of user select
		String newCharacterString;
		String reverseOrSep;
		
		// ask choice from user
		System.out.println("How would you like the string to be printed? (reverse/separated): ");
		reverseOrSep = reader.nextLine();
		
		// check choice whether reverse or seperate
		boolean isReverse;
		isReverse = reverseOrSep.equals("reverse") ;
		
		System.out.println();
		System.out.print("Here is your character string: ");
		
		// print reverse
		if(isReverse){
			for(int i = characterString.length()-1; i>=0; --i)
				System.out.print(characterString.charAt(i));
		
		}
		// priting seperately
		else{
			for(int i=0;i<characterString.length();i++)
				System.out.print(characterString.charAt(i) + " ");
		}
		
	}
}
