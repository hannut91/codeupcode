package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		int result = w*h*b;
		System.out.printf("%.2f MB", (float)result/1024/8/1024);
	}

}
