package codeup;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char b = a.charAt(0);
		int c = b;
		c++;
		System.out.print((char)c);
	}
}
