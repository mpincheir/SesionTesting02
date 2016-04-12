package cl.ubb.agil;


public class Calculator {

	public int adder(int num_1, int num_2){
		return num_1+num_2;		
	}
	
	public int subtractor(int num_1, int num_2){
		return num_1-num_2;		
	}
	
	public int expressionAdder(String expression) throws BadExpressionException{
		
		
		String[] numbers = expression.split("\\+");
		
		if (numbers.length == 0)
			throw new BadExpressionException();
		
		int suma = 0;
		for (String number : numbers) {
			try {			
				suma = suma + Integer.valueOf(number.trim());
			}catch (NumberFormatException ex){
				throw new BadExpressionException();
			}
		}			
		return suma;		
	}
	
	public float divider(int number, int divider){
		return (number/divider);		
	}
	
	public int multiplier(int number, int factor){
		return (number * factor);		
	}
}
