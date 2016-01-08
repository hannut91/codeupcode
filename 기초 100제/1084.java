package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k=0;
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		for(i=0;i<r;i++){
			for(j=0;j<g;j++){
				for(k=0;k<b;k++){
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
		System.out.println(r*g*b);
	}

}
