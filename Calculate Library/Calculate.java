
public class Calculate {

	public static double square(double s) {
		double x;
		x=s*s;
		return x;
	}
		
	public static double cube(double c) {
		double x;
		x=c*c*c;
		return x;
	}
		
	public static double average(double x, double y) {
		double a =(x+y)/2;
		return a;
	}
	
	public static double average(double d, double e, double f) {
		return (d+e+f)/3;
	}
	
	public static double toDegrees(double rad) {
		double pi = 3.14159;
		return rad/pi * 180;
			
	}
	
	public static double toRadians(double deg) {
		double pi = 3.14159;
		return deg/180 * pi;
	}
	
	public static double discriminant(double a, double b, double c){
		return b*b + -1*4*a*c;
	}
	
	public static String toImproperFrac(int a, int b, int c){
		return (a * c + b) + "/" + c;
		
	}
	
	public static String toMixedNum(int a, int b){
		return (a/b + "_" + a%b + "/" + b);
	
	}
	
	public static String foil(int i, int j, int k, int l){
		return (i*k + "n^2 + " + i*l + j*k + "n + " + j*l);
	}
	
	public static boolean isDivisibleBy(int a, int b){
		if (a%b==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static double absValue(double a){
		return Math.abs(a);
	}
	
	public static int max(int a, int b){
		  if(a>b){
			  return a;
		  }
		  else{
			  return b;
		  }
	 }
	
	public static double max(double a, double b, double c){
		  if(a>b && a>c){
			  return a;
		  }

		  else if(b>a && b>c){
			  return b;
		  }
		  else{
			  return c;
		  }
	}

	public static double min(double a, double b){
		if(a<b){
			return a;
			}
		else{
			return b;
			}
		}
	
	public static double round2 (double a){
		int answer = ((int)(a * 100));
		if ((a * 100)-answer >= .5){
			double roundup = ((int)(a*100)+1)/100.00;
		    return roundup;  
		}
		else {
			double rounddown = (int)(a*100)/(100.00);
			return rounddown;
		}
	}

	public static double exponent(double a, int b){
		  double answer = 1.0;
		  for(int i = 0; i < b; i++){
			  answer *= a;
		  }
		  return answer;
	}

	public static int factorial(int a){
		 int answer = 1;
		 for(int i = 1; i <= a; i++){
			 answer *= i;
			 }
		 return answer;
	}
	
	public static boolean isPrime(int a){
		 for(int i = 2; i < a; i++){
			 if(s = Calculate.isDivisibleBy(a,i)){
			 }
		 }
	}
}
