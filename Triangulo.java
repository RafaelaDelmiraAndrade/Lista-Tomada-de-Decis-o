import java.util.Scanner;
public class Triangulo {
	public static void main(String[]args) {
		Scanner input=new Scanner (System.in);
		int a, b, c;
		System.out.println("Informe o primeiro valor. ");
		a = input.nextInt();
		System.out.println("Informe o segundo valor. ");
		b = input.nextInt();
		System.out.println("Informe o terceiro valor. ");
		c = input.nextInt();
		if(a > b+c || b > a+c || c > b+a) {
			System.out.println("Esses valores não formam um trângulo. ");
		}else if(a == b && b == c && c == a) {
			System.out.println("Triângulo Equilátero.");
		}else if(a != b && a != c && b != c) {
			System.out.println("Triângulo Escaleno.");
		}else {
			System.out.println("Triângulo Isósceles.");
			input.close();
		}
	}
}
