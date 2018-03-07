package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ngames NumGames = new Ngames();
		// Number of games
		System.out.println("Games: ");
		NumGames.setiNgames(in.nextInt());

		int[] arrBoy = new int[NumGames.getiNgames()];
		int[] arrGirl = new int[NumGames.getiNgames()];

		ArraysBG setArraysBG = new ArraysBG(arrBoy, arrGirl);

	}
}
