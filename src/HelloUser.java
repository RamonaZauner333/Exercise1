
public class HelloUser {
	
	
	/* Add a new HelloUser class to the code that gets initialized with a userName variable. 
	 * The user name variable should be initialized by the main program querying the user for his name. 
	 * Futhermore, add a greetUser function to the HelloUser class that outputs a personalized greeting on the console.
	The output of the program should then look similar to this:
        Hello ASE2017 - how are you? :)
        Please enter your name: Ana
        Hello Ana! */
	
	private String userName;
	
	HelloUser (String pUserName) {	
		this.userName = pUserName;
	}
	
	
	public void greetUser () {
		
		System.out.println("Hello " + this.userName + "!");
		
		
	}
}
