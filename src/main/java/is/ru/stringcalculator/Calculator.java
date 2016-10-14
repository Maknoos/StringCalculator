package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String input){
		if(input == ""){
			return 0;
		}

		if(input.contains(",")||input.contains("\n")){
			String [] numbers = input.split(splitExpression);
			int arraySize = numbers.length;
			int [] negatives = new int[arraySize];
			int counter = 0;
			int stringSum = 0;
			boolean illegalInput = false;

			while(counter!=arraySize){
				int temp=stringToInt(numbers[counter]);
				
				if(temp < 0){
					illegalInput = true;
					negatives[counter] = temp;
				}

				stringSum += temp;
				counter ++;
			}

			if(illegalInput){
				String exceptionString = "Negatives not allowed:";
				 for(int i =0; i< negatives.length; i++){
					if(negatives[i]!=0)
					{
						exceptionString += negatives[i];
					}
				}
				throw new IllegalArgumentException(exceptionString);
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

	private static String splitExpression = "[\n,]"; 
}