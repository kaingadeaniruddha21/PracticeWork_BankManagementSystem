package bankmanagementsystem.model;



public class Login extends Bank {  
	
	
	private String userName;
	private String passWord;
	

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
  public static boolean isValidPassword(String password) {
	  boolean isValid;
	  if(password.length()<8 || password.length()>8) {
		  System.out.println("password should contain 8 characters");
		  isValid = false;
	  }else {
		  isValid = true;
	  }
	return isValid;
	  
	  
  }

	public Login() {
		super();
		System.out.println("=====================================================================");
		System.out.println("WELCOME TO " + bankName );
		System.out.println("OUR BANK ID : " + bankId );
		System.out.println("OUR BANK LOCATION :" + bankLocation );
		System.out.println("=====================================================================");
	
	}
	
}