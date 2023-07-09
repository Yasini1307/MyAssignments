package orgsystem;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("This is desktop size");
	}
	public static void main(String[] args) {
		Desktop dt=new Desktop();
		dt.computerModel();
		dt.desktopSize();
		
		
	}

}
