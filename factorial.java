import java.util.*;


class TestClass {
   static long mod = 1000000007;
	static long[] fact = new long[100000];

	public static void main(String args[]) throws Exception {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			System.out.println(factorial(n));
		}

	}

	static long factorial(int n) {

		if (n == 0 || n == 1) {
		    fact[0] = 1;
		    fact[1] = 1;
		} else if (fact[n] == 0) {
			fact[n] = (fact[n - 1] * n) % mod;
			return fact[n];
		} 
		return fact[n];
	}
}import java.util.*;


class TestClass {
   static long mod = 1000000007;
	static long[] fact = new long[100000];

	public static void main(String args[]) throws Exception {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			System.out.println(factorial(n));
		}

	}

	static long factorial(int n) {

		if (n == 0 || n == 1) {
		    fact[0] = 1;
		    fact[1] = 1;
		} else if (fact[n] == 0) {
			fact[n] = (fact[n - 1] * n) % mod;
			return fact[n];
		} 
		return fact[n];
	}
}
