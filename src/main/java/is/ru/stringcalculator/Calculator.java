package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String input){
		if(input == ""){
			return 0;
		}

		if(input.contains(",")||input.contains("\n")){
			String [] numbers = input.split(splitExpression);
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

		int temp = stringToInt(input);
		if(temp<0){
			String exceptionString = "Negatives not allowed:" + temp;
			throw new IllegalArgumentException(exceptionString);
		}
		return temp;
	}

	private static int stringToInt(String input){
		return Integer.parseInt(input);
	}

	private static void checkNegative(String input){
		int temp = stringToInt(input);
		if(temp<0){
			String exceptionString = "Negatives not allowed:" + temp;
			throw new IllegalArgumentException(exceptionString);
		}
	}

	private static String splitExpression = "[\n,]"; 
}