package vetores;

public class Vetor {

	public static void main(String[] args) {
		
		//**Criando vetor**//
		double[] notas = {
				7.8,
				8.4,
				6.5,
				9.2
			};
		String[] alunos = {
				"Maria",
				"Pedro",
				"Ana",
				"Fabiana","Fernanda","willian"
		};
		System.out.println("Notas :" + notas.length);
		System.out.println("Alunos :" + alunos.length);
		System.out.println("A nota do 3 bi foi:" + notas[2]);
		System.out.println("A nota do 4 bi foi:" + notas[3]);
		
		
		
		
	
		// Looping For/While/Do-until
	
		System.out.println("Media:" + media(notas));
		
		//int x = 3;
//		notas[x] =9.8;
//		notas[4]=10;
//		System.out.println("A nota do 4 bi foi:" + notas[3]);
		
//		int idades[]
		private static double soma(double[]vetor) {
			double soma = 0;
			for(int i = 0; i < 4, i++) {
				soma += vetor[i];
			}
		}
		return soma;
	}
	
}
