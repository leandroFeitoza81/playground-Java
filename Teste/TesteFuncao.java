import java.util.Scanner;

public class TesteFuncao {
	public static void main(String[] args) {
//		System.out.println(Operacoes.contador(1,100));
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o fator da multiplicação. ");
		int fator = input.nextInt();
		TabuadaMult.mult(fator);
		
	}
}
