package OurExceptionClass;

public class InvalidAgeException extends ArithmeticException{
	
	public InvalidAgeException(String message) {
		super(message);
	}
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Bu bir invalid age hatasidir..");
	}
	
}