import java.util.Scanner;

public class DoMath{
	
	public static void main(String[] args){
		float num;
		char op;
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Operation [s=square, c=cube]: ");
		op = input.nextLine().charAt(0);
		
		System.out.print("Number: ");
		num = input.nextFloat();
		switch(op) {
			case 's':
				System.out.printf("%.3f", Calculate.square(num));
			break;
			
			case 'c':
				System.out.printf("%.3f", Calculate.cube(num));
			break;
			
			default:
				System.out.printf("Haha you suck. Stop being dumb.");
		}
		
		double x=Calculate.square(5);
		System.out.println(x);
		
		double y=Calculate.cube(5);
		
	}

}
