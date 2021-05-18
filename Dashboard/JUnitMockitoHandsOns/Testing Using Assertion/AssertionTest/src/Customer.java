import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
	private String aadharCardNo;
	private String firstName;
	private String lastName;
	private String address;
	private long mobileNo;
	private String emailId;
	
	
	public Customer(String aadharCardNo, String firstName, String lastName, 
	                String address, long mobileNo,String emailId) {
		super();
		this.aadharCardNo = aadharCardNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getLastName() {
		return lastName;
	}


	private static Pattern aadhaarPattern = Pattern.compile("^[2-9]{1}[0-9]{11}$");

	
	public static boolean isValidAadharNo(String name) {
	    Matcher matcher = aadhaarPattern.matcher(name);
	    return matcher.find();
	}
  

}



