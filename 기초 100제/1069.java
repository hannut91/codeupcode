package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		switch(a){
		case "A":System.out.print("best!!!");
		break;
		case "B":System.out.print("good!!");
		break;
		case "C":System.out.print("run!");
		break;
		case "D":System.out.print("slowly~");
		break;
		default:System.out.print("what?");
		}

	}

}
