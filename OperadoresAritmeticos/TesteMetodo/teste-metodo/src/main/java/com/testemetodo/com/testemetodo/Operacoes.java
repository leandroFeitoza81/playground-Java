public class Operacoes {
  public static String contador(int inicio, int fim) {
    String strContador = "";
    for (int count = inicio; count <= fim; count ++) {
      strContador += count + " ";
    }

    return strContador;
  }
}
