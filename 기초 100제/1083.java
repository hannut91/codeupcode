package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i<=a;i++){
			if(i%3==0){
				System.out.print("X ");
			}
			else{
				System.out.print(i+" ");
			}
		}
	}

}
