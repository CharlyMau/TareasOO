package paquete;

import java.util.Scanner;

public class ArraysBG {
	Scanner in = new Scanner(System.in);
	int iNumber = -1;

	ArraysBG(int[] arrBoy, int[] arrGirl) {
		// Set shoots for the Boy.
		for (int i = 0; i < arrBoy.length; i++) {
			System.out.println("Set shoot (Jose): ");
			iNumber = in.nextInt();
			if (iNumber <= 5 && iNumber >= 0) {
				arrBoy[i] = iNumber;
			} else {
				System.out.println("Error.");
				i--;
			}
		}
		// Set shoots for the Girl.
		for (int i = 0; i < arrGirl.length; i++) {
			System.out.println("Set shoot (Mairia): ");
			iNumber = in.nextInt();
			if (iNumber <= 5 && iNumber >= 0) {
				arrBoy[i] = iNumber;
			} else {
				System.out.println("Error.");
				i--;
			}
		}

		ResolveP _check = new ResolveP(arrBoy, arrGirl);
	}
}
