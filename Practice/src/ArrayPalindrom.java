
public class ArrayPalindrom {
	public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int arr1[]=new int [arr.length];
	for(int i=0;i<=arr.length-1;i++) {
		arr1[i]=arr[arr.length-1-i];
	}
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr1[i]+" ");
	}
	for(int i=0;i<=arr.length-1;i++) {
		if(arr1[i]==arr[i]) {
			System.out.print(" array palindrom");
		}
		else {
			System.out.println("array is not palindrom");
			break;
		}
	}
	
	}
}
