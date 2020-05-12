package ex.array;

public class arrayEx10 {

	public static void main(String[] args) {
		int[][] gugu = { { 2, 3, 4, 5, 6, 7, 8, 9 },
				         { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				         };

		for (int i = 0; i < gugu[0].length; i++) {
			for (int j = 0; j < gugu[1].length; j++) {

				System.out.println(gugu[0][i] + " x " + gugu[1][j] + " = " + (gugu[0][i] * gugu[1][j]));

			}
			System.out.println();
		}
	}

}
