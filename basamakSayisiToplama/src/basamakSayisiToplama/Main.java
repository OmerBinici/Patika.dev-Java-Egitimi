package basamakSayisiToplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		
		int number;
		System.out.print("Bir sayi giriniz : ");
		number = inp.nextInt();
		
		int basValue;
		int tempNumber = number;
		int result = 0;

		while (tempNumber != 0) {
			basValue = tempNumber % 10;
			result += basValue;
			tempNumber /= 10;
		}
		System.out.println(number + " sayisinin basamaklari toplamı : " + result);

	}

}
