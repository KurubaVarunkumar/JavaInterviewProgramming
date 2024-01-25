import java.util.*;
public class MealClassCal {
	static double calMealPrice(int basePrice, int Tip, int Tax) {
		double total=basePrice+(basePrice*Tip/100)+(basePrice*Tax/100);
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int basePrice=scan.nextInt();
		int TipPer=scan.nextInt();
		int TaxPer=scan.nextInt();
		double result=calMealPrice(basePrice,TipPer,TaxPer);
		int totalMealPrice=(int) Math.round(result);
		System.out.println(totalMealPrice);
		
	}

}
