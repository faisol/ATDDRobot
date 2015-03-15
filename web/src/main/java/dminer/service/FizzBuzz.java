package dminer.service;

public class FizzBuzz {

	public String say(int number) {
		String fizzBuzzNumber = "";
		if(number % 3 == 0)
			fizzBuzzNumber += "Fizz";
		if(number % 5 == 0){
			fizzBuzzNumber += "Buzz";
		}
		if(fizzBuzzNumber.equals("")) {
			fizzBuzzNumber += String.valueOf(number);
		}
		return fizzBuzzNumber;
	}

}
