import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//1 piece of bread
		middleBread("lettustomatobaconmayohambreadcheese");
		middleBread("applespineapplesbreadlettustomatobaconmayoham");
		//2 pieces of bread
		middleBread("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		//3 pieces of bread
		middleBread("applespineapplesbreadlettustomatobaconmayohambreadcheesebreadcheese");
		middleBread("applespineapplesbreadlettustomatobaconmayohambreadcheesebread");
		//start and end with bread
		middleBread("breadapplesbread");
		//all bread
		middleBread("breadbreadbread");
		
		middleBreadSpace("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
	}
	public static void middleBread(String bread){
		bread = "apples" + bread + "apples";
		String[] bread1 = bread.split("bread");
		String[] bread2 = new String[bread1.length];
		if (bread1.length > 2){
			for(int i = 0; i < bread1.length; i++){
				bread2[i] = bread1[i] + ", ";
			}
			String[] bread3 = Arrays.toString(bread2).split(", ");
			for(int j = 1; j <= bread2.length; j++){
				System.out.print(bread3[j]);
			}
			System.out.println();
		}
		else{
			System.out.println("you don't have a sandwich");
		}
		
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	}
	public static void middleBreadSpace(String bread){
		String[] bread1 = bread.split(" bread ");
		if (bread1.length>=1){
			for (int i = 1; i < bread1.length - 1; i++){
				System.out.println(bread1[i]);
			}
		}
		else{
			System.out.println("you don't have a sandwich");
		}
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	}

}
