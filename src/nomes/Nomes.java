package nomes;

/**
 * 
 * @author Sam Pfleger Mendes
 * @date 03/10/2022
 *
 */

import java.util.Scanner;

public class Nomes {

	public static void main(String[] args) {
		nomes(null);

	}

	/**
	 * Ler 3 nomes (digitados pelo usuário) e exibir no console todos eles
	 * @param nomes
	 */
	
	public static void nomes(String nomes) {
		Scanner readT = new Scanner(System.in);
		String nome;

		for (int i = 0; i < 3; i++) {
			System.out.println("digite um nome");
			nome = readT.nextLine();
			System.out.println("o nome digitado foi: " + nome);
		}
	}

}
