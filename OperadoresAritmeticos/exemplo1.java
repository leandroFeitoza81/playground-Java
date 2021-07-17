import jdk.internal.vm.compiler.collections.Equivalence;

public class exemplo1 {
  public static void main(String[] args) {
    
    int numero = 10;
    int valor = 4 + ++ numero;

    String str1 = "Leandro";
    String str2 = new String("Leandro");
    String txt = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
    
    System.out.println(valor);
    System.out.println(numero);
    System.out.println(str1 != str2);
    System.out.println(txt.length());
    System.out.println(txt.toLowerCase());
    System.out.println(txt.indexOf("A"));
  }
}
