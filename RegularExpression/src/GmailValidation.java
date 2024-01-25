import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Enter Gmail");
	        String str=scan.nextLine();
	        String gmailRegExp="[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";
	        Pattern p =Pattern.compile(gmailRegExp);
	        Matcher m=p.matcher(str);
	        if(m.find()&&m.group().equals(str)){
	            System.out.println("valid");
	        }else{
	            System.out.println("Not valid");
	        }
	}

}
