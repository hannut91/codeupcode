package codeup;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int index = 0;
		int i =0;
		int j =0;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		
		int data[][] = new int[n][4];
		
		for(index=0;index<n;index++){
			for(i=0;i<4;i++){
				data[index][i] = sc.nextInt();
			}
		}
		
		int base[][] = new int[y][x];
		
		for(index=0;index<n;index++){
			int indexX = 0;
			int indexY = 0;
			// 막대모양이 가로일 
			
			if(data[index][1]==0){
				indexX = data[index][3]-1;
				indexY = data[index][2]-1;
				for(i=0;i<data[index][0];i++){
					base[indexY][indexX] = base[indexY][indexX]^1;
					indexX++;
				}
			}
			
			else if(data[index][1]==1){
				indexX = data[index][3]-1;
				indexY = data[index][2]-1;
				for(i=0;i<data[index][0];i++){
					base[indexY][indexX] = base[indexY][indexX]^1;
					indexY++;
				}
			}
			
		}
		
		for(i=0;i<y;i++){
			for(j=0;j<x;j++){
				System.out.print(base[i][j]+" ");
			}
			System.out.println("");
		}
		
 }
}
