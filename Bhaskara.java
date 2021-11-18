import java.util.Scanner;
public class Bhaskara { 
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		double a, b, c, delta, raizDelta, x1, x2;
		System.out.println("Entre com o valor de A: ");
		a = input.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = input.nextInt();
		System.out.println("Entre com o valor de C: ");
		c= input.nextInt();
		delta = (b*b) - 4 * a * c;
		if(delta < 0) {
			System.out.println("Não existem raízes para essa equação.");
		}else if(delta == 0) {
			x1 = (-b) / (2*a);
			System.out.println("Existe uma raíz real.");
			System.out.println("x1 = "+x1);
		}else {
			raizDelta = Math.sqrt(delta);
			x1 = (-b + raizDelta)/(2*a);
			x2 = (-b - raizDelta)/(2*a);
			System.out.println("Existe 2 raízes reais para essa equação.");
			System.out.println("x1 = "+x1+", x2 "+x2);
			input.close();
		}
	}
}
