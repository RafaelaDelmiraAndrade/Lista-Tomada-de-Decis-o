import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[]args) {
		Scanner input=new Scanner (System.in); 
		int a, b, c;
		System.out.println("Entre com o primeiro número: ");
		a=input.nextInt();
		System.out.println("Entre com o segundo número: ");
		b=input.nextInt();
		System.out.println("Entre com o terceiro número: ");
		c=input.nextInt();
		if(a<b && b<c) {
			System.out.println("A ordem crescente desses números é "+a+", "+b+", "+c+" .");
		}else if(a<c && c<b) {
			System.out.println("A ordem crescente desses números é "+a+", "+c+", "+b+" .");
		}else if(b<a && a<c) {
			System.out.println("A ordem crescente desses números é "+b+", "+a+", "+c+" .");	
		}else if(b<c && c<a) {
			System.out.println("A ordem crescente desses números é "+b+", "+c+", "+a+" .");	
		}else if(c<a && a<b) {
			System.out.println("A ordem crescente desses números é "+c+", "+a+", "+b+" .");	
		}else {
			System.out.println("A ordem crescente desses números é "+c+", "+b+", "+a+" .");
			input.close();
		}
	}
}
