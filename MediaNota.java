import java.util.Scanner;
public class MediaNota {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		int n1, n2, m, n3, m2;
		System.out.println("Entre com a primeira nota");
		n1 = input.nextInt();
		System.out.println("Entre com a segundo nota");
		n2 = input.nextInt();
		m = (n1 + n2)/2;
		System.out.println("A sua média é "+m+" .");
		if (m < 3) {
			System.out.println("Reprovado");
		}else if(m >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Exame");
			System.out.println("Entre com a nova nota");
			n3 = input.nextInt();
			m2 = (m+n3)/2;
			if(m2>=6) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
				input.close();
			}
		}
	}
}
