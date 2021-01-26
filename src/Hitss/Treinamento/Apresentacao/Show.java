package Hitss.Treinamento.Apresentacao;

public class Show {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("     Hitss Treinamento");
		System.out.println("");
		System.out.println("Segue a seqüência.");
		System.out.println("");
		for (int i = 1; i <= 100; i++) {
				System.out.println("Número: " + i + " Raiz Quadrada: " + Math.sqrt(i));
			

			
			if (i == 100) {
				System.out.println("");
				System.out.println("Fim do programa.");
			}
		}
	}
}
