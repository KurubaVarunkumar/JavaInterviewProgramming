package Exception;
import java.util.*;
public class Demo {
	void takeM() {
	try {
	Scanner scan=new Scanner(System.in);
	int acc=1111;
	int pwd=1729;
	int iA=scan.nextInt();
	int iP=scan.nextInt();
	int c=iA/iP;
	if(Demo.isClosed()) {
		throw new CustomizeExp(" fdsfdsfds");
	}
	}
	catch (CustomizeExp e) {
		 System.out.println("Caught CustomException: ");
	}
	

	}
}
