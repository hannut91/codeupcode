package codeup;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, j;
		int indexX, indexY;
		boolean sema = true;
		Scanner sc = new Scanner(System.in);
		
		int base[][] = new int[10][10];
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				base[i][j] = sc.nextInt();
			}
		}
		
		indexX=1;
		indexY=1;
		while(sema){
			base[indexY][indexX]=9;
			switch(base[indexY][indexX+1]){
			case 0:
				indexX++;
				break;
			case 1:
				if(base[indexY+1][indexX]==1){
					sema=false;
					break;
				}else if(base[indexY+1][indexX]==2){
					base[indexY+1][indexX]=9;
					sema=false;
					break;
				}
				indexY++;
				break;
			case 2:
				indexX++;
				sema = false;
				break;
			default:;
			}
		}
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				System.out.print(base[i][j]+ " ");
			}
			System.out.println("");
		}
		
 }
}
