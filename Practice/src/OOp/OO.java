package OOp;

public class OO {
	
	private	int id;
	private String name;
	private String phNo;
	
	
	public OO(int id,String name, String phNo) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.phNo=phNo;
	}
		
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public void setPhno(String phno) {
		this.phNo=phno;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhno() {
		return phNo;
	}
	public String toString() {
		return id+" "+name+" "+phNo;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	OO o=new OO(1,"tharun","7777777777");
	
		o.setId(1__1);
		o.setName("varun");
		o.setPhno("8639285999");
		System.out.println(o.id+" "+o.name+" "+o.phNo);
		System.out.println(o);
		
		
	}

}
