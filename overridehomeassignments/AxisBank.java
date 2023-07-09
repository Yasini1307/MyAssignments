package overridehomeassignments;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("My deposite amount in AxisBank");
	}
	
public static void main(String[] args) {
	AxisBank ab=new AxisBank();
	ab.deposit();
	ab.fixed();
	ab.savings();
	

BankInfo bi=new BankInfo();
bi.deposit();
}
}
