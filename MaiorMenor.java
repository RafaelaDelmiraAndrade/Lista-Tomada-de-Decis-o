import java.util.Scanner;
public class Idade {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int nasc, anoAtual, id;
		System.out.println("Entre com o ano de nascimento:");
		nasc=input.nextInt();
		System.out.println("Entre com o ano atual:");
		anoAtual=input.nextInt();
		id = anoAtual - nasc;
		System.out.println("A sua idade em "+anoAtual+" é de "+id+" anos.");
		if(id < 10) {
			System.out.println("Criança");
		}else if(id <= 18) {
			System.out.println("Adolescente");
		}else if(id <= 60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
			input.close();
		}
	}
}
