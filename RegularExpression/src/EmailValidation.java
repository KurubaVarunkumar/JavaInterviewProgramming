
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.regex.*;
class EmailValidation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter email");
        String str=scan.nextLine();
        String emailRegExp="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z]+([.][a-zA-Z]+)+";
        Pattern p =Pattern.compile(emailRegExp);
        Matcher m=p.matcher(str);
        if(m.find()&&m.group().equals(str)){
            System.out.println("valid");
        }else{
            System.out.println("Not valid");
        }
    }
}
