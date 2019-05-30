package com.br.exercicio.de.contatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();

		String nome1 = "";
		int numero1 = 0;
		int controle = 1;
		while (controle == 1) {

			System.out.println("(1) Criar um contato" + "\n" 
			+ "(2) Buscar um telefone pelo nome do contato" + "\n"
					+ "(3)Imprimir a lista de contatos" + "\n"
			+ "(4) Apagar um contato" + "\n");
			int verificador = entrada.nextInt();

			if (verificador == 1) {
				System.out.println("Digite seu nome: ");
				nome1 = entrada.next();

				System.out.println("Digite seu numero: ");
				numero1 = entrada.nextInt();

				map.put(nome1, numero1);
			} else if (verificador == 2) {

				// Dificuldade de criar uma lógica para que houvesse uma busca de contatos. :/
//					
//					boolean buscarNome = map.containsKey(entrada.nextLine()); 
//					boolean buscarNumero = map.containsValue(entrada.nextInt());
//					

			} else if (verificador == 3) {

				for (Entry<String, Integer> item : map.entrySet()) {
					System.out.println("Nome ->" + item.getKey());
					System.out.println("Número ->" + item.getValue());
					System.out.println("================================================" + "\n");

				}
			}
		}
	}
}
