import mathematics.BasicOperation;
import mathematics.LogarithmicOperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // To use a class, we need to import that class or package
    	Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter a number: ");
	    int input = scanner.nextInt();
	    System.out.println("Entered number : " + input);

	    scanner.close();


	    // Imported BasicOperation class inside the mathematics package
		BasicOperation operation = new BasicOperation();
		int result = operation.sum(2, 3);

		LogarithmicOperation logarithmicOperation = new LogarithmicOperation();
		logarithmicOperation.log();

    }
}
