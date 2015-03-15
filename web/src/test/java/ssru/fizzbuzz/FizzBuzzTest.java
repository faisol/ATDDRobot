package ssru.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
	FizzBuzz fizzbuzz = new FizzBuzz();
	
	@Test
	public void putOneSayOne(){		
		assertEquals("1", fizzbuzz.say(1));
	}
	
	@Test
	public void putTwoSayTwo(){
		assertEquals("2", fizzbuzz.say(2));
	}
	
	@Test
	public void putThreeSayFizz(){
		assertEquals("Fizz", fizzbuzz.say(3));
	}
	
	@Test
	public void putFiveSayBuzz(){
		assertEquals("Buzz", fizzbuzz.say(5));
	}
	
	@Test
	public void putSixSayFizz(){
		assertEquals("Fizz", fizzbuzz.say(6));
	}
	
	@Test
	public void putTenSayBuzz(){
		assertEquals("Buzz", fizzbuzz.say(10));
	}
	
	@Test
	public void putFifteenSayFizzBuzz(){
		assertEquals("FizzBuzz", fizzbuzz.say(15));
	}
}



















	
