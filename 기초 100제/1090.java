package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		result = a;
		int index = 0;
		for(index=0;index<n-1;index++){
			result = result*r;
		}
		System.out.print(result);
	}
	

}
