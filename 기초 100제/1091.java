package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		sum = a;
		for(index = 0;index<n-1;index++){
			sum = sum*m+d;
		}
		System.out.print(sum);
	}

}
