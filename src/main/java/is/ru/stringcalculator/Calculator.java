package is.ru.stringcalculator;

public class Calculator {
	public static int add(String input){
		if(input == ""){
			return 0;
		}

		if(input.contains(",")){
			String [] numbers = input.split(",");
			int arraySize = numbers.length;
			int counter = 0;
			int stringSum = 0;

			while(counter!=arraySize){
				int temp=stringToInt(numbers[counter]);
				stringSum += temp;
				counter ++;
			}

			return stringSum;
		}

		return stringToInt(input);
	}
	private static int stringToInt(String input){
		return Integer.parseInt(input);
	}
}