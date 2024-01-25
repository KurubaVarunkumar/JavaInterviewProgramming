package OOp;

public class App {
		static{
			System.out.println("static block");
		}
		static void greet() {
			System.out.println("static metod");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Child();
		Child c=(Child)p;
		p.print();
		c.specif();
		
	}

}
