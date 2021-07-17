public class Operacoes{
	public static String contador(int inicio, int fim) {
		String strContador = "";
		for (int i = inicio; i <= fim; i ++) {
			strContador += i + " ";
		}

		return strContador;
	}
}
