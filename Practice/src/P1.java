
public class P1 {

	public static void main(String[] args) {
		int r=5;
		int $a=10;
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<=r;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
