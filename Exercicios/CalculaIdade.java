import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculaIdade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o ano do seu nascimento: ");
    int anoNasc = input.nextInt();
    int idade = 2021 - anoNasc;
    
    if (idade < 16) {
      System.out.println("Você é menor de idade e não pode votar");
    }
    else if (idade >= 16 && idade < 18){
      System.out.println("Você ainda é menor de idade, porém já pode votar");
    }
    else {
      System.out.println("Vocẽ já é maior de idade e também pode votar.");
    }
    
  }
}
