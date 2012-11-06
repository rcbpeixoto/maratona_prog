package br.fbv.rcbop;

import java.util.Scanner;

class Wallywow {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int instancia = 0;
		do {
			int current = 0;
			int quantidadeAlunos = 0;
			quantidadeAlunos = console.nextInt();
			String[] alunos = new String[quantidadeAlunos];
			int[] notas = new int[quantidadeAlunos];

			while (current < quantidadeAlunos) {
				alunos[current] = console.next();
				notas[current] = console.nextInt();
				current++;
			}

			int reprovado = 1;
			int lexindex;
			for (int j = 0; j < alunos.length; j++) {
				if (notas[j] < notas[reprovado]) {
					reprovado = j;
				} 
				else if (notas[j] == notas[reprovado]) {
					lexindex = alunos[j].compareTo(alunos[reprovado]);
					if (lexindex > 0)
						reprovado = j;
				}
			}
			System.out.println("Instancia " + ++instancia + " \n"+ alunos[reprovado] + "\n");

		} while (console.hasNext());
	}

}
