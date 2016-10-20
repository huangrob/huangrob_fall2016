import java.util.*
;
public class Hourglass {

	public static void Scanner(){
		Scanner userInput = new Scanner(System.in);
		System.out.println("How long do you want the hourglass to be? (Enter an even number)");
		int quotes = userInput.nextInt();
	}
	
	public static void main(String[] args) {
		
		lineWithQuotes(10);
		printTopHalf();
		printMiddleLine();
		printBottomHalf();
		lineWithQuotes(10);
	}

	public static void lineWithQuotes(){
		System.out.print("|");
		for(int j = 0; j<quotes; j++){
			System.out.print("\"");
		}
		System.out.println("|");	
	}	

	public static void printTopHalf(){
		for (int i=1; i<=quotes;i++){ 
			for (int s=1; s<=i;s++){
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int k=1; k<=10-2*i;k++){
				System.out.print(":");
			}
			System.out.println("/");
		}
	}

	public static void printMiddleLine(){
		for (int l = 0; l <= quotes/2; l++){
	}
	public static void printBottomHalf(){
		for (int i=4; i>=1;i--){ 
			for (int s=i; s>=1;s--){
				System.out.print(" ");
			}
			System.out.print("/");
			for (int k=1; k<=10-2*i;k++){
				System.out.print(":");
			}
			System.out.println("\\");
		}
	}
}