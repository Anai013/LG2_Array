package array;

public class Exercicio2 {

	public static void main(String[] args) {

		Integer k[] = new Integer[10];

		System.out.println("Índices da array em ordem inversa: ");

		for (int i = 9; i >= 0; i--) {

			k[i] = i;

			System.out.println(k[i]);
		}
	}
}
