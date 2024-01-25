import java.util.Arrays;

public class Freq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,2,1,1,1,2,3,4,4,3,5,5};
		Arrays.sort(arr);
		int f[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			if(f[i]==-1) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					count++;
					f[j]=-1;
				}
			}
			f[i]=count;
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(f[i]!=-1) {
				System.out.print(arr[i]+"--"+f[i]+" ");
			}
		}
	}

}
