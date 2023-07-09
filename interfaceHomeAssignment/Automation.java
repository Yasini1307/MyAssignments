package interfaceHomeAssignment;

public class Automation extends MultipleLanguage{


	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("i am learning selenium");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("learning selenium in java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("selenium supports ruby");
		
	}
	
   public static void main(String[] args) {
	   Automation Auto=new Automation();
	   Auto.java();
	   Auto.ruby();
	   Auto.Selenium();
	   Auto.python();
	
}
}
