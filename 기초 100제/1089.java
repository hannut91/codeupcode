package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = a+(n-1)*d;
		System.out.print(result);
	}
	

}
