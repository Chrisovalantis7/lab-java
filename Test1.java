package sts;

public class Test1 {

	public static boolean isValid(final String text) {
		return (text + ".").matches("((([1]\\d\\d)|(2[0-4]\\d)|(25[0-5])|(\\d{1,2}))\\.){4}");
	}

	public static void main(final String[] args) {

		/*
		 * Examine the function 'isValid'. What does it validate?
		 * For which cases the validation fails?
		 * 
		 * It validates IP address.
		 * Valid is 0.0.0.0 - 255.255.255.255
		 * Not Valid is anything above 255
		 */
		
		String input = args[0];
		String result = Test1.isValid(input) ? "valid" : "not valid";
		System.out.println("Input " + input + " is " + result);
	}

}
