import java.util.Scanner;

public class PrefixEvaluator {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("This program evaluates prefix expressions");
		System.out.println("For operators +, -, *, /, and %.");
		
		System.out.print("Expression: ");
		System.out.println("value = " + evaluate(console));
	}

	//Pre: input contains valid prefix expression
	//Post: expression is consumed and the result returned
	private static double evaluate(Scanner input) {
		//Base case
		if(input.hasNextDouble()) {
			return input.nextDouble();
		} else {
			String operator = input.next();
			double operand1 = evaluate(input);
			double operand2 = evaluate(input);
			return evaluate(operator, operand1, operand2);
		}
	}

	private static double evaluate(String operator, double operand1, double operand2) {
		if(operator.equals("+")) {
			return operand1 + operand2;
		} else if (operator.equals("-")) {
			return operand1 - operand2;
		} else if (operator.equals("*")) {
			return operand1 * operand2;
		} else if (operator.equals("/")) {
			return operand1 / operand2;
		} else if (operator.equals("%")) {
			return operand1 % operand2;
		} else {
			throw new RuntimeException("Illegal operator");
		}
	}

}
