package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String a = sc.next();
			System.out.println(a);
			if(a.equals("q")){
				break;
			}
		}
	}

}
