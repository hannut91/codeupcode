package codeup;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println(num1+num2+num3);
		System.out.printf("%.1f",(float)(num1+num2+num3)/3);

	}

}
