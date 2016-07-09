import java.util.Scanner;
public class Loops {
	public static void main (String [] args ){
		Scanner reader = new Scanner(System.in);
		
		//variables
		int i,j,height,width;
		
		while(true){
			System.out.print("Type in the height: ");
			height = reader.nextInt();
			
			System.out.print("Type in the width: ");
			width = reader.nextInt();
			
			if(height<1||width<1){
				System.out.println("Invalid height or width value");
				continue;
			}
			else{
				System.out.println();
				for(i=0;i<height;i++){
					for(j=0;j<width;j++){
						System.out.print("X");
					}
					System.out.println();
				}
				break;
			}
		}
	}
}
				
