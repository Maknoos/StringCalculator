package is.ru.stringcalculator;

public class Calculator {
	public static int add(String input){
		if(input == ""){
			return 0;
		}
		if(input.contains(",")){
			String [] numbers = input.split(",");
			int first = Integer.parseInt(numbers[0]);
			int second = Integer.parseInt(numbers[1]);
			return first+second;
		}

		return Integer.parseInt(input);
	}
}