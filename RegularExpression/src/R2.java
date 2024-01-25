import java.util.regex.*;
public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String x="[a]";
//		String x="[ab]";
//		String x="[abc]";
//		String x="[^a]";
//		String x="[^abc]";
//		String x="[a-z]";
//		String x="[a-zA-Z]";
//		String x="[a-zA-Z0-9]";
//		String x=".";
//		String x="\\s";
//		String x="\\S";
//		String x="\\d";
//		String x="\\D";
		String x="\\w";
		Pattern p=Pattern.compile(x);
		Matcher m=p.matcher("a7 b@z#9");
		while(m.find()) {
			System.out.println(m.start()+"............"+m.group());
		}
	}

}
