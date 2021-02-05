package array;

public class Exercicio1 {

	public static void main(String[] args) {

		Integer k[] = new Integer[9];
		int i;
		System.out.println("Índices da array: ");

		for (i = 0; i < k.length; i++) {

			k[i] = i;

			System.out.println(k[i]);
		}

		System.out.println("Índices da array multiplicados por 3: ");

		for (i = 0; i < k.length; i++) {

			k[i] = i * 3;

			System.out.println("3 * " + i + " = " + k[i]);

		}
	}
}
