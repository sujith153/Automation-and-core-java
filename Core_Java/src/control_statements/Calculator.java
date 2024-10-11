package control_statements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Java Calculator!");

		while (true) {
			System.out.print("\nEnter an expression (e.g., 1+2+3+45), or 'exit' to quit: ");
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("exit")) {
				System.out.println("Exiting the calculator. Goodbye!");
				break;
			}

			// Remove all whitespace characters from the input string
			input = input.replaceAll("\\s+", "");

			// Split the input string into individual numbers and operators
			String[] parts = input.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

			double result = 0;
			try {
				// Initialize the result with the first number
				result = Double.parseDouble(parts[0]);

				// Iterate over the rest of the parts and perform calculations
				for (int i = 1; i < parts.length; i += 2) {
					String operator = parts[i];
					double operand = Double.parseDouble(parts[i + 1]);

					switch (operator) {
					case "+":
						result += operand;
						break;
					case "-":
						result -= operand;
						break;
					case "*":
						result *= operand;
						break;
					case "/":
						if (operand != 0)
							result /= operand;
						else
							System.out.println("Error! Division by zero is not allowed.");
						break;
					default:
						System.out.println("Invalid operator! Please use one of +, -, *, or /.");
						break;
					}
				}

				System.out.println("Result: " + result);
			} catch (NumberFormatException e) {
				System.out.println("Invalid expression! Please enter a valid expression.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid expression! Please enter a valid expression.");
			}
		}

		scanner.close();
	}

}
