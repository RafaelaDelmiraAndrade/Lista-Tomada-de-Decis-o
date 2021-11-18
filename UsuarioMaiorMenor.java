import java.util.Scanner;
public class UsuarioMaiorMenor {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String nome, nomeVelho, nomeNovo;
		int idade, idadeVelho, idadeNovo;
		System.out.println("Entre com o 1° nome.");
		nome = input.next();
		System.out.println("Entre com o 1° idade.");
		idade= input.nextInt();
		nomeVelho = nome;
		idadeVelho = idade;
		nomeNovo = nome;
		idadeNovo = idade;
		System.out.println("Entre com o 2° nome.");
		nome = input.next();
		System.out.println("Entre com o 2° idade.");
		idade = input.nextInt();
		if(idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		}else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 3° nome.");
		nome = input.next();
		System.out.println("Entre com o 3° idade.");
		idade = input.nextInt();
		if(idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		}else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 4° nome.");
		nome = input.next();
		System.out.println("Entre com o 4° idade.");
		idade = input.nextInt();
		if(idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		}else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 5° nome.");
		nome = input.next();
		System.out.println("Entre com o 5° idade.");
		idade = input.nextInt();
		if(idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		}else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("O mais novo(a) é "+nomeNovo+" com "+idadeNovo+" anos.");
		System.out.println("O mais velho(a) é "+nomeVelho+" com "+idadeVelho+" anos.");
		input.close();
	}
}

