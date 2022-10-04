package numeros;

/**
 * 
 * @author Sam Pfleger Mendes
 * @date 04/10/2022
 *
 */

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		calc(null);

	}

	/**
	 * Ler 3 números (digitados pelo usuário) e armazenar em um vetor. Em seguida, exiba no console
	 * todos os números armazenados.
	 * @param calc
	 */
	
	public static void calc(String calc) {
		Integer[] vetor = new Integer[3];
		
		Scanner readT = new Scanner(System.in);
		String num;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("digite um número: ");
			num = readT.nextLine();
			Integer numConvert = Integer.valueOf(num);
			vetor[i] = numConvert;
			System.out.println("o número digitado foi: " + numConvert);
		}
	}

}