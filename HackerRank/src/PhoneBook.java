import java.util.*;
public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Map<String , Integer> hmap=new HashMap<>();
		int n=scan.nextInt();
        scan.nextLine(); // Consume the newline character
		for(int i=0;i<=n-1;i++) {
			String res=scan.nextLine();
			String arr[]=res.split(" ");
			hmap.put(arr[0],Integer.parseInt(arr[1]));
		}
		
		System.out.println("Enter how many times you want to check:");
        int times = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        int total = 0;
        for (int i = 0; i < times; i++) {
            System.out.println("Enter query name:");
            String queryName = scan.nextLine();
            
            if (hmap.containsKey(queryName)) {
                System.out.println(queryName + "=" + hmap.get(queryName));
                total += hmap.get(queryName);
            } else {
                System.out.println(queryName + " not found");
            }
        }

        System.out.println("Total: " + total);
    }
}