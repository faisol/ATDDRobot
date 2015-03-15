package ssru.fizzbuzz;

public class FizzBuzz {

    public String say(int number) {
        String fizzBuzzNumber = "";

        fizzBuzzNumber = fizzRule(number, fizzBuzzNumber);
        fizzBuzzNumber = buzzRule(number, fizzBuzzNumber);
        fizzBuzzNumber = otherRule(number, fizzBuzzNumber);

        return fizzBuzzNumber;
    }

    private String otherRule(int number, String fizzBuzzNumber) {
        if(fizzBuzzNumber.equals("")) {
            fizzBuzzNumber = "" + number;
        }
        return fizzBuzzNumber;
    }

    private String buzzRule(int number, String fizzBuzzNumber) {
        Boolean isBuzzNumber =  number % 5 == 0;
        if(isBuzzNumber){
            fizzBuzzNumber += "Buzz";
        }
        return fizzBuzzNumber;
    }

    private String fizzRule(int number, String fizzBuzzNumber) {
        Boolean isFizzNumber =  number % 3 == 0;
        if(isFizzNumber){
            fizzBuzzNumber += "Fizz";
        }
        return fizzBuzzNumber;
    }

}

