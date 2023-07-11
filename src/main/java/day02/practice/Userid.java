package day02.practice;



public class Userid {

	private int id;
	private String name;
	private String password;
	private String emailId;
	
	
	  // Getters and setters
	 
	public int id() {
		return id;
	}
	public void setid(int id) {
		this.id= id;
	}
	public String name() {
		return name;
	}
	public void setname(String name) {
		this.name= name;
	}
	public String password() {
		return password;
	}
	public void setpassword(String password) {
		this.password= password;
	}
	public String emailId() {
		return emailId;
	}
	public void setemailId(String emailId) {
		this.emailId= emailId;
	}
	
	public static void main(String[]args) {
		
		 Userid User1 = new Userid();
		 User1.setid(3);
		 User1.setname("Gowtham");
		 User1.setpassword("password");
		 User1.setemailId("gowtham.krish1705@gmail.com");
	        
	     // Print the attributes of each Dog
	       
	        System.out.println("User-Id : " + User1.id());
	        System.out.println("User-name : " + User1.name());
	        System.out.println("User-password : " + User1.password());
	        System.out.println("User-email : " + User1.emailId());

	}
	
}
