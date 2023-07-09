package overloadinghomeassignments;

public class StudentInfo {
	public void getStudentInfo(int id) {
		System.out.println("student id: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("student id: "+id+"name is:" +name);
	}
	public void getStudentInfo(String email , float phonenumber) {
		System.out.println("email id: "+email+ "phonenumber is: "+phonenumber);
		
	}
public static void main(String[] args) {
	StudentInfo SI=new StudentInfo();
	SI.getStudentInfo(2037660);
	SI.getStudentInfo(2037660, "Yasini");
	SI.getStudentInfo("yasinyasin56911@gmail.com", 9944241137f);
}
}
