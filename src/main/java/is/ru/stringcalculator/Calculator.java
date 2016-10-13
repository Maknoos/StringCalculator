package is.ru.stringcalculator;

public class Calculator {
	public static int add(String input){
		if(input == "")
		{
			return 0;
		}

		return Integer.parseInt(input);
	}
}