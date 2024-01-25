import java.util.Scanner;

public class Weird {
	 static String check(int n) {
		 if(n%2==1) {
			 return "Weird";
		 }
		 else if(n%2==0||n>=2&n<=5) {
			 return "Not Weird";
		 }
		 else if(n%2==0||n>=6&n<=20) {
			 return "Weird";
		 }
		 else {
			 return "not Weird";
		 }
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String str=check(n);
		System.out.println(str);
	}

}
