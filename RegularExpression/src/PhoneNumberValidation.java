import java.util.*;
import java.util.regex.*;
public class PhoneNumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter phone number");
		String mobile=scan.nextLine();
		String mobileReg="(0|91)?[7-9][0-9]{9}";
		Pattern p=Pattern.compile(mobileReg);
		Matcher m=p.matcher(mobile);
		if(m.find()&&m.group().equals(mobile)) {
			System.out.println("Valid");
		}else{
			System.out.println("Not Valid");
		}
	}

}
