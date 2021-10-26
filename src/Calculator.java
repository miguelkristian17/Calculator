import java.util.ArrayList;

public class Calculator{
	double result = 0;
	public Calculator() {
		
	}
	ArrayList<Object> calculations = new ArrayList<Object>();
	

	public void performOperation(double num) {
		calculations.add(num);
	}
	public void performOperation(String operand) {
		calculations.add(operand);
	}
	public double getResults() {
		return getResults(0,0);
	}
	
	public double getResults(int i, double result) {
		for(i = 0; i < calculations.size();i++) {
			if(calculations.get(i) == "*") {
				double operand1 = (double)calculations.get(i - 1);
				double operand2 = (double)calculations.get(i + 1);
				result = operand1 * operand2;
				calculations.set(i , result);
				calculations.remove(i - 1);
				calculations.remove(i);
				System.out.println(calculations);
			}
		}
		for(i = 0; i < calculations.size();i++) {
			if(calculations.get(i) == "/") {
				double operand1 = (double)calculations.get(i - 1);
				double operand2 = (double)calculations.get(i + 1);
				result = operand1 / operand2;
				calculations.set(i , result);
				calculations.remove(i - 1);
				calculations.remove(i);
				System.out.println(calculations);
			}
		}
		for(i = 0; i < calculations.size();i++) {
			if(calculations.get(i) == "+") {
				double operand1 = (double)calculations.get(i - 1);
				double operand2 = (double)calculations.get(i + 1);
				result = operand1 + operand2;
				calculations.set(i , result);
				calculations.remove(i - 1);
				calculations.remove(i);
				System.out.println(calculations);
			}
		}
		if(calculations.size() ==2) {
			System.out.println("Answer is: " + calculations.get(0));
			return (double) calculations.get(0);
		}
		return result;
	}

}
