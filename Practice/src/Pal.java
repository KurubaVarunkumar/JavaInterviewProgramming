
public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="varun";
		char ch[]=str.toCharArray();
		String s = "";
		for(int i=0;i<=ch.length-1;i++) {
			s=ch[i]+s;
		}
		System.out.println(s);
	}

}
