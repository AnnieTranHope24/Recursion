package recursion;

public class RecursionDemo {
	public static void main(String[] args) {
//		int fac = factorial(4);
//		System.out.println("Factorial of 4: " + fac);
//		int fac1 = factorial(0);
//		System.out.println("Factorial of 0: " + fac1);
//		int fac2 = factorial(-2);
//		System.out.println("Factorial of -2: " + fac2);
//		//fib
//		int fib = fibonacci(3);
//		System.out.println("Number with index 3: " + fib);
//		fib = fibonacci(5);
//		System.out.println("Number with index 5: " + fib);
//		fib = fibonacci(7);
//		System.out.println("Number with index 7: " + fib);
		int x = 2;
		int y = 6;
		System.out.println("x to power y: " + recursivePower(x, y));
		System.out.println("x multi y: " + recursiveMult(x, y));
		String word = "names";
		System.out.println("'names' reversed: " + reverseString(word, word.length() - 1 ));
	}

	public static int factorial(int num) {
		if (num == 1 || num == 0) {
			return 1;
		} else if (num < 0) {
			return -1;
		} else {
			return num * factorial(num - 1);
		}
	}

	// find nth number
	public static int fibonacci(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static int recursivePower(int x, int y) {
		if (y == 1) {
			return x;
		} else if (x == 1) {
			return 1;
		} else if (x == 0) {
			return 0;
		} else if (y == 0) {
			return 1;
		} else {
			return x * recursivePower(x, y - 1);
		}
	}

	public static int recursiveMult(int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		} else if (y == 1) {
			return x;
		} else if (x == 1) {
			return y;
		} else {
			return x + recursiveMult(x, y - 1);
		}
	}

	public static String reverseString(String word) {
		int len = word.length();
		if (len == 0 || len == 1) {
			return word;
		} else {
			return word.substring(len - 2, len - 1) + reverseString(word.substring(0, len - 1));
		}

	}

	public static String reverseString(String word, int lastIndex) {
		if (word.length() == 0 || word.length() == 1) {
			return word;
		} else if (lastIndex == 0) {
			return word.charAt(lastIndex) + "";
		}

		else {
			return word.charAt(lastIndex) + reverseString(word, lastIndex - 1);
		}
	}
}
