package array;

public class Exercicio3 {

	public static void main(String[] args) {

		Integer k[][] = new Integer[100][100];
		int i, j;

		System.out.println("Índices da array subtraidos: ");

		for (i = 0; i < k.length; i++) {
			for (j = 0; j < k[i].length; j++) {

				k[i][j] = i - j;
				System.out.println(i + " - " + j + " = " + k[i][j]);
			}
		}

		System.out.println("Índices da array multiplicados por 7: ");

		for (i = 0; i < k.length; i++) {
			for (j = 0; j < k[i].length; j++) {

				k[i][j] = (i + j) * 7;
				System.out.println("7 * " + (i + j) + " = " + k[i][j]);
			}
		}
	}
}
