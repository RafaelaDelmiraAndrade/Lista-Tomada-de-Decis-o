import java.util.Scanner;
public class CalculaImc {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		double peso, altura, imc;
		System.out.println("Entre com o seu peso:");
		peso = input.nextInt();
		System.out.println("Entre com a sua altura:");
		altura = input.nextInt();
		imc = peso/(altura*altura);
		System.out.println("O seu IMC é de "+imc+" .");
		if(imc < 18.5) {
			System.out.println("Excesso de magreza.");
		}else if(imc <= 25) {
			System.out.println("Peso normal.");
		}else if(imc <= 30) {
			System.out.println("Excesso de peso.");
		}else if(imc <= 35) {
			System.out.println("Obesidade (Grau I)");
		}else if(imc <= 40) {
			System.out.println("Obesidade (Grau II)");
		}else {
			System.out.println("Obesidade (Grau III)");
			input.close();
		}
	}
}
