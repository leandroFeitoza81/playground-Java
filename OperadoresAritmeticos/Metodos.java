public class Metodos {
  static void myMethod() {
    System.out.println("Eu sou um método");
  }

  static void soma(int a, int b) {
    int soma = a + b;
    System.out.println(soma);
  }
  
  public static void main(String[] args) {
    myMethod();
    soma(5,6);
  }
}
