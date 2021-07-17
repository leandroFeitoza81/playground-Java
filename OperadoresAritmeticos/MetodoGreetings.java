import java.util.Scanner;

public class MetodoGreetings {
  static String saudacao(String name) {
    return "Olá " + name;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o seu nome: ");
    String name = input.nextLine();

    System.out.println(saudacao(name));

  }
  
}
