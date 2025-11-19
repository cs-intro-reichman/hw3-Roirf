// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if (x2 >= 0) {
			while (x2 > 0) {
				x1++;
				x2--;
			}
		} else {
			while (x2 < 0) {
				x1--;
				x2++;
			}
		}
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if (x2 >= 0) {
			while (x2 > 0) {
				x1--;
				x2--;}}
			else {
				while (x2 < 0) {
					x1++;
					x2++;}}
		
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int result = 0;
		int positiveX2 = x2;
		if (x2 < 0) {
			positiveX2 = minus(0, x2);}
		while (positiveX2 > 0) {
			result = plus(result, x1);
			positiveX2 = minus(positiveX2, 1);}
		if (x2 < 0) {
			result = minus(0, result);}
		return result;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		while ( n>=0){
		    if (n==0) {
		        return 1;}
			else {
			    for (int i = 1; i < n; i++) {
				    x = times(x, x);
			    }}}

		return 0;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int sum = x1;
		for (int i = 0; sum >= x2; i++) {
			sum = minus(sum, x2);
		}
		return 0;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int sum = x1;
		if (sum < x2) {
			return sum;}
			else {
				while (sum >= x2) {
					sum = minus(sum, x2);
					return sum;
				}
			}
		return 0;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int original = x;
		if (mod(original,original) ==0){
		System.out.println(original);}
		else {
		if (mod(original,original) !=0){
		original--;
		System.out.println(original);}}
		return 0;
	}	  	 
} 
