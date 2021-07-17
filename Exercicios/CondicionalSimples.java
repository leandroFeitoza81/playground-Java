import java.util.Scanner;

public class CondicionalSimples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int num1 = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println("O num1 é maior que o num2");
		}
			System.out.println("O num2 é o maior");
	}
}
