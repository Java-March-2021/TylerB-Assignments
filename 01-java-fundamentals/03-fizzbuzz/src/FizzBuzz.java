
public class FizzBuzz {
	public String fizzBuzz(int number) {
		int A = number % 3;
		int B = number % 5;
		if(A + B == 0) {
			return "FizzBuzz";
		} else if (A == 0) {
			return "Fizz";
		} else if (B == 0) {
			return "Buzz";
		} else {
			return String.valueOf(number);
		}
		
	}
}
