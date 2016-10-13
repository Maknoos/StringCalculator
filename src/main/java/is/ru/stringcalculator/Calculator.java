package is.ru.stringcalculator;

public class Calculator {
	public static int add(String input){
		if(input == ""){
			return 0;
		}
		if(input.contains(",")){
			String [] numbers = input.split(",");
			int first = stringToInt(numbers[0]);
			int second = stringToInt(numbers[1]);
			return first+second;
		}

		return stringToInt(input);
	}
	private static int stringToInt(String input)
	{
		return Integer.parseInt(input);
	}
}