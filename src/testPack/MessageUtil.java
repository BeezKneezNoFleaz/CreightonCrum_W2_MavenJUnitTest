package testPack;


public class MessageUtil {

	private String message;

	public MessageUtil(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println("Hello World!");
		return message;
	}
	//Don't think this part is correct, if you could include in comments of my grade how to create a proper assertfalse class to be tested that would be great. Hope the rest is reasonable.
	public boolean isThisFalse(String message) {
				return true;
	}
	

}
