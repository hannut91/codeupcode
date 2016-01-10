package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		result = lcm(lcm(a,b),c);
		System.out.print(result);
		
	}

	static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
	}
    static int lcm(int a, int b) {
        return (a * b / gcd(b, a % b));
 }
}
