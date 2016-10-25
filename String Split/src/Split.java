import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		System.out.println(Arrays.toString("I really like really red apples!".split("really")));
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		System.out.println(Arrays.toString("I reallyreally like apples".split("really")));
		middleBread("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		//middleBread("lettustomatobaconmayohambreadcheese");
		//middleBread("applespineapplesbreadlettustomatobaconmayoham");
		//middleBread("applespineapplesbreadlettustomatobaconmayohambreadcheesebread");
		//middleBread("breadapplesbread");
		//middleBreadSpace("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
	}
	public static void middleBread(String bread){
		
		String[] bread1 = bread.split("bread");
		String bread2 = " ";
		for(int i = 0; i <= bread1.length-1; i++){
			bread2 = bread1[i] + ", ";	
		}
		String[]bread3 = bread2.split(", ");
		System.out.println(bread2);
		
		
		
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
