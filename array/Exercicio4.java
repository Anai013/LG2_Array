package array;

public class Exercicio4 {

	public static void main(String[] args) {

		Integer k[][] = new Integer[50][100];

		System.out.println("Adição entre os índices na forma inversa: ");
		for (int i = 49; i >= 0; i--) {
			for (int j = 99; j >= 0; j--) {

				k[i][j] = i + j;
				System.out.println(i + " + " + j + " = " + k[i][j]);
			}
		}
	}
}
