package calculoComissao;

import java.util.Scanner;

public class CalculoDaComissao {

	public static void main(String[] args) {
		// Count that sh*t bro
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int anos;
		int vendas;

		System.out.print("Qual o nome do vendedor? ");
		nome = leitor.next();
		System.out.print("H� quantos anos ele trabalha na empresa? ");
		anos = leitor.nextInt();
		System.out.print("Qual o valor total de vendas?");
		vendas = leitor.nextInt();
		
		leitor.close();
		
		if (vendas >= 10.000 && vendas < 20.000 && anos >= 1) {
			int valor = (5 * vendas / 100);
			System.out.println(" ");
			System.out.println("O(a) vendedor(a) " + nome + " receber� 5% de comiss�o, resultando em: " + valor);
			
		}else if (vendas >= 20.000 && anos >= 1) {
			int valor = (10 * vendas / 100);
			System.out.println(" ");
			System.out.println("O(a) vendedor(a) " + nome + " receber� 10% de comiss�o, resultando em: " + valor);
		}else {
			int valor = (3 * vendas / 100);
			System.out.println(" ");
			System.out.println("O(a) vendedor(a) " + "receber� 3% de comiss�o, resultando em: " + valor);
		}
		
		
	}

}
