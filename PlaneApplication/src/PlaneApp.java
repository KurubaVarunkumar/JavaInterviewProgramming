
public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to achive true poly
		Controll c=new Controll();
		c.acceptInstance(new PassingerPlane());
		c.acceptInstance(new CargoPlane());
		c.acceptInstance(new FightPlane());
		
		
	}

}
