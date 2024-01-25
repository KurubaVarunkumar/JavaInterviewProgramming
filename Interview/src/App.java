import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber p=new PrimeNumber();
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter a number for checking the prime or not");
		int n=scan.nextInt();
		int result=p.checkPrimeNumber(n);
		
		if(result==0) {
			System.out.println( n+" is not prime number");
		}else {
			System.out.println(n+ " is prime number");
		}
	}

}
