import java.util.regex.*;
public class predefindCharactersRegExg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String x=".";
//		String x="\\s";
//		String x="\\S";
//		String x="\d";
//		String x="\\w";
//		String x="\\W";

		
		Pattern p=Pattern.compile("\\.");
		Matcher m=p.matcher("a7b k@9");
		if(m.find()) {
			System.out.println(m.start()+".................."+m.group());
		}
	}

}
