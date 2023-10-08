package Temel_Kavramlar;


import java.util.Scanner;
public class ArmstrongSayilar {

	public static void main(String[] args) {
		//Armstrong sayıları bulan program
		Scanner scan = new Scanner(System.in);
		int temp, bir, on, yüz, top;
		for(int i = 100; i <= 999; i++) {
			temp = i;
			
			bir = temp % 10;
			temp /= 10;
			
			on = temp % 10;
			temp /= 10;
			
			yüz = temp % 10;
			temp /= 10;
			
			top = (bir * bir * bir) + (on * on * on) + (yüz * yüz * yüz);
			
			if(top == i) {
				System.out.println(i + " bir Armstrong sayıdır.");
			}

		}

	}

}
