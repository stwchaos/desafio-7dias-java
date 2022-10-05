package numeros02;

/**
 * @author Sam Pfleger Mendes
 * @date 05/10/2022
 * 
 */

import java.util.Scanner;

public class Numeros02 {
	public static void main(String[] args) {
		calc(null);

	}

	/**
	 * Ler 6 números (digitados pelo usuário) e armazenar em um vetor. Você deve
	 * verificar qual o menor número e qual o maior número armazenados no vetor
	 * 
	 * @param calc
	 */

	public static void calc(Integer calc) {
		Scanner readT = new Scanner(System.in);
		Integer[] vetor = new Integer[6];
		Integer numMaior = Integer.MIN_VALUE;
		Integer numMenor = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número inteiro: ");
			String num = readT.nextLine();
			Integer numConvert = Integer.valueOf(num);
			vetor[i] = numConvert;

			if (numConvert > numMaior) {
				numMaior = vetor[i];
			} else if (vetor[i] < numMenor) {
				numMenor = vetor[i];
			}
		}

		System.out.println("maior número digitado: " + numMaior + " menor número digitado: " + numMenor);

	}
}