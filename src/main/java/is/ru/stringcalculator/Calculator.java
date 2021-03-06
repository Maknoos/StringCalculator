package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String input){
		if(input == ""){
			return 0;
		}
		if(input.contains("//")){
			return differentDelimiter(input);
		}

		if(input.contains(",")||input.contains("\n")){
			return calculateTotal(input,splitExpression);
		}
		int temp = stringToInt(input);
		if(isNegative(temp)){
			String exceptionString = "Negatives not allowed:" + temp;
			throw new IllegalArgumentException(exceptionString);
		}
		return temp;
	}

	private static int differentDelimiter(String input){
		
		String [] cutString = input.split("//");
		String Delimiter = cutString[1].substring(0,1);
		String values = cutString[1].substring(2);
		if(input.contains(Delimiter)){
			return calculateTotal(values,Delimiter);
		}

		return stringToInt(input);
	}

	private static int calculateTotal(String input,String expression){
			String [] numbers = input.split(expression);
			int arraySize = numbers.length;
			int [] negatives = new int[arraySize];
			int counter = 0;
			int stringSum = 0;
			boolean illegalInput = false;

			while(counter!=arraySize){
				int temp=stringToInt(numbers[counter]);
				
				if(isNegative(temp)){
					illegalInput = true;
					negatives[counter] = temp;
				}
				if(temp<1001){
					stringSum += temp;
				}
				counter ++;
			}

			if(illegalInput){
				createAndThrowMultipleException(negatives);
			}
			return stringSum;
	}

	private static void createAndThrowMultipleException( int [] negatives){
		String exceptionString = "Negatives not allowed:";
			for(int i =0; i< negatives.length; i++){
				if(negatives[i]!=0)
				{
					exceptionString += negatives[i];
				}
			}
		throw new IllegalArgumentException(exceptionString);
	}

	private static int stringToInt(String input){
		return Integer.parseInt(input);
	}

	private static boolean isNegative(int input){
		return (input < 0);
	}
	private static String splitExpression = "[\n,]"; 
}