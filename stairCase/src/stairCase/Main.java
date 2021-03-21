package stairCase;

public class Main {
	static void stairCase(int n) {
		String symbol = "#";
		String inputLine = "";
		int inputPosition = n;
		
		for (int lineIndex = 0; lineIndex < n; lineIndex += 1) {
			for (int columnIndex = 0; columnIndex <= n; columnIndex += 1) {
				if (columnIndex < inputPosition) {
					inputLine = inputLine + " ";
				} else {
					inputLine = inputLine + symbol;
				}
			}
			System.out.println(inputLine);
			inputLine = "";
			inputPosition -= 1;
		}
	}
	public static void main(String[] args) {
	    stairCase(6); 
	  }
}
