import java.util.Arrays;

public class OriginalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,2,1,1,1,2,3,4,4,3,5,5};
		Arrays.sort(arr);
		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		int j=0;
		int count=0;
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]!=temp[j]) {
				j++;
				temp[j]=arr[i];
				count++;
			}
		}
		for(int i=0;i<=count;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
