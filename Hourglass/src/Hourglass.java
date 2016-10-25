import java.util.*
;
public class Hourglass {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How long do you want the hourglass to be? (Enter an even number)");
		int quotes = userInput.nextInt();
		
		
		// line with quotes
		System.out.print("|");
		for(int j = 0; j<quotes; j++){
			System.out.print("\"");
		}
		System.out.println("|");	
		
		
		//top half
		for (int i=quotes/2 - 1; i>=1;i--){ 
			for (int s=i; s>=1;s--){
				System.out.print(" ");
			}
			System.out.print("/");
			for (int k=1; k<=i;k++){
				System.out.print("::");
			}
			System.out.println("\\");
		}
		

		//middle line
		for (int l = 1; l<= quotes/2; l++){
			System.out.print(" ");
		}
		System.out.println("||");
		
		
		//bottom half
		for (int i=1; i<=quotes/2 - 1;i++){ 
			for (int s=1; s<=i;s++){
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int k=1; k<=i;k++){
				System.out.print("::");
			}
			System.out.println("/");
		}
		
		
		
		//line with quotes
		System.out.print("|");
		for(int j = 0; j<quotes; j++){
			System.out.print("\"");
		}
		System.out.println("|");	
	}
}
	

