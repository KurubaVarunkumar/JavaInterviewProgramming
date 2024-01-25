import java.util.regex.*;
public class R1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbabab");
		int count=0;
		while(m.find()) {
			count++;
			System.out.println(m.start());
		}
		System.out.print(count);
	}

}
