package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		int c = 0;
		while(true){
			b+=c;
			if(b>=a){
				break;
			}
			c++;
		}
		System.out.print(c);
	}

}
