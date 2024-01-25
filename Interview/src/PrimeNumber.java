
public class PrimeNumber {
	static int checkPrimeNumber(int n) {
		if(n==0||n==1) {
			return 0;
			}
		else if(n==2){
			return 1;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%2==0) {
					return 0;
				}
			}
		}
		return 1;
	}
}
